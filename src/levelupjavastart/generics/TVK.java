package levelupjavastart.generics;

import java.io.Serializable;

public class TVK <T extends Comparable <T>, V extends Animal & Serializable, K extends Number> {

    T t;
    V v;
    K k;

    public void printInfo() {
        System.out.println(this.t.getClass().getName());
        System.out.println(this.v.getClass().getName());
        System.out.println(this.k.getClass().getName());
    }
    public T tPrinter() {
        return this.t;
    }
    public V vPrinter() {
        return this.v;
    }
    public K kPrinter() {
        return this.k;
    }

    public TVK(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }
}
