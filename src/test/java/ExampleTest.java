import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class ExampleTest {

    @Test
    public void testOne() {
        assertThat(true)
                .as("AssertTrue")
                .isTrue();
    }

    @Test
    public void testTwo() {
        assertThat(false)
                .as("AssertFalse")
                .isFalse();
    }

}
