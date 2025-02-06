package levelupjavastart.inheritance.pets;

public class Cat extends Pet {

    String favouriteToy = "Mouse";

    public Cat(String name, int age) {
        super(name, age, AnimalType.CAT);
    }

    @Override
    public void makeNoise() {
        if (isHungry) {
            System.out.println(name + " is meowing. She is hungry!");
        } else {
            System.out.println(name + " is silent, she isn't hungry.");
        }
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Favourite Toy: " + favouriteToy);
        System.out.println();
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

}
