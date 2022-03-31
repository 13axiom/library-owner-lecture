package qa.guru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;


public class WebDriverConfig {

    public String getBaseURL() {
        String baseURL = System.getProperty("baseURL");
        if (Objects.isNull(baseURL)) {
            baseURL = "https://github.com/";
        }
        return baseURL;
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            return Browser.CHROME;
        }
        return Browser.valueOf(browser);
    }

    public boolean isRemote() {
        String isRemote = System.getProperty("isRemote");
        if (Objects.isNull(isRemote)) {
            return false;
        }
        return Boolean.parseBoolean(isRemote);
    }

    public URL getRemoteURL() {
        String remoteURL = System.getProperty("remoteURL");
        if (Objects.isNull(remoteURL)) {
            return null;
        }
        try {
            return new URL(remoteURL);
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
