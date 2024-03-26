
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import ru.hm_1.AnimalExceptions.InvalidAnimalBirthDateException;
import ru.hm_1.AnimalExceptions.InvalidAnimalException;
import ru.hm_1.Cat;
import ru.hm_1.Dog;
import ru.hm_1.Wolf;
import ru.hm_1.services.SearchServiceImpl;


public class SearchServiceImplTest {
    @Test
    @DisplayName("Високосный год")
    public void animalInLeapYear() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        PrintStream save_out=System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Cat cat = new Cat("Main coon", "Elma", 2.22, "", LocalDate.parse("2020-03-03"));
        SearchServiceImpl searchServiceImpl = new SearchServiceImpl();
        searchServiceImpl.checkLeapYearAnimal(cat);

        String expected = "Я кошка\nElma был рожден в високосный год\n";
        assertEquals(expected, out.toString());
    }

    @Test
    @DisplayName("Не високосный год")
    public void animalInNotLeapYear() throws InvalidAnimalException, InvalidAnimalBirthDateException {
        PrintStream save_out=System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Dog dog = new Dog("Dog", "Saint", 2.22, "", LocalDate.parse("2021-03-03"));
        SearchServiceImpl searchServiceImpl = new SearchServiceImpl();
        searchServiceImpl.checkLeapYearAnimal(dog);

        String expected = "Я собака\nSaint не был рожден в високосный год\n";
        assertEquals(expected, out.toString());
    }

    @Test
    @DisplayName("Животное пустое")
    public void animalIsNull()  {
        SearchServiceImpl searchServiceImpl = new SearchServiceImpl();
        InvalidAnimalException exception = assertThrows(InvalidAnimalException.class, () -> searchServiceImpl.checkLeapYearAnimal(null));

        String expected = "на вход пришло некорректный объект животного " + LocalDate.now();
        assertEquals(expected, exception.getMessage());
    }

    @Test
    @DisplayName("Животное с пустым днем рождения")
    public void animalWithNullDateOfBirthday() {
        SearchServiceImpl searchServiceImpl = new SearchServiceImpl();
        Wolf wolf = new Wolf("Wolf", "Boo", 2.22, "", null);

        InvalidAnimalBirthDateException exception = assertThrows(InvalidAnimalBirthDateException.class, () -> searchServiceImpl.checkLeapYearAnimal(wolf));

        String expected = "у животного Wolf не указана дата его рождения";
        assertEquals(expected, exception.getMessage());
    }
}
