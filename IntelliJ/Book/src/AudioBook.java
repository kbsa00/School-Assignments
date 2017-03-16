/**
 * Created by khalidsaid on 03.03.17.
 */
public class AudioBook extends Book {
    private int minutter;
    private int disker;
    private String oppleser;

    public AudioBook( int ISBN, String forfatter, String tittel, String forlag, int antallInne, int registrert, int minutter , int disker, String oppleser)
    {
        super(ISBN, forfatter, tittel, forlag, antallInne, registrert);
        setMinutter(minutter);
        setDisker(disker);
        setOppleser(oppleser);
    }

    public void setMinutter(int minutter) {
        this.minutter = minutter;
    }

    public void setDisker(int disker) {
        this.disker = disker;
    }

    public void setOppleser(String oppleser) {
        this.oppleser = oppleser;
    }

    public int getMinutter() {
        return minutter;
    }

    public int getDisker() {
        return disker;
    }

    public String getOppleser() {
        return oppleser;
    }

    public String toString()
    {
        String retur = super.toString() + "Antall minutter: " + getMinutter() + "\nAntall disker: " + getDisker() +
                "\nOppleser: " + getOppleser();
        return retur;
    }

}
