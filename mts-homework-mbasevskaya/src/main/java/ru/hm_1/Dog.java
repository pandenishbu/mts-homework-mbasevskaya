package ru.hm_1;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public void aboutPet() {
        System.out.println("Я собака");
    }
}