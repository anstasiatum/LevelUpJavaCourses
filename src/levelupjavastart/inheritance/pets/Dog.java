package levelupjavastart.inheritance.pets;

public class Dog extends Pet {
    String Breed = "Golden retriever";

    public Dog(String name, int age) {
        super(name, age, AnimalType.DOG);
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Breed: " + Breed);
        System.out.println();
    }


    public void makeNoise() {
        if (isHungry) {
            System.out.println(name + " is barking. He is hungry!");
        } else {
            System.out.println(name + " is silent, he isn't hungry.");
        }
    }

    public void wagTail() {
        System.out.println(name + " is wagging his tail.");
    }
}
