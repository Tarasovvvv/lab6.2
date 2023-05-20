package Test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CKAdapterTest {
    @Test
    public void getFahrenheitTemperature() {
        //тестовые данные
        double CELCIUS_TEMPERATURE = 123;
        //ожидаемый результат
        double expected = 123 + 273.15;
        //получаемый результат
        double actual = CELCIUS_TEMPERATURE + 273.15;
        //тестирование
        Assert.assertEquals(expected, actual, 0.001);
    }
}