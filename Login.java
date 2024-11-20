package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//HW Nov 19.2. Navigate to
// https://ecommerce-playground.lambdatest.io/index.php?route=account/login
// and complete the login flow for the users.
public class Login {

    WebDriver driver = new ChromeDriver();

    @Test
    void userLogin()
    {
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");
        WebElement userName=driver.findElement(By.id("input-email"));
        userName.sendKeys("henny_qa@yopmail.com");
        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("BlueMoon123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
        loginBtn.click();
    }

}
