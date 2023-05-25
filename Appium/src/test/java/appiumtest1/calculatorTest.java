package appiumtest1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class calculatorTest {
    static AppiumDriver driver;

    public static void main(String[] args) {
        try {
            opencalculator();
        } catch (Exception e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static <MobileElement> void opencalculator() throws MalformedURLException, org.openqa.selenium.WebDriverException {
        DesiredCapabilities Dcap = new DesiredCapabilities();

        Dcap.setCapability("deviceName", "SM-M426B");
        Dcap.setCapability("udid", "RZCR404BE5E");
        Dcap.setCapability("platformName", "Android");
        Dcap.setCapability("platformVersion", "13");

        Dcap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        Dcap.setCapability("appActivity", "com.sec.android.app.popupcalculator.converter.controller.NewUnitConverterActivity");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        driver = new AppiumDriver(url, Dcap);

        System.out.println("Application running");
    }
}
