import java.util.ArrayList;

public class Pferderennen {
    Pferd pferd;
    private int streckenLaenge;
    private int anzahlPferde;
    private ArrayList<Pferd> pferde = new ArrayList<Pferd>();
    private ArrayList<String> rangliste = new ArrayList<String>();


        public Pferderennen(int anzahlPferde, int streckenLaenge)
        {

            this.streckenLaenge = streckenLaenge;
            this.anzahlPferde = anzahlPferde;

            //generate Pferde
            for(int i = 0; i < anzahlPferde; i++)
            {
                pferd = new Pferd("Rudolf " + Integer.toString(pferde.size()),pferde.size());
                pferde.add(pferd);
            }

            lassPferdeRennen();



        }

        private String gerannteStreckeAlsBalken(Pferd pferd)
        {
            String balken = "| ";

            for(int i = 0; i < pferd.getGerannteStrecke(); i++){
                balken = balken + "*";
            }
            return balken;
        }

        public void lassPferdeRennen()
        {

            while(!rennenZuEnde())
            {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    // Kein Problem
                }

                System.out.println("");
                System.out.println("Aktueller stand:");


                for(int i = 0; i < pferde.size(); i++)
                {
                    if(streckenLaenge > pferde.get(i).getGerannteStrecke())
                    {
                        pferde.get(i).renne();
                            if(streckenLaenge <= pferde.get(i).getGerannteStrecke())
                            {
                                rangliste.add(pferde.get(i).toString());
                                pferde.get(i).setGerannteStrecke(streckenLaenge);
                            }
                    }




                    System.out.println(pferde.get(i).toString() + gerannteStreckeAlsBalken(pferde.get(i)));
                }
            }
            System.out.println("");
            getRangliste();
        }

        public boolean rennenZuEnde() {
            if (rangliste.size() >= pferde.size()) {
                return true;
            } else {
                return false;
            }
        }


        public void getRangliste()
        {
            for(int i = 0; i < rangliste.size(); i++){
                System.out.println("Auf Rang " + (i + 1) + ": " + rangliste.get(i) );
            }

        }

}
