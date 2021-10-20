import javax.swing.*;

public class PferderennenGUI {


  private int anzahlPferde;
  private int laengeStrecke;


  public void startePferderennen(){
    anzahlPferde = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die Anzahl Pferde ein."));
    laengeStrecke = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie bitte die Länge der Strecke ein"));

    Pferderennen pferderennen = new Pferderennen(anzahlPferde, laengeStrecke);

  }




}
