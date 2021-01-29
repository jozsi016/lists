package hu.jnagy.lists;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SumOfListsTest {
    List<Integer> list;
    SumOfLists sumOfLists;

    @Before
    public void setUp() {
        sumOfLists = new SumOfLists(null);
    }

    @Test
    public void shouldSumListByAddition() {
        //Given
        list = Arrays.asList(1, 2, 3, 4, 5);
        //When
        int sum = sumOfLists.getSumOfList(list);
        //then
        assertThat(15, is(sum));
    }

    @Test
    public void shouldSumCubeOfListElements() {
        //Given
        list = Arrays.asList(1, 2, 3, 4, 5);
        //When
        int sumOfCube = sumOfLists.getSumCubeOfList(list);
        //then
        assertThat(55, is(sumOfCube));
    }

    @Test
    public void shouldSumListNegateValueByAddition() {
        //Given
        list = Arrays.asList(1, 2, 3, 4, 5);
        //When
        int sumOfNegate = sumOfLists.getSumOfListNegate(list);
        //then
        assertThat(-15, is(sumOfNegate));
    }

    @Test
    public void shouldSumMultiplyOfListElements() {
        //Given
        list = Arrays.asList(1, 2, 3, 4, 5);
        //When
        int sumMultiply = sumOfLists.getSumMultiplyOfListElements(list);
        //Then
        assertThat(120, is(sumMultiply));
    }

    @Test
    public void shouldSumOfRandomNumberList() {
        //Given
        NumberProvider mockNumberProvider = Mockito.mock(NumberProvider.class);
        Mockito.when(mockNumberProvider.provide(false)).thenReturn(1);
        sumOfLists = new SumOfLists(mockNumberProvider);
        //When
        int sum = sumOfLists.getSumOfRandomNumbers();
        //Then
        assertTrue(3 == sum);
    }

    @Test
    public void whenExceptionThenReturnZero() {
        //Given
        NumberProvider mockNumberProvider = Mockito.mock(NumberProvider.class);
        Mockito.when(mockNumberProvider.provide(false)).thenReturn(1).thenReturn(2).thenThrow(new RuntimeException());
        sumOfLists = new SumOfLists(mockNumberProvider);
        //When
        int sum = sumOfLists.getSumOfRandomNumbers();
        //Then
        Mockito.verify(mockNumberProvider, Mockito.times(3)).provide(false);
        Assert.assertThat(sum, Is.is(0));
    }

    @Test
    public void whenSumOfListSetNegateTrueThenNegative() {
        //Given
        NumberProvider mockNumberProvider = Mockito.mock(NumberProvider.class);
        Mockito.when(mockNumberProvider.provide(true)).thenReturn(-1);
        sumOfLists = new SumOfLists(mockNumberProvider);
        sumOfLists.setNegate(true);
        //When
        int sum = sumOfLists.getSumOfRandomNumbers();
        //Then
        assertThat(sum, Is.is(-3));
        Mockito.verify(mockNumberProvider, Mockito.times(3)).provide(true);
    }
}
