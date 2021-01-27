package hu.jnagy.lists;

import java.util.List;

public class SumOfLists {
    public int getSumOfList(List<Integer> list) {
        return list.stream().mapToInt(i -> i).sum();
        //return list.stream().reduce(0, (x,y) -> x+y);
        //return list.stream().reduce(0, Integer::sum);
        //return list.stream().mapToInt(Integer::intValue).sum();
    }
}
