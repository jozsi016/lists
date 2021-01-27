package hu.jnagy.lists;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SumOfListsTest {
    List<Integer> list;
    SumOfLists sumOfLists;

    @Before
    public void setUp() {
        sumOfLists = new SumOfLists();
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
        IntStream list = new Random(1).ints(1, 5).limit(5);
        //When
        int sum = sumOfLists.getSumOfRandomNumbers(list);
        //Then
        assertTrue(5 <= sum);
    }
}
