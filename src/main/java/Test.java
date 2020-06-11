import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//First Selenium Test Script To Open Tge

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver obj = new ChromeDriver();
        obj.get("https://google.com");
    }
}
