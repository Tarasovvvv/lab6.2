import Classes.Temperatures.KelvinTemperature;
import Interfaces.*;

public class KCAdapter implements ICelcius {
    KelvinTemperature KELVIN_TEMPERATURE;

    public KCAdapter(KelvinTemperature temperature) {
        this.KELVIN_TEMPERATURE = temperature;
    }

    @Override
    public double getCelciusTemperature() {
        return this.KELVIN_TEMPERATURE.getKelvinTemperature() - 273.15;
    }
}


