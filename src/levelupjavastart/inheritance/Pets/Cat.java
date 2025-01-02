package levelupjavastart.inheritance.Pets;


public class Cat extends Pet {

    String FavouriteToy = "Mouse";

    public Cat(String name, int age) {
        super(name, age, AnimalType.CAT);
    }

    public void makeNoise() {
        if (isHungry) {
            System.out.println(name + " is meowing. She is hungry!");
        } else {
            System.out.println(name + " is silent, she isn't hungry.");
        }
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Favourite Toy: " + FavouriteToy);
        System.out.println();
    }

    public void play() {
        System.out.println(name + " is playing.");
    }

}
