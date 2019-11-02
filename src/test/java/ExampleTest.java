import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@Epic("Epic")
@Feature("Feature")
public class ExampleTest {

    @Test
    @Story("Тест 1")
    public void testOne() {
        assertThat(true)
                .as("AssertTrue")
                .isTrue();
    }

    @Test
    @Story("Тест 2")
    public void testTwo() {
        step1();
        assertThat(false)
                .as("AssertFalse")
                .isFalse();
    }

    @Step("Шаг 1")
    void step1() {
        step2();
    }

    @Step("Шаг 2")
    void step2() {
        step3();
    }

    @Step("Шаг 3")
    void step3() {

    }

}
