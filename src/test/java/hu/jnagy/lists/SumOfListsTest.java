package hu.jnagy.lists;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/*
*   Egy rendszer ami kiszamolja egy list oszeget!
    a negyzet minden elemre aztan oszegzes
    lista osszes elmenek a elentes elojelenek osszeget
    osszeselemenek a szorzata !
    veletlen szamokat general es osszeasja!
* */
public class SumOfListsTest {
    List list;
    SumOfLists sumOfLists;

    @Before
    public void setUp(){
        sumOfLists = new SumOfLists();
    }

    @Test
    public void shouldSumListByAddition() {
        //Given
        list = Arrays.asList(1,2,3,4,5);
        //When
        int sum = sumOfLists.getSumOfList(list);
        //then
        assertThat(15, is(sum));
    }
}
