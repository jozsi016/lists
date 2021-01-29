package hu.jnagy.lists;

import org.junit.Assert;
import org.junit.Test;

public class NumberProviderTest {

    @Test
    public void provideNegativeNumberWhenTrue() {
        //Given
        NumberProvider numberProvider = new NumberProvider();
        //When
        int actual = numberProvider.provide(true);
        //Then
        Assert.assertTrue(actual < 0);
    }

    @Test
    public void providePositiveNumberWhenFalse() {
        //Given
        NumberProvider numberProvider = new NumberProvider();
        //When
        int actual = numberProvider.provide(false);
        //Then
        Assert.assertTrue(actual >= 0);
    }

}