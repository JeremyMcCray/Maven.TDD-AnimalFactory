package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {





    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void newDogTest() {
        // Given (a name exists and a dog exists)

        String givenName = "Dogger";
        Date givenBirthday = new Date();
        Integer givenDogId = 10;

        // When (a dog's name is set to the given name)

        Dog dog = new Dog(givenName, givenBirthday, givenDogId);

        String actualDogName = dog.getName();
        Date actualDogBirthday = dog.getBirthDate();
        Integer actualDogId = dog.getId();



        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(actualDogName, givenName);
        Assert.assertEquals(actualDogId,givenDogId);
        Assert.assertEquals(actualDogBirthday,givenBirthday);

    }

    @Test
    public void dogSpeakTest(){
        Dog testDog = new Dog(null,null,null);

        String expected = "bark!";
        String actual = testDog.speak();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void dogSetBirthdayTest(){
        Date dogBirthday = new Date();
        Dog testDog = new Dog(null,dogBirthday,null);
        Date expected = dogBirthday;
        Date actual = testDog.getBirthDate();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void dogEatTest(){
      Dog testDog = new Dog(null,null,null);
      Food dogFood = new Food();
      Integer expected = testDog.getNumberOfMealsEaten()+1;

      testDog.eat(dogFood);

      Assert.assertEquals(expected,testDog.getNumberOfMealsEaten());

    }

    @Test
    public void dogIdGetterTest(){
        Dog testDog = new Dog(null,null,10);
        Integer expected = 10;

        Integer actual = testDog.getId();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void dogIsInstanceOfAnimalTest(){
        Dog testDog = new Dog(null,null,null);
        Boolean expected = true;
        Boolean actual = testDog instanceof Animal;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void dogIsInstanceOfMammalTest(){
        Dog testDog = new Dog(null,null,null);
        Boolean expected = true;
        Boolean actual = testDog instanceof Mammal;

        Assert.assertEquals(actual,expected);
    }
}
