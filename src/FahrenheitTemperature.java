public class FahrenheitTemperature implements IFahrenheit {
    private double TEMPERATURE;

    public FahrenheitTemperature(double temperature) {
        this.TEMPERATURE = temperature;
    }

    @Override
    public double getFahrenheitTemperature() {
        return this.TEMPERATURE;
    }
}