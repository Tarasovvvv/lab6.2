package Test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CFAdapterTest {
    @Test
    public void getFahrenheitTemperature() {
        //тестовые данные
        double CELCIUS_TEMPERATURE = 123;
        //ожидаемый результат
        double expected = 1.8 * 123 + 32;
        //получаемый результат
        double actual = 1.8 * CELCIUS_TEMPERATURE + 32;
        //тестирование
        Assert.assertEquals(expected, actual, 0.001);
    }
}