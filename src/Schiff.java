import java.util.ArrayList;
import java.util.Random;

public class Schiff {
    private String nameSchiff;
    private int energieversorgung;
    private int schilde;
    private int lebenserhaltung;
    private int hülle;
    private int photonentorpedos;
    private int reperaturandroiden;
    private static ArrayList<String> broadcastKommunikator = new ArrayList<String>();
    private ArrayList<Ladung> ladungsliste = new ArrayList<Ladung>();

    // Konstruktoren
    public Schiff() {

    }

    /**
     * Konstrukter zu Implimentierung von der Klasse Schiffe
     * 
     * @param nameSchiff         speichert die Namen der Schiffe zu den Opjekte erstellt wurden als String
     * @param energieversorgung  sagt aus wie viel E das zugegortnete Schiff hatt als int
     * @param schilde            sagt aus wie viel % Schild das zugeordnete Schiff hatt als int
     * @param lebenserhaltung    sagt aus ob lebenserhaltung noch vorhanden ist als int
     * @param hülle              sagt ob die hülle da ist als int
     * @param photonentorpedos   gib die Anzahl der Torpedos als int
     * @param reperaturandroiden gibt die Anzahlder Droiden als  int
     */
    public Schiff(String nameSchiff, int energieversorgung, int schilde, int lebenserhaltung, int hülle,
            int photonentorpedos, int reperaturandroiden) {
        this.nameSchiff = nameSchiff;
        this.energieversorgung = energieversorgung;
        this.schilde = schilde;
        this.lebenserhaltung = lebenserhaltung;
        this.hülle = hülle;
        this.photonentorpedos = photonentorpedos;
        this.reperaturandroiden = reperaturandroiden;
    }

    // Verwaltungsmethoden
    /**
     * @return nameSchiff wenn nameSchiff gesetzt wurde zurück als String
     */
    public String getNameSchiff() {
        return nameSchiff;
    }

    /**
     * Um Schiffs Name zu erzeugen
     * @param nameSchiff wird auf den Namen des Schiffes gesetzt
     */
    public void setNameSchiff(String nameSchiff) {
        this.nameSchiff = nameSchiff;
    }

    /**
     * @return energieversorgung des Schiffe wird als int zurückgegeben
     */

    public int getEnergieversorgung() {
        return energieversorgung;
    }


    /**
     *
     * @param energieversorgung wird gesetzt
     */

    public void setEnergieversorgung(int energieversorgung) {
        this.energieversorgung = energieversorgung;
    }

    /**
     * wert des Schildes wird zurück gegeben
     * @return schilde als int
     */

    public int getSchilde() {
        return schilde;
    }

    /**
     *
     * @param schilde wird gesetzt
     */

    public void setSchilde(int schilde) {
        this.schilde = schilde;
    }

    /**
     *
     * @return lebenserhaltung als int
     */

    public int getLebenserhaltung() {
        return lebenserhaltung;
    }

    /**
     *
     * @param lebenserhaltung wird gesetzt
     */

    public void setLebenserhaltung(int lebenserhaltung) {
        this.lebenserhaltung = lebenserhaltung;
    }

    /**
     *
     * @return hülle als int
     */

    public int getHülle() {
        return hülle;
    }

    /**
     *
     * @param hülle wird gesetzt
     */

    public void setHülle(int hülle) {
        this.hülle = hülle;
    }

    /**
     *
     * @return photonentorpedos als int
     */

    public int getPhotonentorpedos() {
        return photonentorpedos;
    }

    /**
     *
     * @param photonentorpedos wird gesetzt
     */

    public void setPhotonentorpedos(int photonentorpedos) {
        this.photonentorpedos = photonentorpedos;
    }

    /**
     *
     * @return reperaturandroiden als int
     */

    public int getReperaturandroiden() {
        return reperaturandroiden;
    }

    /**
     *
     * @param reperaturandroiden weird gesetzt
     */

    public void setReperaturandroiden(int reperaturandroiden) {
        this.reperaturandroiden = reperaturandroiden;
    }

    // Funktionen

    /**
     *
     * @param Ladung wird hir den Speicher zugeordnet
     */
    // nur der Speicher wird weiter gegeben
    public void addLadung(Ladung Ladung) {
        ladungsliste.add(Ladung);
    }

    /**
     * Rückgabe der Parameter des Ausgewelten Schiffis können mit der Methode Ausgegeben werden
     */

