package ru.hm_1.services;

public class CreateAnimalServiceImpl implements CreateAnimalService {

    public void addAnimal(int n) {
        for (int i = 0; i < n; i++) {
            randomAnimal();
        }
    }
    @Override
    public void createAnimals() {
        int i = 0;
        do {
            randomAnimal();
            i++;
        } while (i < 10);
    }
}
