
/**
 * Write a description of class TryktBok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryktBok extends Bok
{
    private int antallSider;
    private int antallRegistrert;

    public TryktBok(int isbn, String forfatter, String forlag, String tittel, int antallInne, int antallRegistrert, int antallSider) {
        super(isbn, forfatter, tittel, forlag, antallInne);
        setAntallSider(antallSider);
        setAntallRegistrert(antallRegistrert);
    }
    
    public void setAntallSider(int antallSider) {
        this.antallSider = antallSider;
    }
    
    public int getAntallSider() {
        return antallSider;
    }
    
    public void setAntallRegistrert(int antallRegistert) {
        this.antallRegistrert = antallRegistrert;
    }
    
    public int getAntallRegistrert() {
        return antallRegistrert;
    }
    
    public String toString() {
        String retur = super.toString() + " \nAntall sider: " + getAntallSider() + " \nAntall registrert: " + getAntallRegistrert();
        return retur;
    }
}
