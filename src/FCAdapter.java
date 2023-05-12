public class FCAdapter implements ICelcius {
    FahrenheitTemperature FAHRENHEIT_TEMPERATURE;

    public FCAdapter(FahrenheitTemperature temperature) {
        this.FAHRENHEIT_TEMPERATURE = temperature;
    }

    @Override
    public double getCelciusTemperature() {
        return 0.56 * this.FAHRENHEIT_TEMPERATURE.getFahrenheitTemperature() - 17.92;
    }
}
