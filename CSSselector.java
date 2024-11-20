package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//HW Nov 20.1. https://opensource-demo.orangehrmlive.com/web/index.php/buzz/viewBuzz -
//Navigate to all the menu option present on the left sidebar
//and click on each of them and in-between wait for 2000 ms
public class CSSselector {

    WebDriver driver= new ChromeDriver();

    @Test
    void findElementByCSS() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        loginBtn.click();
        Thread.sleep(2000);

        WebElement admin = driver.findElement(By.cssSelector("a[href=\"/web/index.php/admin/viewAdminModule\"]"));
        admin.click();
        Thread.sleep(2000);

        WebElement pim = driver.findElement(By.cssSelector("a[href=\"/web/index.php/pim/viewPimModule\"]"));
        pim.click();
        Thread.sleep(2000);

        WebElement leave = driver.findElement(By.cssSelector("a[href=\"/web/index.php/leave/viewLeaveModule\"]"));
        leave.click();
        Thread.sleep(2000);

        WebElement time = driver.findElement(By.cssSelector("a[href=\"/web/index.php/time/viewTimeModule\"]"));
        time.click();
        Thread.sleep(2000);

        WebElement recruitment = driver.findElement(By.cssSelector("a[href=\"/web/index.php/recruitment/viewRecruitmentModule\"]"));
        recruitment.click();
        Thread.sleep(2000);

        WebElement myInfo = driver.findElement(By.cssSelector("a[href=\"/web/index.php/pim/viewMyDetails\"]"));
        myInfo.click();
        Thread.sleep(2000);

        WebElement performance = driver.findElement(By.cssSelector("a[href=\"/web/index.php/performance/viewPerformanceModule\"]"));
        performance.click();
        Thread.sleep(2000);

        WebElement dashboard = driver.findElement(By.cssSelector("a[href=\"/web/index.php/dashboard/index\"]"));
       dashboard.click();
       Thread.sleep(2000);

        WebElement directory = driver.findElement(By.cssSelector("a[href=\"/web/index.php/directory/viewDirectory\"]"));
        directory.click();
        Thread.sleep(2000);

        WebElement maintenance = driver.findElement(By.cssSelector("a[href=\"/web/index.php/maintenance/viewMaintenanceModule\"]"));
        maintenance.click();
        Thread.sleep(2000);

        WebElement adminAccess= driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--large oxd-button--ghost orangehrm-admin-access-button']"));
        adminAccess.click();
        Thread.sleep(2000);

        WebElement claim = driver.findElement(By.cssSelector("a[href=\"/web/index.php/claim/viewClaimModule\"]"));
        claim.click();
        Thread.sleep(2000);

        WebElement buzz = driver.findElement(By.cssSelector("a[href=\"/web/index.php/buzz/viewBuzz\"]"));
        buzz.click();
        Thread.sleep(2000);

        driver.close();
    }




}
