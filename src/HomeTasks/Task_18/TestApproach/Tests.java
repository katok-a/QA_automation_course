package HomeTasks.Task_18.TestApproach;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

import static HomeTasks.Task_18.TestApproach.GetBookingInfo.driver;
import static HomeTasks.Task_18.TestApproach.GetBookingInfo.isHotels;

/**
 * Created by kotok_artem on 12.11.2018.
 */
public class Tests {
    @BeforeMethod
    public void setUpDriver(){
        WebDriver driver = GetBookingInfo.createDriver("C:\\Java\\Chrome_Server\\chromedriver.exe");
    }
    @AfterMethod
    public void CloseWindow(){
        driver.quit();

    }
    @Test
    public void testIsHotels(){
        Assert.assertEquals(true, isHotels());
    }
    @Test
    public void testRating(){
        Assert.assertTrue(GetBookingInfo.getRating()>9.0);
    }
}
