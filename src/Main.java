public class Main {
    public static void main(String[] args) {
        CelciusTemperature temp1 = new CelciusTemperature(36.6);
        IKelvin CKA = new CKAdapter(temp1);
        IFahrenheit CFA = new CFAdapter(temp1);

        FahrenheitTemperature temp2 = new FahrenheitTemperature(36.6);
        ICelcius FCA = new FCAdapter(temp2);
        IKelvin FKA = new FKAdapter(temp2);

        KelvinTemperature temp3 = new KelvinTemperature(0);
        ICelcius KCA = new KCAdapter(temp3);
        IFahrenheit KFA = new KFAdapter(temp3);

        Thermometer T = new Thermometer();

        T.showCelciusTemperature(temp1);
        T.showKelvinTemperature(CKA);
        T.showFahrenheitTemperature(CFA);

        System.out.println();

        T.showFahrenheitTemperature(temp2);
        T.showCelciusTemperature(FCA);
        T.showKelvinTemperature(FKA);

        System.out.println();

        T.showKelvinTemperature(temp3);
        T.showCelciusTemperature(KCA);
        T.showFahrenheitTemperature(KFA);
    }
}