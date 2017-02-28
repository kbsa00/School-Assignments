
/**
 * Write a description of class Bok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bok
{
    private int isbn; 
    private int antallInne;
    private String forlag;
    private String forfatter;
    private String tittel;
    private int antallRegistrert;
    
    public Bok(int isbn, String forfatter, String tittel, String forlag, int antallInne, int antallRegistrert) {
        setIsbn(isbn);
        setAntallInne(antallInne);
        setForlag(forlag);
        setForfatter(forfatter);
        setTittel(tittel);
        setAntallRegistrert(antallRegistrert);
    }
    
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    public int getIsbn() {
        return isbn;
    }
    
    public void setAntallInne(int antallInne) {
        this.antallInne = antallInne;
    }
    
    public int getAntallInne() {
        return antallInne;
    }
    
    public void setForlag(String forlag) {
        this.forlag = forlag;
    }
    
    public String getForlag() {
        return forlag;
    }
    
    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }
    
    public String getForfatter() {
        return forfatter;
    }
    
    public void setTittel(String tittel) {
        this.tittel = tittel;
    }
    
    public String getTittel() {
        return tittel;
    }
    
    public void setAntallRegistrert(int antallRegistrert) {
        this.antallRegistrert = antallRegistrert;
    }
    
    public int getAntallRegistrert() {
        return antallRegistrert;
    }
    
    public String toString() {
        return "ISBN: " + getIsbn() + " \nForfatter: " + getForfatter() + " \nTittel: " + getTittel() + " \nForlag: " + getForlag() + " \nAntall inne: " + getAntallInne() + " \nAntall Registrert " + getAntallRegistrert();
    }
}
