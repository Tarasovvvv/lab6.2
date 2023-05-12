import Classes.Temperatures.FahrenheitTemperature;
import Interfaces.*;

public class FKAdapter implements IKelvin {
    FahrenheitTemperature FAHRENHEIT_TEMPERATURE;

    public FKAdapter(FahrenheitTemperature temperature) {
        this.FAHRENHEIT_TEMPERATURE = temperature;
    }

    @Override
    public double getKelvinTemperature() {
        return 0.56 * this.FAHRENHEIT_TEMPERATURE.getFahrenheitTemperature() - 255.37;
    }
}