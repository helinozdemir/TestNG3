package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWebDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void BaslangicIslemleri(){
        System.out.println("Driver start .......");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Duration duration = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(duration);
        driver.manage().timeouts().implicitlyWait(duration);

        driver.get("http://opencart.abstracta.us/index.php?route=account/login");
    }

    @AfterClass
    public void BitisISlemleri(){
        System.out.println("Driver stop ........");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
