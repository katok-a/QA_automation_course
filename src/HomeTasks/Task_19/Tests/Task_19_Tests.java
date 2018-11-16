package HomeTasks.Task_19.Tests;

import HomeTasks.Task_19.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static HomeTasks.Task_19.Task_19.*;

public class Task_19_Tests {
    Task_19 AUT = new Task_19();

    @Test(enabled = true)
    public void Test_1() {
        driver = AUT.createDriver();
        AUT.setBasicConditions();
        Assert.assertTrue(AUT.isHotels());
        Assert.assertTrue(AUT.isPriceMatchRating());
        driver.quit();
    }

    @Test(enabled = true)
    public void Test_2() {
        driver = AUT.createDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        AUT.setBasicConditions();
        Assert.assertTrue(AUT.isHighPrice());
    }

    @Test(enabled = true)
    public void Test_3() {
        String expectedErrorMessage = "Введите номер действительной кредитной карты";
        Assert.assertEquals(AUT.bookHotel(), expectedErrorMessage);
        }


}
