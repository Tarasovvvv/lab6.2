import Classes.Temperatures.KelvinTemperature;
import Interfaces.*;

public class KFAdapter implements IFahrenheit {
    KelvinTemperature KELVIN_TEMPERATURE;

    public KFAdapter(KelvinTemperature temperature) {
        this.KELVIN_TEMPERATURE = temperature;
    }

    @Override
    public double getFahrenheitTemperature() {
        return 1.8 * this.KELVIN_TEMPERATURE.getKelvinTemperature() - 459.67;
    }
}