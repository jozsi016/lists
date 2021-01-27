package hu.jnagy.lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfLists {
    public int getSumOfList(List<Integer> list) {
        return list.stream().mapToInt(i -> i).sum();
        //return list.stream().reduce(0, (x,y) -> x+y);
        //return list.stream().reduce(0, Integer::sum);
        //return list.stream().mapToInt(Integer::intValue).sum();
    }

    public int getSumCubeOfList(List<Integer> list) {
        return list.stream().mapToInt(i -> i*i).sum();
    }

    public int getSumOfListNegate(List<Integer> list) {
        return list.stream().mapToInt(i -> -i).sum();

    }

    public int getSumMultiplyOfListElements(List<Integer> list) {
        return list.stream().reduce(1,(x,y) -> x*y);
    }

    public int getSumOfRandomNumbers(IntStream list) {
        return Arrays.stream(list.toArray()).sum();
    }
}