    //Zustand des Schiffes
    public void ZustandSchiff(){
      System.out.println ("Zustandt des Schiffs: "+ nameSchiff + "\n\tEnergieversorgung: "+energieversorgung+ "\n\tSchilde: "+schilde+"\n\tLebenserhaltung: "+lebenserhaltung+"\n\tHüll: "+hülle+"\n\tPhotonentopedos: "+photonentorpedos+"\n\tReperaturandroiden: "+reperaturandroiden+"\n");
    }

    /**
     * Der Inhalt der Array Liste ladungsListe werden mit der Methode ausgegeben
     * solange i kleiner/gleich der Länge der Liste ist werden die Inhalte Ausgegeben
     */

    //Ladung Ausgeben
    public void LadungsListe(){
        for (Ladung i : ladungsliste){
            System.out.println("\nObjekt: "+i.getTyp()+ " da von vorhande:  " + i.getAnzahl());
        }

    }
    public int LadungsListeV(String ladung) {
        int zahl=0;
        for (Ladung i : ladungsliste) {
            if (i.getTyp().equals(ladung)) {
                zahl = i.getAnzahl();
            }
        }
        return zahl;
    }


    /**
     *
     * @param angezieltesSchiff ist das Schiff was dan in die Methode Treffer übergeben wird
     *                          Solange es mehr als 0 Torpedos gibt wird if ausgeführt und das gegnerische Schiff wird getroffen
     *                          nach der Ausführung wird 1 Torpedo abgezogen
     *                          ansonsten wird else ausgeführt und die Nachricht Click wird an alle gesendet
     */

    //Schießen
    public void Torpedoschissen (Schiff angezieltesSchiff, int anzahlderschüsse){
        int zahl= LadungsListeV("Photonentorpedo");
        int bitte =getPhotonentorpedos();
        System.out.println (bitte);


        if (getPhotonentorpedos()>0 && getPhotonentorpedos() >= anzahlderschüsse){

            System.out.println(anzahlderschüsse + " Photonentorpedo(s) eingesetzt");
            setPhotonentorpedos(getPhotonentorpedos() - anzahlderschüsse);
            NachrichtAnAlle("Photonentorpedo wurde Abgeschossen");
            Treffer(angezieltesSchiff);

        }
        if ( getPhotonentorpedos()<anzahlderschüsse && anzahlderschüsse<=zahl){

            setPhotonentorpedos(zahl);
            System.out.println(anzahlderschüsse + " Photonentorpedo(s) eingesetzt");
            setPhotonentorpedos(getPhotonentorpedos() - anzahlderschüsse);
            NachrichtAnAlle("Photonentorpedo wurde Abgeschossen");
            Treffer(angezieltesSchiff);


        }
        if (anzahlderschüsse > zahl && zahl >0 ){

            anzahlderschüsse = zahl;
            setPhotonentorpedos(zahl);
            System.out.println(anzahlderschüsse + " Photonentorpedo(s) eingesetzt");
           setPhotonentorpedos(getPhotonentorpedos() - anzahlderschüsse);
            NachrichtAnAlle("Photonentorpedo wurde Abgeschossen");
            Treffer(angezieltesSchiff);
        }

        else {NachrichtAnAlle("-=*Click*=-\n");
        System.out.println("keine Photonentorpedos mehr geladen");}

    }

    /**
     *
     * @param angezieltesSchiff wird an Treffer übergeben nach der erfolgreichen Ausführung der if Verzweigung
     *                          die if wird solange ausgeführt wie das ausführende Schiff mehr als 50 enrgieversorgung hatt
     *                          nach der Ausführung werden 50  von energieversorgung  abgezogen
     *                          ansonsten wird else ausgeführt und es wird Click zu rückgegeben
     */

    public void Phasenkanoneschissen (Schiff angezieltesSchiff){
        if (energieversorgung>= 50){
            energieversorgung -=  50;
            NachrichtAnAlle("Phassenkanone wurde Abgeschossen\n");
            Treffer(angezieltesSchiff);
        }
        else {
            NachrichtAnAlle("-=*Click*=-");

        }

    }

    /**
     *
     * @param getroffenesSchiff wird ausgegeben mit .name Schiff um nicht den Speicherplatz zubekommen sonder den zugeortnetten Namen
     */

