package ru.hm_1;

import ru.hm_1.AnimalExceptions.InvalidAnimalBirthDateException;

import java.time.LocalDate;

public interface Animal {
    String getBreed();
    String getName();
    Double getCost();
    String getCharacter();
    LocalDate getBirthDate() throws InvalidAnimalBirthDateException;
}
