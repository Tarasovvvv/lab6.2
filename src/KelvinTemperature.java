public class KelvinTemperature implements IKelvin {
    private double TEMPERATURE;

    public KelvinTemperature(double temperature) {
        this.TEMPERATURE = temperature;
    }

    @Override
    public double getKelvinTemperature() {
        return this.TEMPERATURE;
    }
}