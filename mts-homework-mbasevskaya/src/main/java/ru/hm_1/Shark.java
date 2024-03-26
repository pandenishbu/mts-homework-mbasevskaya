package ru.hm_1;

import java.time.LocalDate;

public class Shark extends Predator{
    public Shark(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public void aboutPredator() {
        System.out.println("Я акула");
    }
}