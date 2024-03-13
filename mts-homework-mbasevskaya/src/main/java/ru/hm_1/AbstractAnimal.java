package ru.hm_1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class AbstractAnimal implements Animal{
    protected String breed;//порода
    protected String name; // имя
    protected Double cost;//цена в магазине
    protected String character;//характер
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
    public LocalDate getBirthDate(){
        return birthDate;
    }

    @Override
    public String toString() {
        DateTimeFormatter DateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "порода:" + breed + ", имя: " + name  + ", цена: " + cost + ", характер:" + character + ", дата рождения:" + DateFormatter.format(birthDate);
    }

}
