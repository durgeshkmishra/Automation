package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
    //It is used to maintain the factory of the browsers
    public static void killExistingBrowsers() {
        //Runtime is the library present in JAVA to execute the runtime commands

        try {
            Runtime.getRuntime().exec("TASKKILL -f -im msedgedriver.exe /T");
            Runtime.getRuntime().exec("TASKKILL -f -im chromedriver.exe /T");
            Runtime.getRuntime().exec("TASKKILL -f -im geckodriver.exe /T");
        } catch (Exception c4) {
            c4.printStackTrace();
        }
    }

    public static WebDriver getDriver(String browserName) {
        return switch (browserName.toUpperCase()) {
            case "CHROME" -> new ChromeDriver();
            case "FIREFOX" -> new FirefoxDriver();
            case "EDGE" -> new EdgeDriver();
//            case "SAFARI" -> new SafariDriver();

            default ->
                    throw new RuntimeException("Invalid Browser Name, Please check the browser name that you have passed");

        };
    }
}

