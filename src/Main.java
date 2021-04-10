/**@author Maria
 *@throws Main Classe zum verbinden der klassen
 */
//Allgemeine Nots
//  mit new Klassenname rufe die Klasse auf um ein Objekt in ihr zuerstellen
//. gehe in das Objekt rein

public class Main {

    public static void main(String[] args) {

      //Speicherplatz für Ladung freihalten
      Ladung ladung1 = new Ladung();
      Ladung ladung2 = new Ladung();
      Ladung ladung3 = new Ladung();
      Ladung ladung4 = new Ladung();
      Ladung ladung5 = new Ladung();
      //vulkanier
      Ladung ladung6 = new Ladung("Forschungssonden",35);
      Ladung ladung7 = new Ladung("Photonentorpedo", 3);


      //Speicherplatz für Schiffe frei halten
      Schiff klingonen = new Schiff();
      Schiff romulaner = new Schiff();
      Schiff vulkania = new Schiff();

    //Ladungen der Schiffe
    //klingonen
    ladung1.setTyp("Schneckensaft");
    ladung1.setAnzahl(200);
    ladung2.setTyp("Bat`Klingonen Schwerter");
    ladung2.setAnzahl(200);

    //romulaner
    ladung3.setTyp("Borg-Schrott");
    ladung3.setAnzahl(5);
    ladung4.setTyp("Rote-Materie");
    ladung4.setAnzahl(2);
    ladung5.setTyp("Plasma-Waffen");
    ladung5.setAnzahl(50);



    //Aussattunge der Schiffe
    //klingonen
    klingonen.setPhotonentorpedos(1);
    klingonen.setEnergieversorgung(100);
    klingonen.setSchilde(100);
    klingonen.setHülle(100);
    klingonen.setLebenserhaltung(100);
    klingonen.setNameSchiff("IKS Hegh´ta");
    klingonen.setReperaturandroiden(2);
    klingonen.addLadung(ladung1);
    klingonen.addLadung(ladung2);


    //romulaner
    romulaner.setPhotonentorpedos(2);
    romulaner.setEnergieversorgung(100);
    romulaner.setSchilde(100);
    romulaner.setHülle(100);
    romulaner.setLebenserhaltung(100);
    romulaner.setNameSchiff("IKS Khazara");
    romulaner.setReperaturandroiden(2);
    romulaner.addLadung(ladung3);
    romulaner.addLadung(ladung4);
    romulaner.addLadung(ladung5);

    //vulkania
        vulkania.setPhotonentorpedos(0);
        vulkania.setEnergieversorgung(80);
        vulkania.setSchilde(80);
        vulkania.setHülle(50);
        vulkania.setLebenserhaltung(100);
        vulkania.setNameSchiff("Ni´Var");
        vulkania.setReperaturandroiden(5);
        vulkania.addLadung(ladung6);
        vulkania.addLadung(ladung7);




    //Methoden Ausführen
        klingonen.Torpedoschissen(romulaner,1);
        romulaner.Phasenkanoneschissen(klingonen);
        vulkania.NachrichtAnAlle("Gewalt ist nicht logisch");
        klingonen.ZustandSchiff();
        klingonen.LadungsListe();
        klingonen.Torpedoschissen(romulaner,1);
        klingonen.Torpedoschissen(romulaner,1);
        klingonen.ZustandSchiff();
        klingonen.LadungsListe();
        romulaner.ZustandSchiff();
        romulaner.LadungsListe();
        vulkania.ZustandSchiff();
        vulkania.LadungsListe();



        int vandroiden = vulkania.getReperaturandroiden();

        boolean schutzschild = vulkania.Schildeboo(vulkania);
        boolean energieversorgung= vulkania.Energieversorgungboo(vulkania);
        boolean schiffshuelle= vulkania.Hülleboo(vulkania);

        //System.out.println(schiffshuelle);

        vulkania.ReparaturDurchfueren(vandroiden, schutzschild, energieversorgung,
        schiffshuelle);


        int zahl= vulkania.LadungsListeV("Photonentorpedo");
        vulkania.LadeTorpedos(vulkania,zahl);




    }
}