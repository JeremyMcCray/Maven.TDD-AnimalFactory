package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`


    @Before
    public void before() throws Exception {
        DogHouse.clear();
    }

    @After
    public void after() throws Exception {
        DogHouse.clear();
    }

    @Test
    public void testAddDog(){
        Dog newDog = new Dog(null,null,null);

        DogHouse.add(newDog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemoveDog(){
        Dog newDog = new Dog(null,null,null);

        DogHouse.remove(newDog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemoveDogById(){
        Dog newDog = new Dog(null,null,10);
        DogHouse.add(newDog);
        DogHouse.remove(10);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetDogById(){
        Dog newDog = new Dog(null,null,10);
        DogHouse.add(newDog);
        DogHouse.getDogById(10);
        Dog actual =   DogHouse.getDogById(10);
        Dog expected = newDog;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testNumberOfDogs(){
        Dog newDog = new Dog(null,null,10);
        Dog newDog1 = new Dog(null,null,9);
        Dog newDog2 = new Dog(null,null,8);
        DogHouse.add(newDog);
        DogHouse.add(newDog1);
        DogHouse.add(newDog2);
        DogHouse.getDogById(10);
        Integer actual =  DogHouse.getNumberOfDogs();
        Integer expected = 3;
        Assert.assertEquals(expected,actual);
    }



}
