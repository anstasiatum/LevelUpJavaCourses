package levelupjavastart.generics;

public class TVKRunner {
    public static void main(String[] args) {
        TVK <Integer, Animal, Double> tvk = new TVK<>(5, new Animal(), 10.5);
        tvk.printInfo();
    }
}
