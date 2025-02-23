package levelupjavastart.generics;

import java.io.Serializable;

public class TVK<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {

    private T t;
    private V v;
    private K k;

    public void printInfo() {
        System.out.println(this.t.getClass().getName());
        System.out.println(this.v.getClass().getName());
        System.out.println(this.k.getClass().getName());
    }

    public TVK(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }
}
