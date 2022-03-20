package selenium;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import managerBrowser.DriverManager;
import managerBrowser.DriverManagerFactory;
import managerBrowser.DriverType;
import org.openqa.selenium.WebDriver;


public class Driver {
   private static WebDriver driver;
   private DriverManager driverManager;
   private static int casos = 0;

    // quien inicia primero
    @Before
    public void setUP(){
        casos ++;
        System.out.println("inicio");
        DriverManager driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @After
    public void closeBrowse(){
        driver.quit();
        System.out.println("fin prueba");
    }


    public static WebDriver getDriver(){
    return driver;
    }

}