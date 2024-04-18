package ru.hm_1.services;

import ru.hm_1.AbstractAnimal;
import ru.hm_1.AnimalExceptions.InvalidAnimalBirthDateException;
import ru.hm_1.AnimalExceptions.InvalidAnimalException;

public interface SearchService {
    void checkLeapYearAnimal(AbstractAnimal animal) throws InvalidAnimalException, InvalidAnimalBirthDateException;
}
