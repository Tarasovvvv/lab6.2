public class CelciusTemperature implements ICelcius {
    private double TEMPERATURE;

    public CelciusTemperature(double temperature) {
        this.TEMPERATURE = temperature;
    }

    @Override
    public double getCelciusTemperature() {
        return this.TEMPERATURE;
    }
}
