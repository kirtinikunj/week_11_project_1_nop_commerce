package test_suite;

/**
 * Write down the following test into ‘TopMenuTest’
 * class
 * 1. userShouldNavigateToComputerPageSuccessfully
 * <p>
 * * click on the ‘Computers’ Tab
 * * Verify the text ‘Computers’
 * <p>
 * 2. userShouldNavigateToElectronicsPageSuccessfully
 * <p>
 * * click on the ‘Electronics’ Tab
 * * Verify the text ‘Electronics’
 * <p>
 * 3. userShouldNavigateToApparelPageSuccessfully
 * <p>
 * * click on the ‘Apparel’ Tab
 * * Verify the text ‘Apparel’ 4.
 * <p>
 * userShouldNavigateToDigitalDownloadsPageSuccessfully
 * * click on the ‘Digital downloads’ Tab
 * * Verify the text ‘Digital downloads’
 * 5. userShouldNavigateToBooksPageSuccessfully
 * <p>
 * * click on the ‘Books’ Tab
 * * Verify the text ‘Books’
 * <p>
 * 6. userShouldNavigateToJewelryPageSuccessfully
 * <p>
 * * click on the ‘Jewelry’ Tab
 * * Verify the text ‘Jewelry’
 * <p>
 * 7. userShouldNavigateToGiftCardsPageSuccessfully
 * * click on the ‘Gift Cards’ Tab
 * * Verify the text ‘Gift Cards’
 */

import browser_factory.Base_Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class Top_Menu_Test extends Base_Test {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[text()='Computers ']")).click();

        //Verify the text ‘Computers’
        String expectedText = "Computers";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).getText();

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        //click on the ‘Electronics’Tab
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();

        //Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){

        //click on the ‘Apparel’Tab
        driver.findElement(By.xpath("//a[text()='Apparel ']")).click();

        //Verify the text ‘Apparel’
        String expectedText = "Apparel";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){

        //click on the ‘Digital downloads’Tab
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();

        //Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){

        //click on the ‘Books’Tab
        driver.findElement(By.xpath("//a[text()='Books ']")).click();

        //Verify the text ‘Books ’
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){

        //click on the ‘Jewelry’Tab
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();

        //Verify the text ‘Jewelry ’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){

        //click on the ‘Jewelry’Tab
        driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();

        //Verify the text ‘Gift Cards ’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards']")).getText();
        Assert.assertEquals(expectedText, actualText);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
