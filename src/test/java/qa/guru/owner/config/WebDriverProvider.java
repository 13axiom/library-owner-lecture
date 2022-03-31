package qa.guru.owner.config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    //WebDriverConfig config = new WebDriverConfig(); - с точки зрения java правильнее писать то же самое вот так:
    public final WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }

    @Override
    public WebDriver get() {
        WebDriver driver = createWebDriver();
        driver.get(config.getBaseURL());
        return driver;
    }

   /* private WebDriver createWebDriver() {
        if (Objects.nonNull(config.getBrowser())) {
            switch (config.getBrowser()) {
                case CHROME: {
                    return new ChromeDriver();
                }
                case FIREFOX: {
                      return new FirefoxDriver();
                }
                default: {
                    throw new RuntimeException("Browser type isn't supported");
                }
            }
        }
        throw new RuntimeException("Browser type cannot be null");

    }*/
}
