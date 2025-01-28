package frameWork;

import com.google.common.io.Files;
import lombok.SneakyThrows;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;

public class Reports {
    WebDriver driver;
    public Reports(WebDriver driver)
    {
        this.driver = driver;
    }
    @SneakyThrows
    public void captureScreenShot(String filePath)
    {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest = new File(filePath);
        Files.copy(src,dest);

    }
}
