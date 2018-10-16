package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by Karthik on 10/17/2016.
 */
public class Hook extends BaseUtil {


    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {

        System.out.println("Opening the browser : Chrome driver");

        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\alexa\\Desktop\\WalletHub\\chromedriver\\chromedriver.exe");
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setBrowserName("chrome");
        caps.setPlatform(Platform.WINDOWS);
        base.Driver = new ChromeDriver(caps);

        /*DesiredCapabilities capabilities = DesiredCapabilities.chrome();




        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("C:\\Users\\alexa\\Desktop\\WalletHub\\chromedriver\\chromedriver.exe"))
                .usingAnyFreePort()
                .build();
        base.Driver = new ChromeDriver(service, capabilities); */

    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }

}
