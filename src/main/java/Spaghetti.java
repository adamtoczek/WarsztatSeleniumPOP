import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spaghetti {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver();




    }
}

