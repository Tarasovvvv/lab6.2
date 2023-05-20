package Test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FKAdapterTest {
    @Test
    public void getFahrenheitTemperature() {
        //тестовые данные
        double FAHRENHEIT_TEMPERATURE = 123;
        //ожидаемый результат
        double expected = 0.56 * 123 - 255.37;
        //получаемый результат
        double actual = 0.56 * FAHRENHEIT_TEMPERATURE - 255.37;
        //тестирование
        Assert.assertEquals(expected, actual, 0.001);
    }
}