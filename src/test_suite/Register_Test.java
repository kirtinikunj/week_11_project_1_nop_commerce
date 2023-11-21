package test_suite;

import browser_factory.Base_Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Write down the following test into ‘RegisterTest’
 * class
 * 1. userShouldNavigateToRegisterPageSuccessful
 * ly
 * * click on the ‘Register’ link
 * * Verify the text ‘Register’
 * <p>
 * 2. userSholdRegisterAccountSuccessfully *
 * click on the ‘Register’ link
 * * Select gender radio button
 * * Enter First name
 * * Enter Last name
 * * Select Day Month and Year
 * * Enter Email address
 * * Enter Password
 * * Enter Confirm password
 * * Click on REGISTER button
 * * Verify the text 'Your registration
 * completed’
 */
public class Register_Test extends Base_Test {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {

        // click on the ‘Register’ link
        driver.findElement(By.className("ico-register")).click();

        //Verify the text ‘Register’
        String expectedText = "Register";
        String actualText = driver.findElement(By.xpath("//h1")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {

        //click on the ‘Register’ link
        driver.findElement(By.className("ico-register")).click();

        // Select gender radio button
        driver.findElement(By.className("male")).click();

        // Enter First name
        driver.findElement(By.id("FirstName")).sendKeys("Nik");

        //Enter Last name
        driver.findElement(By.id("LastName")).sendKeys("Patel");

        //Select Day Month and Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("22");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("09");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("2000");

        // Enter Email address
        driver.findElement(By.id("Email")).sendKeys("xyz1023@gmail.com");

        // Enter Password
        driver.findElement(By.id("Password")).sendKeys("xyz1023");

        //Enter Confirm password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("xyz1023");

        //Click on REGISTER button
        driver.findElement(By.id("register-button")).click();

        //Verify the text 'Your registration completed’
        String expectedText = "Your registration completed";
        String actualText = driver.findElement(By.xpath("//div[text()='Your registration completed']")).getText();

        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
