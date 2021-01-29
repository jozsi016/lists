package hu.jnagy.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

public class SumOfLists {
    private NumberProvider provider;
    private boolean negate;

    public SumOfLists(NumberProvider provider) {
        this.provider = provider;
    }

    public int getSumOfList(List<Integer> list) {
        return getSumOfTransfornInts(list, i -> i);
    }

    public int getSumCubeOfList(List<Integer> list) {
        return getSumOfTransfornInts(list, i -> i * i);
    }

    public int getSumOfListNegate(List<Integer> list) {
        return getSumOfTransfornInts(list, i -> -i);

    }

    public int getSumOfTransfornInts(List<Integer> list, ToIntFunction<Integer> transform) {
        return list.stream().mapToInt(transform).sum();

    }

    public int getSumMultiplyOfListElements(List<Integer> list) {
        return list.stream().reduce(1, (x, y) -> x * y);
    }

    public int getSumOfRandomNumbers() {
        List<Integer> numbres = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            try {
                numbres.add(provider.provide(negate));
            } catch (RuntimeException re) {
                return 0;
            }
        }
        return numbres.stream().mapToInt(Integer::new).sum();
    }

    public void setNegate(boolean b) {
        negate = b;
    }

}
