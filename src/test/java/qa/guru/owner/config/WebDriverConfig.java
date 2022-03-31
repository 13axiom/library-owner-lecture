package qa.guru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseURL")
    @DefaultValue("https://github.com/")
    String getBaseURL();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteURL")
    URL getRemoteURL();

}
