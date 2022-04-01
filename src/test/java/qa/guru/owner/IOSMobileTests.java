package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.IOSMobileConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IOSMobileTests {

    @Test
    public void testIOSMobileConfig() {
        IOSMobileConfig config = ConfigFactory.create(IOSMobileConfig.class,System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iPhone 13 PRO");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
    }
}
