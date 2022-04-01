package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.IOSMobileConfig;
import qa.guru.owner.config.MobileConfig;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MobileTests {

    @Test
    public void testIOSConfig() {
        System.setProperty("device","iphone");
        MobileConfig config = ConfigFactory.create(MobileConfig.class,System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iPhone 13 PRO");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");
    }

    @Test
    public void testAsianConfig() {
        System.setProperty("device","asianphone");
        MobileConfig config = ConfigFactory.create(MobileConfig.class,System.getProperties());
        assertThat(config.deviceName()).isEqualTo("iFon 15 camer + vagon for Birds ladies only");
        assertThat(config.platformName()).isEqualTo("ANDROID");
        assertThat(config.platformVersion()).isEqualTo("111.99.22.12");
    }

}
