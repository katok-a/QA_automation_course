package HomeTasks.Task_15;

import HomeTasks.Task_14.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * Created by kotok_artem on 02.11.2018.
 */
public class TestMassive {
    Massive mass;

    @BeforeClass
    public static void setUp() {
    }

    @Before
    public void setUpMass() {
        mass = new Massive();
    }

    @After
    public void tearDownMass() {
        mass = null;
    }

    @AfterClass
    public static void tearDown() {
    }
    @Ignore
    @Test
    public void testSumOfElements() {
        mass.array = new int[]{1, 3, 5, 6, 8};
        int exp_sum = 23;
        Assert.assertEquals(exp_sum, mass.sumOfElements());
    }

    @Test
    public void testAverageValue() {

        mass.array = new int[]{1, 3, 5, 7};
        double exp_average = 4;
        Assert.assertEquals(exp_average, mass.averageValue(), 0.01);
    }

    @Test(expected = ArithmeticException.class)
    public void testAverageValueZero() {
        mass.array = new int[]{};
        mass.averageValue();
    }

    @Test
    public void testMinMax() {
        int[] buildArray = {1, 3, 5, 6, 8};
        mass = new Massive(buildArray);
        int exp_difference = 7;
        Assert.assertEquals(exp_difference, mass.minMaxDifference());
    }

    @Test
    public void testArrayRevers() {
        int[] testArray = new int[]{1, 3, 5, 7, 9};
        int[] reversTestArray = new int[]{9, 7, 5, 3, 1};
        Assert.assertArrayEquals(reversTestArray, mass.reversArray(testArray));
    }

    @Test
    public void testIsAscending() {
        int[] buildArray = {1, 3, 5, 6, 8};
        Massive mass = new Massive(buildArray);
        Assert.assertTrue(mass.isAscending());
    }

    @Test
    public void testIsNotAscending() {
        int[] buildArray = {1, 9, 5, 6, 8};
        Massive mass = new Massive(buildArray);
        Assert.assertFalse(mass.isAscending());
    }

    @Test
    public void TestWrongAverage() {
        int un_Expected_Value = 0;
        mass.array = new int[]{1, 2, 5};
        Assert.assertNotEquals(un_Expected_Value, mass.averageValue());
    }

    @Test
    public void testNotNull() {
        Assert.assertNotNull(mass);
    }

    @Test
    public void testNull() {
        Assert.assertNotNull(mass.array);
    }
 }
