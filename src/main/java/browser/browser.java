package browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class browser {
   private static WebDriver driver;
    public static String getPropertyValue(String prName){
        String propertyValue="";
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/info-propertis.properties");
            Properties properties = new Properties();
            properties.load(inputStream);
            propertyValue = properties.getProperty(prName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return propertyValue;

    }

    public static void setDriver(){
        String driveValue = getPropertyValue("browser");
        if(driveValue.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            
        } else if (driveValue.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            
        }

    }public static WebDriver getDriver(){
        return driver;
    }
}
