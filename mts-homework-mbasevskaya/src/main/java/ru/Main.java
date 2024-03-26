package ru;
import ru.hm_1.services.CreateAnimalServiceImpl;
import ru.hm_1.services.CreateAnimalService;

public class Main {

    public static void main(String[] args) {
        CreateAnimalService createAnimalService = new CreateAnimalService(){};
        createAnimalService.createAnimals();
        CreateAnimalServiceImpl createAnimalServiceImp = new CreateAnimalServiceImpl();
        createAnimalServiceImp.createAnimals();
        createAnimalServiceImp.createAnimalWithAmount(2);
    }
}

