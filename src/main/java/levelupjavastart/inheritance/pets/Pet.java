package levelupjavastart.inheritance.pets;

public abstract class Pet {

    String name;
    int age;
    boolean isHungry = true;
    public enum AnimalType {
        DOG,
        CAT,
        PARROT
    }
    AnimalType animalType;
    static String animal = "Pet";

    public Pet(String name, int age, AnimalType animalType) {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
    }


    public abstract void makeNoise();

    public void eat() {
        if (isHungry) {
            System.out.println(name + " is fed and happy!");
            isHungry = false;
        } else {
            System.out.println(name + " is not hungry, she won't eat.");
        }
    }

    public void printInfo() {
        System.out.println(animal + ", " + name + ", " + animalType + ", " + age + " y.o.");
    }

    public void sleep() {
            System.out.println(name + " is asleep for now.");
    }
}