package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void AnimalCreatDogTest(){

        String testAnimalName = "Dog";
        Date DogBirthday = new Date();

        Dog dog = AnimalFactory.createDog(testAnimalName,DogBirthday);

        String actualName = testAnimalName;
        Date actualBDay = DogBirthday;

        Assert.assertEquals(actualName,dog.getName());
        Assert.assertEquals(actualBDay,dog.getBirthDate());

    }

    @Test
    public void AnimalCreatCatTest(){

        String testAnimalName = "Cat";
        Date catBirthday = new Date();

        Cat cat = AnimalFactory.createCat(testAnimalName,catBirthday);

        String actualName = testAnimalName;
        Date actualBDay = catBirthday;

        Assert.assertEquals(actualName,cat.getName());
        Assert.assertEquals(actualBDay,cat.getBirthDate());

    }




}
