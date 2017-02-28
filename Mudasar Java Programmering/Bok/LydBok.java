
/**
 * Write a description of class LydBok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LydBok extends Bok
{
    private int antallDisker;
    private int antallMinutter;
    private String oppleser;
    
    public LydBok(int isbn, String forfatter, String tittel, String forlag, int antallInne, int antallRegistrert, int antallMinutter, int antallDisker, String oppleser) {
        super(isbn, forfatter, tittel, forlag, antallInne, antallRegistrert);
        setAntallDisker(antallDisker);
        setAntallMinutter(antallMinutter);
        setOppleser(oppleser);
    }
    
    public void setAntallDisker(int antallDisker) {
        this.antallDisker = antallDisker;
    }
    
    public int getAntallDisker() {
        return antallDisker;
    }
    
    public void setAntallMinutter(int antallMinutter) {
        this.antallMinutter = antallMinutter;
    }
    
    public int getAntallMinutter() {
        return antallMinutter;
    }
    
    public void setOppleser(String oppleser) {
        this.oppleser = oppleser;
    }
    
    public String getOppleser() {
        return oppleser;
    }
    
    public String toString() {
        String retur = super.toString() + " \nAntall minutter: " + getAntallMinutter() + " \nAntall disker: " + getAntallDisker() + " \nOppleser: " + getOppleser();
        return retur;
    }
}
