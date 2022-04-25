package factory;

import templates.ChromeTemplate;
import templates.EdgeTemplate;
import templates.TestTemplate;

/**
 * Permite la creación de una instancia que hace pruebas
 * con un driver determinado
 */
public class DriverFactory {
    public TestTemplate getDriver(String driverType) {
        if (driverType.equalsIgnoreCase("CHROME")) {
            return new ChromeTemplate();
        } else {
            return new EdgeTemplate();
        }
    }
}
