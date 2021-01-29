package hu.jnagy.lists;

import java.util.Random;

public class NumberProvider {
    public int provide() {
        return new Random().nextInt();
    }

    public int provide(boolean b) {
        return Math.abs(new Random().nextInt()) * (b ? -1 : 1);
    }
}
