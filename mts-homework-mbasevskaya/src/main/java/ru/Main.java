package ru;
import ru.hm_1.AnimalExceptions.InvalidAnimalBirthDateException;
import ru.hm_1.AnimalExceptions.InvalidAnimalException;
import ru.hm_1.services.CreateAnimalServiceImpl;
import ru.hm_1.services.CreateAnimalService;
import ru.hm_1.services.SearchServiceImpl;

import ru.hm_1.Cat;

import java.time.LocalDate;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) throws InvalidAnimalException, InvalidAnimalBirthDateException {
//        CreateAnimalService createAnimalService = new CreateAnimalService(){};
//        createAnimalService.createAnimals();
//        CreateAnimalServiceImpl createAnimalServiceImp = new CreateAnimalServiceImpl();
//        createAnimalServiceImp.createAnimals();
//        createAnimalServiceImp.createAnimalWithAmount(2);
        SearchServiceImpl searchServiceImpl = new SearchServiceImpl();
        Cat cat = new Cat("Main coon", "Elma", 2.22, "", LocalDate.parse("2021-03-03"));
        try {
            searchServiceImpl.checkLeapYearAnimal(cat);
        } catch (InvalidAnimalBirthDateException e) {
            out.println(e.getMessage());
        }
    }
}

