import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPorject {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");

        // Rechercher "inclusiv academy"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("inclusiv academy");
        searchBox.submit();

        // Attendre 3 secondes  pour chrager la page
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Cliquer sur le premier lien
        WebElement firstResult = driver.findElement(By.cssSelector("h3"));
        firstResult.click();

    }
}
