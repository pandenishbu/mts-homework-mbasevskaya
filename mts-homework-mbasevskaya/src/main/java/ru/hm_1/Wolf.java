package ru.hm_1;

import java.time.LocalDate;

public class Wolf extends Predator{
    public Wolf(String breed, String name, Double cost, String character, LocalDate birthDate) {
        super(breed, name, cost, character, birthDate);
    }

    @Override
    public void aboutPredator() {
        System.out.println("Я вооолк");
    }
}