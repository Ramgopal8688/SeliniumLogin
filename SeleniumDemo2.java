import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

    public static <txtPassword> void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
            txtUsername.sendKeys("admin");
        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnlogin = driver.findElement(By.name("submit"));
        btnlogin.click();

    }

}
