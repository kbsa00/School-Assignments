/**
 * Created by khalidsaid on 03.03.17.
 */
public class Book {
    private int ISBN;
    private String forfatter;
    private String tittel;
    private String forlag;
    private int antallInne;
    private int registrert;

    public Book()
    {

    }

    public Book(int ISBN, String forfatter, String tittel, String forlag, int antallInne, int registrert)
    {
        this.ISBN = ISBN;
        this.forfatter = forfatter;
        this.tittel = tittel;
        this.forlag = forlag;
        this.antallInne = antallInne;
        this.registrert = registrert;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public void setForlag(String forlag) {
        this.forlag = forlag;
    }

    public void setAntallInne(int antallInne) {
        this.antallInne = antallInne;
    }

    public void setRegistrert(int registrert) {
        this.registrert = registrert;
    }

    public String getForfatter() {
        return forfatter;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTittel() {
        return tittel;
    }

    public String getForlag() {
        return forlag;
    }

    public int getAntallInne() {
        return antallInne;
    }

    public int getRegistrert() {
        return registrert;
    }

    public String toString() {
        return "ISBN: " + getISBN() + "\n" + getForfatter() + "\n" + getTittel() + "\n" + getForlag() +
                "\nAntall inne: " + getAntallInne() + "\nRegistrert: " + getRegistrert() + "\n";


    }
}
