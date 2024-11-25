package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
XPath Axes on website: https://ecommerce-playground.lambdatest.io/index.php?route=common/home
- Ancestor
- Descendant
- Following
- Sibling
- Preceding
- Sibling
    - following - sibling
    - preceding - sibling
 */
public class XPathAxesSelector {
    WebDriver driver = new ChromeDriver();

    @Test
    void findElementByXPath() throws InterruptedException {
        //using Ancestor
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        WebElement title = driver.findElement(By.xpath("//span[@class='title']/ancestor::div[1]/ancestor::a[1]/ancestor::li[1]/ancestor::ul[1]/ancestor::div[1]/ancestor::nav[1]/ancestor::div[1]/ancestor::div[1]/ancestor::div[1]/ancestor::div[1]/ancestor::div[1]"));
        String pageTitle = title.getText();
        System.out.println(pageTitle);

        //using Descendant
        WebElement homeBtn = driver.findElement(By.xpath("//div[@id='widget-navbar-217834']/descendant::ul[1]/descendant::li[1]/descendant::a[1]/descendant::div[1]/descendant::span[1]"));
        homeBtn.click();

        //using Following
        WebElement follow = driver.findElement(By.xpath("//ul[@class='navbar-nav vertical']/following::nav[2]"));
        String followText = follow.getAttribute("class");
        System.out.println(followText);
        String followText2 = follow.getText();
        System.out.println(followText2);

        //Using Following-Sibling
        WebElement sibling = driver.findElement(By.xpath("//div[@id='top-header']/following-sibling::*"));
        String siblingText = sibling.getText();
        System.out.println(siblingText);

        //Using Preceding-Sibling
        WebElement precSibling = driver.findElement(By.xpath("//div[@id='main-navigation']/preceding-sibling::div[1]"));
        String precSiblingText = precSibling.getAttribute("id");
        System.out.println(precSiblingText);

    }
}
