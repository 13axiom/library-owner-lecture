package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.AuthConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthTests {

    @Test
    public void authTestLocalFile() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("admin");
        assertThat(config.password()).isEqualTo("1234");
    }

}
