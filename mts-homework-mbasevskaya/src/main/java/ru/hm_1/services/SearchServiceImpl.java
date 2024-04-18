package ru.hm_1.services;

import ru.hm_1.AbstractAnimal;
import ru.hm_1.AnimalExceptions.InvalidAnimalBirthDateException;
import ru.hm_1.AnimalExceptions.InvalidAnimalException;

import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {

    @Override
    public void checkLeapYearAnimal(AbstractAnimal animal) throws InvalidAnimalBirthDateException {
        if (animal == null) {
            LocalDate currentDate = LocalDate.now();
            throw new InvalidAnimalException("на вход пришло некорректный объект животного " + currentDate);
        }
        if (animal.getBirthDate() == null) {
            throw new InvalidAnimalBirthDateException(animal.getClass().getSimpleName());
        }
        String result = animal.getBirthDate().isLeapYear() ? " был рожден в високосный год": " не был рожден в високосный год";
        System.out.println(animal.getName() + result);
    }
}
