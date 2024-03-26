package ru.hm_1.services;

import ru.hm_1.AbstractAnimal;
import ru.hm_1.AnimalExceptions.InvalidAnimalBirthDateException;
import ru.hm_1.AnimalExceptions.InvalidAnimalException;

import java.time.LocalDate;

public class SearchServiceImpl implements SearchService {

    @Override
    public void checkLeapYearAnimal(AbstractAnimal animal) throws InvalidAnimalBirthDateException, InvalidAnimalException {
        if (animal == null) {
            LocalDate currentDate = LocalDate.now();
            throw new InvalidAnimalException("на вход пришло некорректный объект животного " + currentDate);
        }
        int year = animal.getBirthDate().getYear();
        boolean leapYear = (
                year > 1584 &&
                        (
                                (year % 400 == 0) ||
                                        (year %4 == 0 && year % 100 != 0)
                        )
        );
        String result = leapYear ? " был рожден в високосный год": " не был рожден в високосный год";
        System.out.println(animal.getName() + result);
    }
}
