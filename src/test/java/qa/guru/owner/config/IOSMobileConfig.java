package qa.guru.owner.config;

import org.aeonbits.owner.Config;

//@Config.Sources("classpath:${device}.properties")
@Config.Sources("classpath:iphone.properties")
public interface IOSMobileConfig extends Config{

    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();
}
