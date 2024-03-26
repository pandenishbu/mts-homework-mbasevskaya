package ru.hm_1;

import ru.hm_1.AnimalExceptions.InvalidAnimalBirthDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class AbstractAnimal implements Animal{
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;
    protected LocalDate birthDate;

    public AbstractAnimal(String breed, String name, Double cost, String character, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
        this.birthDate = birthDate;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public LocalDate getBirthDate() throws InvalidAnimalBirthDateException{
        if (birthDate == null) {
            throw new InvalidAnimalBirthDateException(breed);
        }
        return birthDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "порода:" + breed + ", имя: " + name  + ", цена: " + cost + ", характер:" + character + ", дата рождения:" + DateFormatter.format(birthDate);
    }

}
