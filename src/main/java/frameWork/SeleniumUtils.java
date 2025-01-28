package frameWork;
import lombok.SneakyThrows;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SeleniumUtils {
    WebDriver driver;
    ElementUtils elementUtils;
    Actions a1;

    public SeleniumUtils(WebDriver driver)
    {
        this.driver=driver;
        elementUtils=new ElementUtils(driver);
        a1=new Actions(driver);
    }

    public void clickOnElement(WebElement element)
    {
        element.click();
    }

    public void clickOnElement(By by)
    {
        elementUtils.findElement(by).click();
    }

    public void enterText(WebElement element,String text) {
        element.sendKeys(text);
    }

    public void enterText(By by, String text) {
        elementUtils.findElement(by).sendKeys(text);
    }

    public void enterText(WebElement element, Keys keys) {
        element.sendKeys(keys);
    }

    public void enterText(By by,Keys keys) {
        elementUtils.findElement(by).sendKeys(keys);
    }

    public String launchApplication(String url)
    {
        if(url==null)
            throw new RuntimeException("URL cannot be null, please check the value that you have passed");

        else if(url.indexOf("http") == -1)
            throw new RuntimeException("Invalid URL, please check the URL that you have passed");

        else if(url.startsWith("http")==false)
            throw new RuntimeException("URL is not starting with https or http, please check the URL that you have passed");

        //Always remember that the URL should start with either http or https
        //else it will throw an invalid argument exception

        driver.manage().window().maximize(); //Maximizing the browser window
        driver.get(url);
        return driver.getWindowHandle();
    }

    public void checkIfElementIsDisplayed(WebElement element,String labelName)
    {
        if(element.isDisplayed())
            System.out.println(labelName+" is displayed on the page");

        else
            System.out.println(labelName+" is not displayed on the page");
    }

    public void checkIfElementIsDisplayed(By by,String labelName)
    {
        if(driver.findElement(by).isDisplayed())
            System.out.println(labelName+" is displayed on the page");

        else
            System.out.println(labelName+" is not displayed on the page");
    }

    public void switchToParticularWindow(String windowRefID)
    {
        driver.switchTo().window(windowRefID);
    }

    public void switchToParticularWindow(int windowIndex)
    {
        List<String> listOfWindowHandles=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfWindowHandles.get(windowIndex));
    }

    public void switchToParticularWindowAndCloseThatTabOrWindow(int windowIndex)
    {
        List<String> listOfWindowHandles=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(listOfWindowHandles.get(windowIndex)).close();
    }

    public String createNewTab(String url)
    {
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);

        return driver.getWindowHandle();
    }

    public String createNewWindow(String url)
    {
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(url);

        return driver.getWindowHandle();
    }

    @SneakyThrows
    public void switchToNewWindow()
    {
        Set<String> handles=driver.getWindowHandles();

        for(String s:handles)
        {
            driver.switchTo().window(s);
        }
    }

    @SneakyThrows
    public void closeWindow(String urlOrTitle)
    {
        Set<String> handles=driver.getWindowHandles();

        for(String s:handles)
        {
            driver.switchTo().window(s);
            Thread.sleep(2000);

            if(driver.getCurrentUrl().contains(urlOrTitle) || driver.getTitle().contains(urlOrTitle))
            {
                Thread.sleep(2000);
                driver.close();
            }
        }
    }

    public String getElementText(WebElement element)
    {
        return element.getText();
    }

    public String getElementText(By by)
    {
        return elementUtils.findElement(by).getText();
    }

    public void performMouseHover(WebElement element)
    {
        a1.moveToElement(element).build().perform();
    }

    public void performMouseHover(By by)
    {
        a1.moveToElement(elementUtils.findElement(by)).build().perform();
    }

    public void performMouseHover(String locator, String value)
    {
        a1.moveToElement(elementUtils.findElement(locator,value)).build().perform();
    }

    public void performDragAndDrop(WebElement source, WebElement target)
    {
        a1.dragAndDrop(source,target).build().perform();
    }

    public void performDragAndDrop(By source, By target)
    {
        a1.dragAndDrop(elementUtils.findElement(source), elementUtils.findElement(target)).build().perform();
    }

    public void performRightClick(WebElement element)
    {
        a1.contextClick(element).build().perform();
    }

    public void performRightClick(By by)
    {
        a1.contextClick(elementUtils.findElement(by)).build().perform();
    }

    public void acceptAlert()
    {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert()
    {
        driver.switchTo().alert().dismiss();
    }

    public void sendKeysToAlert(String text)
    {
        driver.switchTo().alert().sendKeys(text);
    }

    public String getTextFromAlert()
    {
        return driver.switchTo().alert().getText();
    }

    public void scrollPageDown(int pixels)
    {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+pixels+")");
    }

    public void scrollPage(int x, int y)
    {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy("+x+","+y+")");
    }

    public void scrollPageUp(int pixels)
    {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-"+pixels+")");
    }

    public void scrollPageToTheBottom()
    {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public void scrollPageToTheTop()
    {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }

    public void switchToFrame(String nameOrID)
    {
        driver.switchTo().frame(nameOrID);
    }

    public void switchToFrame(int index)
    {
        driver.switchTo().frame(index);
    }

    public void switchToParentFrame()
    {
        driver.switchTo().parentFrame();
    }

    public void switchOutOfAllFrames()
    {
        driver.switchTo().defaultContent();
    }
}