    private void Treffer (Schiff getroffenesSchiff){
        getroffenesSchiff.setSchilde (getroffenesSchiff.getSchilde()-50);
        //Schilde können nicht weniger Als 0 sein
        if(getroffenesSchiff.getSchilde()<0){
            getroffenesSchiff.setSchilde(0);
        }
        if (getroffenesSchiff.getSchilde()<=0){
            getroffenesSchiff.setHülle(getroffenesSchiff.getHülle()-50);
            //Hülle kann nicht weniger als 0 sein
            if(getroffenesSchiff.getHülle()<0){
                getroffenesSchiff.setHülle(0);
            }
            getroffenesSchiff.setEnergieversorgung(getroffenesSchiff.getEnergieversorgung()-50);
            //E kann nicht weniger als 0 sein
            if(getroffenesSchiff.getEnergieversorgung()<0){
                getroffenesSchiff.setEnergieversorgung(0);
            }
        }
        if(getroffenesSchiff.getHülle() <=0){
            getroffenesSchiff.setLebenserhaltung(0);
            NachrichtAnAlle(getroffenesSchiff.getNameSchiff()+ " Lebenserhaltungssysteme ausgefallen \n Schiff am ende!");

        }

       //System.out.println(getroffenesSchiff.getNameSchiff() +" wurde getroffen\n");
    }

    //Nachricht

    /**
     *
     * @param nachricht word Ausgegeben diese geht an Alle
     */

    //Nachricht die Alle erreicht
    public void NachrichtAnAlle (String nachricht ){
       broadcastKommunikator.add(nachricht);
       System.out.println(nachricht);
    }

    public ArrayList <String> EintreageLogbuchZureuckGeben (){
       return broadcastKommunikator;
    }

    public void LadeTorpedos(Schiff raumschiff,int anzahlphotonentorpedos){
        setPhotonentorpedos(anzahlphotonentorpedos);

        int stelle1= raumschiff.ladungsliste.indexOf("Photonentorpedo");
       raumschiff.ladungsliste.remove("Photonentorpedo");
        int stelle2= raumschiff.ladungsliste.indexOf(anzahlphotonentorpedos);
       raumschiff.ladungsliste.remove(stelle2);


       for (Ladung i : raumschiff.ladungsliste){
           if(i.getTyp().equals("Photonentorpedo")){

           }

          System.out.println("\nObjekt: "+i.getTyp()+ " da von vorhande:  " + i.getAnzahl());
        }


    }


    public boolean Schildeboo(Schiff raumschiff){
        return raumschiff.getSchilde() < 100;
    }
    public boolean Energieversorgungboo(Schiff raumschiff){
        return raumschiff.getEnergieversorgung() < 100;
    }
    public boolean Hülleboo(Schiff raumschiff){
        return raumschiff.getHülle() < 100;
    }



    public void ReparaturDurchfueren(int reperaturandroiden, boolean schutzschilt, boolean energieversorgung,
            boolean schiffshuelle) {
        //Zaufaszahl generieren zwischen 0 und 100
        Random ran = new Random();
        int zufalszahl = ran.nextInt(100 + 1);
        System.out.println("Ran: "+zufalszahl);
        int ergebniss=0;

        if(schutzschilt && energieversorgung && schiffshuelle) {
            ergebniss = (zufalszahl * reperaturandroiden) / 3;
            setSchilde(getSchilde()+ergebniss);
            setEnergieversorgung(getEnergieversorgung()+ergebniss);
            setHülle(getHülle()+ergebniss);

        }
        if ((schutzschilt && energieversorgung && !schiffshuelle)||(schutzschilt && !energieversorgung && schiffshuelle)||(!schutzschilt && energieversorgung && schiffshuelle)){
            ergebniss = (zufalszahl*reperaturandroiden)/2;
            if(schutzschilt && energieversorgung){
                setSchilde(getSchilde()+ergebniss);
                setEnergieversorgung(getEnergieversorgung()+ergebniss);
            }
            if(schutzschilt && schiffshuelle){
                setSchilde(getSchilde()+ergebniss);
                setHülle(getHülle()+ergebniss);
            }
            if(energieversorgung && schiffshuelle){
                setEnergieversorgung(getEnergieversorgung()+ergebniss);
                setHülle(getHülle()+ergebniss);
            }
        }

        if(schutzschilt || energieversorgung || schiffshuelle){
            ergebniss = (zufalszahl*reperaturandroiden);
            if(schutzschilt){
                setSchilde(getSchilde()+ergebniss);
            }
            if(energieversorgung ){
                setEnergieversorgung(getEnergieversorgung()+ergebniss);
            }
            if(schiffshuelle){
                setHülle(getHülle()+ergebniss);
            }

        }

        }





}
