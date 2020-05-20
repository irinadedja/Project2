import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassMain {
    public static void main(String[] args) {
        //System.out.println("My first console app on GitHub!");
        System.setProperty("webdriver.chrome.driver","libs\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        String baseUrl="https://www.facebook.com/";

        driver.get(baseUrl);

        WebElement login=driver.findElement(By.id("email"));
        login.sendKeys("User");
        login.click();
        WebElement pass=driver.findElement(By.id("pass"));
        pass.sendKeys("12345678!.");
        WebElement accedi=driver.findElement(By.id("u_0_b"));
        accedi.click();
        driver.close();
    }
}
