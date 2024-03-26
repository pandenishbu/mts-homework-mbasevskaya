package ru.hm_1;

import java.time.LocalDate;

public class Predator extends AbstractAnimal{
    public Predator(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
        aboutPredator();
    }

    public void aboutPredator() {
        System.out.println("Я Predator");
    }
}
