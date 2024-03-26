package ru.hm_1.services;
import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import ru.hm_1.Cat;
import ru.hm_1.Dog;
import ru.hm_1.Shark;
import ru.hm_1.Wolf;

public interface CreateAnimalService {
    String[] breeds  = {"Тигровая", "Персидская", "Мейн кун", "Бульдог", "Дикий", "Дворняга", "Сиамская"};
    String[] names  = {"Вася", "Петя", "Ваня", "Катя", "Вася", "Петя", "Ваня"};
    String[] characters  = {"добрый", "злой", "веселый", "активный", "ест людей", "добрый", "злой"};

    default void createAnimals() {
        int i = 0;
        while (i < 10) {
            randomAnimal();
            i++;
        }
    }

    default void randomAnimal(){
        switch (new Random().nextInt(4)){
            case 0:
                Cat cat = new Cat(breeds[randomNum()], names[randomNum()], randomCost(), characters[randomNum()], randomDate());
                System.out.println(cat);
                break;
            case 1:
                Dog dog = new Dog(breeds[randomNum()], names[randomNum()], randomCost(), characters[randomNum()], randomDate());
                System.out.println(dog);
                break;
            case 2:
                Shark shark = new Shark(breeds[randomNum()], names[randomNum()], randomCost(), characters[randomNum()], randomDate());
                System.out.println(shark);
                break;
            case 3:
                Wolf wolf = new Wolf(breeds[randomNum()], names[randomNum()], randomCost(), characters[randomNum()], randomDate());
                System.out.println(wolf);
                break;
        }
    }

    default int randomNum(){
        int i = new Random().nextInt(7);
        return i;
    }

    default Double randomCost(){
        return (new Random().nextDouble() * 900.0d) + 100.0d;
    }

    default LocalDate randomDate(){
        long minDay = LocalDate.of(2015, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2024, 2, 29).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        return LocalDate.ofEpochDay(randomDay);
    }
}
