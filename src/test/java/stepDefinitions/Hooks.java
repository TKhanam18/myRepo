package stepDefinitions;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;


public class Hooks extends Base {

    @Before
    public void setup() throws MalformedURLException {
        ChromeOptions opt = new ChromeOptions();

        driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);

    }

    @After
    public void tearDown() throws InterruptedException {
        //Thread.sleep(20000);
        //driver.close(); //to close Current Tab of the Browser
        driver.quit();  //to close Browser Application or Window
    }
}
