package com.home.test;

import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@Epic("Epic")
@Feature("Feature")
public class ExampleTest {

    @Test
    @TmsLink("test-1")
    @Story("Тест 1")
    @Description("Описание теста")
    public void testOne() {
        assertThat(true)
                .as("AssertTrue")
                .isTrue();
    }

    @Test
    @Issue("123")
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
