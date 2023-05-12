public class CFAdapter implements IFahrenheit {
    CelciusTemperature CELCIUS_TEMPERATURE;

    public CFAdapter(CelciusTemperature temperature) {
        this.CELCIUS_TEMPERATURE = temperature;
    }

    @Override
    public double getFahrenheitTemperature() {
        return 1.8 * this.CELCIUS_TEMPERATURE.getCelciusTemperature() + 32;
    }
}
