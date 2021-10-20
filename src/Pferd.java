import java.util.Random;

public class Pferd {

    private String name;
    private int startnummer;
    private int gerannteStrecke = 0;
    private final static int MAX_RENN_DISTANZ = 11;

    public Pferd (String name, int startnummer)
    {
        this.name = name;
        this.startnummer = startnummer;
    }

    public void renne()
    {
        Random random = new Random();
        gerannteStrecke = gerannteStrecke + random.nextInt(MAX_RENN_DISTANZ);
    }

    public int getGerannteStrecke()
    {
        return gerannteStrecke;
    }

    public String toString()
    {
        return "Pferd " + name + ", mit der Startnummer " + startnummer;
    }

    public void setGerannteStrecke(int gerannteStrecke) {
        this.gerannteStrecke = gerannteStrecke;
    }
}
