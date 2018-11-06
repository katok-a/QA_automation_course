package HomeTasks.Task_16.Tests;

import HomeTasks.Task_16.Massive;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Objects;


public class Massive_testNG {
    Massive mass;

    @BeforeSuite

    @AfterSuite

    @BeforeTest
    public void setUpMass() {
        mass = new Massive();
    }

    @AfterTest
    public void tearDownMass() {
        mass = null;
    }

    @BeforeGroups

    @AfterGroups

    @BeforeClass

    @AfterClass

    @BeforeMethod

    @AfterMethod

    @Test
    public void testWordsInString() {
//        Massive mass = new Massive();
        mass.str = "This is a test String";
        int exp_length = 5;
        Assert.assertEquals(exp_length, mass.wordsInString());
    }

    @Test
    public void testNotWordsInString() {
        //      Massive mass = new Massive();
        mass.str = "This is a another test String";
        int exp_length = 1;
        Assert.assertNotEquals(exp_length, mass.wordsInString());
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testWordsInStringException() {
        Massive mass = new Massive();
        int exp_length = 5;
        Assert.assertEquals(exp_length, mass.wordsInString());
    }


    @Test
    public void testWordsInSrtingReloaded() {
        //   Massive mass = new Massive();
        int exp_length = 7;
        Assert.assertEquals(exp_length, mass.wordsInString("This is a test for reloaded method."));
    }

    @Test
    public void testNotWordsInSrtingReloaded() {
        //    Massive mass = new Massive();
        int exp_length = 1;
        Assert.assertNotEquals(exp_length, mass.wordsInString("This is another test for reloaded method."));
    }

    @Test(timeOut = 1000)
    public void testBubbleSort() {
        //    Massive mass = new Massive();
        mass.intArray = new int[]{3, 5, 7, 1, 2, 6, 4};
        int[] exp_array = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assert.assertEquals(mass.bubbleSort(), exp_array);
    }

    @Test
    public void testNotBubbleSort() {
        //    Massive mass = new Massive();
        mass.intArray = new int[]{3, 5, 7, 1, 2, 6, 4};
        int[] exp_array = new int[]{3};
        Assert.assertNotEquals(mass.bubbleSort(), exp_array);
    }

    @Test
    public void testInsertionSort() {
        Massive mass = new Massive(new int[]{5, 7, 1, 2, 6, 4, 3});
        int[] exp_array = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assert.assertEquals(mass.insertionSort(), exp_array);
    }

    @Test
    public void testNotInsertionSort() {
        Massive mass = new Massive(new int[]{5, 7, 1, 2, 6, 4, 3});
        int[] exp_array = new int[]{1};
        Assert.assertNotEquals(mass.insertionSort(), exp_array);
    }

    @Test
    public void testMaxMinSort() {
        Massive mass = new Massive(new int[]{5, 7, 1, 2, 6, 4, 3});
        int[] exp_array = new int[]{1, 2, 3, 4, 5, 6, 7};
        Assert.assertEquals(mass.minMaxSorting(), exp_array);
    }

    @Test
    public void testNotMaxMinSort() {
        Massive mass = new Massive(new int[]{5, 7, 1, 2, 6, 4, 3});
        int[] exp_array = new int[]{7};
        Assert.assertNotEquals(mass.minMaxSorting(), exp_array);
    }

    @Test
    public void testDigitsInInt() {
        //      Massive mass = new Massive();
        int exp_digits = 3;
        Assert.assertEquals(mass.digitsInInt(-110), exp_digits);
    }

    @Test
    public void testNotDigitsInInt() {
        //      Massive mass = new Massive();
        int exp_digits = 3;
        Assert.assertNotEquals(mass.digitsInInt(1), exp_digits);
    }

    @DataProvider(name = "data")
    public Object[][] getData() {
        return new Object[][]{
                {1}, {2}, {3}, {5}, {11}};
    }

    @Test(dataProvider = "data")
    public void testIsPrime(Integer number) {
        //   Massive mass = new Massive();
        Assert.assertTrue(mass.isPrime(number));
    }

    @DataProvider(name = "data2")
    public Object[][] getData2() {
        return new Object[][]{
                {4}, {6}, {8}, {10}, {22}};
    }

    @Test(dataProvider = "data2")
    public void testIsNotPrime(Integer number) {
        //    Massive mass = new Massive();
        Assert.assertFalse(mass.isPrime(number));
    }

    @Test
    public void testCountPrimeNumbers() {
        Massive mass = new Massive(new int[]{1, 2, 3, 4, 5, 6, 9, 11, 31});
        int exp_count = 6;
        Assert.assertEquals(mass.countPrimeNumbers(), exp_count);
    }

    @Test
    public void testFalseIsOnlyEven() {
        Massive mass = new Massive(new int[]{1, 6, 8, 12, 22, 80, 98});
        Assert.assertFalse(mass.isOnlyEven());
    }

    @Test
    public void testIsOnlyEven() {
        Massive mass = new Massive(new int[]{2, 6, 8, 12, 22, 80, 98});
        Assert.assertTrue(mass.isOnlyEven());
    }

    @Test
    public void testOddEqualEven() {
        Massive mass = new Massive(new int[]{1, 2, 7, 8, 13, 14});
        Assert.assertTrue(mass.isOddEqualEven());
    }

    @Test
    public void testFalseOddEqualEven() {
        Massive mass = new Massive(new int[]{1, 2, 7, 8, 13, 14, 7});
        Assert.assertFalse(mass.isOnlyEven());
    }

    @Test
    public void testOddEvenRation() {
        Massive mass = new Massive(new int[]{4, 3, 5, 7});
        double exp_ration = 0.34;
        Assert.assertEquals(mass.evenOddRatio(), exp_ration, 0.01);
    }

    @Test
    public void testWordsInArray() {
        Massive mass = new Massive(new String[]{"test", "test1 test2", " 1 ", "test1 test2 test3"});
        int exp_count = 7;
        Assert.assertEquals(mass.wordsInArray(), exp_count);
    }

    @Test
    public void testNotNull() {
        //      Massive mass = new Massive();
        Assert.assertNotNull(mass);
    }

    @Test
    public void testNull() {
        Massive mass = new Massive();
        Assert.assertNull(mass.intArray);
    }

    @Test(enabled = false)
    public void test() {
        //      Massive mass = new Massive();
        Massive mass2 = mass;
        Assert.assertSame(mass, mass2);
    }

}
