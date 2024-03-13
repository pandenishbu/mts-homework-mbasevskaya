package ru.hm_1;

import java.time.LocalDate;

public class Pet extends AbstractAnimal{
    public Pet(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
        aboutPet();
    }

    public void aboutPet() {
        System.out.println("Я Pet");
    }
}
