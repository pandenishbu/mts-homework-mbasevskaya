package ru.hm_1.AnimalExceptions;

public class InvalidAnimalBirthDateException extends Exception {
    public InvalidAnimalBirthDateException(String message) {
        super(String.format("у животного %s не указана дата его рождения", message));
    }
}
