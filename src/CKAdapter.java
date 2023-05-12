import Classes.Temperatures.CelciusTemperature;
import Interfaces.*;

public class CKAdapter implements IKelvin {
    CelciusTemperature CELCIUS_TEMPERATURE;

    public CKAdapter(CelciusTemperature temperature) {
        this.CELCIUS_TEMPERATURE = temperature;
    }

    @Override
    public double getKelvinTemperature() {
        return this.CELCIUS_TEMPERATURE.getCelciusTemperature() + 273.15;
    }
}
