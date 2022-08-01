package Gun01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _04_Enable {

    @Test
    void test1(){
        System.out.println("Test 1");
    }

    @Test(enabled = false)
    void test2(){
        System.out.println("Test 2");
    }

    @Test
    void test3(){
        System.out.println("Test 3");
    }

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    void BaslangicIslemleri(){
        System.out.println("Driver start .......");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        Duration duration = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(duration);
        driver.manage().timeouts().implicitlyWait(duration);
    }

    @AfterClass
    void BitisISlemleri(){
        System.out.println("Driver stop ........");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
