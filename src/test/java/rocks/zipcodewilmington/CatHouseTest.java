package rocks.zipcodewilmington;

import org.junit.*;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */

public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Before
    public void before() throws Exception {
        CatHouse.clear();
    }

    @After
    public void after() throws Exception {
        CatHouse.clear();
    }

    @Test
    public void testAddCat(){
        Cat newCat = new Cat(null,null,null);

        CatHouse.add(newCat);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemoveCat(){
        Cat newCat = new Cat(null,null,null);

        CatHouse.remove(newCat);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemoveCatById(){
        Cat newCat = new Cat(null,null,10);
        CatHouse.add(newCat);
        CatHouse.remove(10);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 0;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetCatById(){
        Cat newCat = new Cat(null,null,10);
        CatHouse.add(newCat);
        CatHouse.getCatById(10);
        Cat actual =   CatHouse.getCatById(10);
        Cat expected = newCat;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testNumberOfCats(){
        Cat newCat = new Cat(null,null,10);
        Cat newCat1 = new Cat(null,null,9);
        Cat newCat2 = new Cat(null,null,8);
        CatHouse.add(newCat);
        CatHouse.add(newCat1);
        CatHouse.add(newCat2);
        CatHouse.getCatById(10);
        Integer actual =  CatHouse.getNumberOfCats();
        Integer expected = 3;
        Assert.assertEquals(expected,actual);
    }



}
