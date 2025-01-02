package levelupjavastart.inheritance.Pets;

import java.util.Scanner;

public class Pets {

    public static void main(String[] args) {

        Cat cat = new Cat("Kitty", 3);
        Dog dog = new Dog("Doggy", 1);
        Parrot parrot = new Parrot("Captain Morgan", 1);
        Pet[] pets = new Pet[]{cat, dog, parrot};

        for (Pet a : pets) {
            a.printInfo();
        }

        for (Pet a : pets) {
            a.makeNoise();
        }

        System.out.println();
        System.out.println("Do you want to feed them? y/n");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        if (answer.equals("y")) {
            for (Pet a : pets) {
                PetOwner.feed(a);
            }
            for (Pet a : pets) {
                a.sleep();
            }
        } else {
            for (Pet a : pets) {
                a.makeNoise();
            }
            cat.play();
            dog.wagTail();
            parrot.fly();
        }

    }
}
