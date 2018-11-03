package HomeTasks.Task_15;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(value = Parameterized.class)
public class TestMassiveParametrized {

    @Parameterized.Parameters
    public static Collection<Object> numbers() {
        return Arrays.asList(new Object[][]{{new int[]{1, 2}, "3"}, {new int[]{3, 4}, "7"}, {new int[]{-1, -7}, "-8"}});
    }

    int[] array;
    String expected_sum;

    public TestMassiveParametrized(int[] array, String expected_sum) {
        this.array = array;
        this.expected_sum = expected_sum;
    }

    @Test
    public void test_param_sum() {
        Massive mass = new Massive(array);
        Assert.assertEquals(Integer.parseInt(expected_sum), mass.sumOfElements());
    }

}
