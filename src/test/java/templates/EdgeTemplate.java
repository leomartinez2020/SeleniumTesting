package templates;

import org.openqa.selenium.edge.EdgeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Plantilla para el driver edge
 */
public class EdgeTemplate extends TestTemplate {
    public void setup() {
        String folder = System.getProperty("user.dir");
        String driverPath = "src/main/resources/drivers";
        String driverFile = "msedgedriver.exe";
        Path filePath = Paths.get(folder, driverPath, driverFile);
        System.setProperty("webdriver.edge.driver", filePath.toString());
        driver = new EdgeDriver();
    }
}
