
/**
 * Reprezentuje poddruh ptáka se schopností vzteku
 */
public class AngryPtak extends Ptak {

    /**
     * Vztek angry-ptáka
     */
    private int vztek = 50;

    /**
     * Vyprovokuje angry-ptáka, čímž zvýší jeho vztek v závislosti na hladu
     * @param mira
     */
    public void provokuj(int mira) {
        if (hlad > 0) // Hladový angry-pták se nechá vyprovokovat 2x snáze
            vztek += mira * 2;
        else
            vztek += mira;
    }

    @Override
    public String toString() {
        return "Jsem angry-pták s váhou " + vaha + " a hladem " + hlad + ", míra mého vzteku je " + vztek + ".";
    }
}
