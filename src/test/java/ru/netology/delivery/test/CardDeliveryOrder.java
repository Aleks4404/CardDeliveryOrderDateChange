package ru.netology.delivery.test;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.netology.delivery.data.DataGenerator;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.open;
import static  com.codeborne.selenide.Selenide.*;
import static  com.codeborne.selenide.Selectors.*;
import static  com.codeborne.selenide.Condition.*;

class CardDeliveryOrder {

    private Faker faker;

    @BeforeEach
    void setUpAll() {
        faker = new Faker(new Locale("ru"));
    }

    @Test
    void shouldPreventSendRequestMultipleTimes() {
        String name = faker.name().fullName();
        String phone = faker.phoneNumber().phoneNumber();
        String city = faker.address().city();
        System.out.println(name);
        System.out.println(phone);
        System.out.println(city);
    }
}
