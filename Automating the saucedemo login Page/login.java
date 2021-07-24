import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class login {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Jasith/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.name("login-button"));

        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");

        login.click();




        driver.quit();
    }
}

