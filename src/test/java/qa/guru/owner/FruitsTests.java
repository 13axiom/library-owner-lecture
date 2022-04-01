package qa.guru.owner;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import qa.guru.owner.config.FruitsConfig;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTests {

    @Test
    public void testArray() {
        System.setProperty("array", "orange,pineapple");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray()).containsExactly("orange","pineapple");
    }

    @Test
    public void testList() {
        System.setProperty("list", "orange,banana,plum");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsList()).containsExactly("orange","banana","plum");
    }

    @Test
    public void testArrayWithDefault() {
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArrayWithDefault()).containsExactlyInAnyOrder("apple","orange","apple");
    }

    @Test
    public void testListWithSeparator() {
        System.setProperty("list-with-separator", "orange;banana;plum");
        FruitsConfig config = ConfigFactory.create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithSeparator()).containsExactly("orange","banana","plum");
    }

}
