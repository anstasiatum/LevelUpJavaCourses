package levelupjavastart.inheritance.pets;

public class Parrot extends Pet {

    String colour = "Red";

    public Parrot(String name, int age) {
        super(name, age, AnimalType.PARROT);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Pet colour: " + colour);
        System.out.println();
    }

    @Override
    public void makeNoise() {
        if (isHungry) {
            System.out.println(name + " is chirping. She is hungry!");
        } else {
            System.out.println(name + " is silent, she isn't hungry.");
        }
    }

    public void fly() {
        System.out.println(name + " is flying around.");
    }
}