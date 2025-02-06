package levelupjavastart.generics;

import java.io.Serializable;

public class Animal implements Serializable {
    private String animalName;
    private double animalWeight;
    private String ownerName;

    public Animal(double animalWeight, String animalName, String ownerName) {
        this.animalWeight = animalWeight;
        this.animalName = animalName;
        this.ownerName = ownerName;
    }
}
