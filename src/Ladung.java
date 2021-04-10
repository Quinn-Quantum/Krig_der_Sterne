/**@author Maria
 *@throws Class für die Ladungen der Schiffe
 */
public class Ladung {

    /**
     *
     * @param typ sagt aus um was es sich handelt ( z.B. Schokolade)
     * @param anzahl wie viel vom typ da ist
     */
    private String typ;
    private int anzahl;




    //Konstruktoren

    public Ladung() {

    }
    /**
     * Konstruktoren zur Implimentierung von der Classe Ladung
     * @param typ sagt aus um was es sich handelt ( z.B. Schokolade) und würd hier der Classe Ladung speziell zu gewisen und ist ein String
     * @param anzahl wie viel vom typ da ist und würd hier der Classe Ladung speziell zu gewisen ist ein int
     */
    public Ladung(String typ, int anzahl) {
        this.typ = typ;
        this.anzahl = anzahl;
    }

    //verwaltungsmethoden

    /**
     * für die rückgabe des typ
     * @return typ als String
     */

    public String getTyp() {
        return typ;
    }

    /**
     *
     * @param typ typ wird in dieser Methode gesetzt
     */

    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * für die rückgabe der Anzahl von typ
     * @return anzahl als int
     */
    public int getAnzahl() {
        return anzahl;
    }

    /**
     *
     * @param anzahl anzahl wird ein wert zugewiesen
     */

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }
}