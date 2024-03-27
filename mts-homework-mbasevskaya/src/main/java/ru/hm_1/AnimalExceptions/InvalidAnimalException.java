package ru.hm_1.AnimalExceptions;

public class InvalidAnimalException extends RuntimeException{
    public InvalidAnimalException(String message) {
        super(message);
    }
}
