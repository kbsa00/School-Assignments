
/**
 * Write a description of class TryktBok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryktBok extends Bok
{
    private int antallSider;

    public TryktBok(int isbn, String forfatter,String tittel, String forlag, int antallInne, int antallRegistrert, int antallSider) {
        super(isbn, forfatter, tittel, forlag, antallInne, antallRegistrert);
        setAntallSider(antallSider);
    }
    
    public void setAntallSider(int antallSider) {
        this.antallSider = antallSider;
    }
    
    public int getAntallSider() {
        return antallSider;
    }
    
    public String toString() {
        String retur = super.toString() + " \nAntall sider: " + getAntallSider();
        return retur;
    }
}
