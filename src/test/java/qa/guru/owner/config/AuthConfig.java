package qa.guru.owner.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:auth/auth.properties")
public interface AuthConfig extends Config {

    @Key("user")
    String username();

    @Key("pass")
    String password();
}
