package qa.guru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface TypeConfig extends Config {

    @Key("int")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

    @Key("enum")
    Browser getEnum();

    @Key("url")
    URL getUrl();

}
