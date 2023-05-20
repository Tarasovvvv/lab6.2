package Test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KFAdapterTest {
    @Test
    public void getFahrenheitTemperature() {
        //тестовые данные
        double KELVIN_TEMPERATURE = 123;
        //ожидаемый результат
        double expected = 1.8 * 123 - 459.67;
        //получаемый результат
        double actual = 1.8 * KELVIN_TEMPERATURE - 459.67;
        //тестирование
        Assert.assertEquals(expected, actual, 0.001);
    }
}