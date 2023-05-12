// Клиент
public class Thermometer{
    public void showCelciusTemperature(ICelcius temperature){
        System.out.println("Температура по Цельсию: " + temperature.getCelciusTemperature());
    }
    public void showKelvinTemperature(IKelvin temperature){
        System.out.println("Температура по Кельвину: " + temperature.getKelvinTemperature());
    }
    public void showFahrenheitTemperature(IFahrenheit temperature){
        System.out.println("Температура по Фаренгейту: " + temperature.getFahrenheitTemperature());
    }
}