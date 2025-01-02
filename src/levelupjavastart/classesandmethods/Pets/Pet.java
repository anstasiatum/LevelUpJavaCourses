package levelupjavastart.classesandmethods.Pets;

public class Pet {

    String name;
    int age;
    boolean isHungry = true;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String makeNoise(String animalType) {

        if (isHungry) {
            String noise = "none";
            if (animalType.equals("cat")) {
                noise = "meowing";
            } else if (animalType.equals("dog")) {
                noise = "barking";
            } else if (animalType.equals("parrot")) {
                noise = "chirping";
            }

            return (name + " is " + noise + ". She is hungry!");
        } else {
            return (name + " is silent, she isn't hungry.");
        }
    }

    public void eat(/*food*/) {
        if (isHungry) {
            System.out.println(name + " is fed and happy!");
            isHungry = false;
        } else {
            System.out.println(name + "is not hungry, she won't eat.");
        }
    }

    public void sleep() {
        System.out.println("Your pets are asleep");
    }
}