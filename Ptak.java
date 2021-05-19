
/**
 * Třída reprezentuje ptáka
 */
public class Ptak {

    /**
     * Hlad
     */
    protected int hlad = 100;

    /**
     * Váha v gramech
     */
    protected int vaha = 50;

    /**
     * Sní jídlo, což sníží hlad a zvýší váhu
     * @param gramu Váha jídla v gramech
     */
    public void snez(int gramu) {
        vaha += gramu;
        hlad -= gramu;
        if (hlad < 0)
            hlad = 0;
    }

    /**
     * Vrátí textovou reprezentaci ptáka
     * @return Textová reprezentace ptáka
     */
    @Override
    public String toString() {
        return "Jsem pták s váhou " + vaha + " a hladem " + hlad + ".";
    }
}
