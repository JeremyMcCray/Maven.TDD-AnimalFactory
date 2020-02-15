package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        String givenName = "kitty" ;


        Cat testCat = new Cat(null,null,null);

        testCat.setName(givenName);

        String catName = testCat.getName();

        Assert.assertEquals(catName,givenName);
    }

    @Test
    public void catSpeakTest(){
        Cat testCat = new Cat(null,null,null);

        String expected = "meow!";

        String actual = testCat.speak();


        Assert.assertEquals(actual,expected);
    }

    @Test
    public void setCatBirthdayTest(){
        Date catBirthday = new Date();
        Cat testCat = new Cat(null,null,null);

        testCat.setBirthDate(catBirthday);

        Date expected = catBirthday;
        Date actual = testCat.getBirthDate();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void catEatTest(){
        Cat testCat = new Cat(null,null,null);
        Food newFood = new Food();
        Integer expected = testCat.getNumberOfMealsEaten()+1;
        testCat.eat(newFood);

        Assert.assertEquals(expected,testCat.getNumberOfMealsEaten());

    }

    @Test
    public void getCatIdTest() {
        Cat testCat = new Cat(null, null, null);
        Integer actual = testCat.getId();

        Integer expected = testCat.getId();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void catInstanceOfAnimal() {
        Cat testCat = new Cat(null, null, null);
        Boolean actual = testCat instanceof Animal;

        Boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void catInstanceOfMammal() {
        Cat testCat = new Cat(null, null, null);
        Boolean actual = testCat instanceof Mammal;

        Boolean expected = true;

        Assert.assertEquals(actual, expected);
    }
}
