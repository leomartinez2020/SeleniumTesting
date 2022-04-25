package templates;

import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ChromeTemplate extends TestTemplate {
    public void setup() {
        String folder = System.getProperty("user.dir");
        String driverPath = "src/main/resources/drivers";
        String driverFile = "chromedriver.exe";
        Path filePath = Paths.get(folder, driverPath, driverFile);
        System.setProperty("webdriver.chrome.driver", filePath.toString());
        driver = new ChromeDriver();
    }
}
