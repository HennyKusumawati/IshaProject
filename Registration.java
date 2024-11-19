package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//HW Nov 19.1. Navigate to
// https://ecommerce-playground.lambdatest.io/index.php?route=account/register
// and complete the registration for the users.
public class Registration {

    WebDriver driver = new ChromeDriver();

    @Test
    void registrationHW()
    {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        WebElement firstName = driver.findElement(By.id("input-firstname"));
                firstName.sendKeys("Henny");
        WebElement lastName = driver.findElement(By.id("input-lastname"));
                lastName.sendKeys("Kusuma");
        WebElement email = driver.findElement(By.id("input-email"));
                email.sendKeys("henny_qa@yopmail.com");
        WebElement telephone = driver.findElement(By.id("input-telephone"));
                telephone.sendKeys("12345678");
        WebElement password = driver.findElement(By.id("input-password"));
              password.sendKeys("BlueMoon123");
        WebElement passConfirm = driver.findElement(By.id("input-confirm"));
                passConfirm.sendKeys("BlueMoon123");
        WebElement subscribe = driver.findElement(By.xpath("//label[@for='input-newsletter-no']"));
                subscribe.click();
        WebElement privacy = driver.findElement(By.xpath("//label[@for='input-agree']"));
               privacy.click();
        WebElement continueBtn = driver.findElement(By.xpath("//input[@value='Continue']"));
                continueBtn.click();

       //  driver.close();



    }


}
