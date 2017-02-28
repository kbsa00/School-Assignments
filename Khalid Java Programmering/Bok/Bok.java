
/**
 * Write a description of class Bok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bok
{
    // instance variables - replace the example below with your own
    private int ISBN; 
    private String tittel; 
    private String forfatter; 
    private int antallinne; 
    private String forlag;
    public Bok()
    {
        this(0, "Ukjent", "Ukjent", 0, "Ukjent");
    }
    
    public Bok(int ISBN, String tittel, String forfatter, int antallinne, String forlag)
    {
        this.ISBN = ISBN; 
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.antallinne = antallinne;
        this.forlag = forlag;
    }
    
    public void SetTittel(String tittel)
    {
        this.tittel = tittel;
    }
    
    public void SetISBN(int ISBN)
    {
        this.ISBN = ISBN;
    }
    
    public void SetForfatter(String forfatter)
    {
        this.forfatter = forfatter;
    
    }
    
    public void setAntallInne(int antallinne)
    {
        this.antallinne = antallinne;
    }
    
    public void setForlag(String forlag)
    {
        this.forlag = forlag;
    }
    
    public String getTittel()
    {
        return tittel; 
    }
    
    public int getISBN()
    {
        return ISBN; 
    }
    
    public String getForfatter()
    {
        return forfatter;
    }
    
    public int getAntallinne()
    {
        return antallinne; 
    }
    
    public String getForlag()
    {
        return forlag;
    }
    
    public String toString()
    {
      return "(" + "Tittel " + getTittel() + " Forfatter " + getForfatter() + " IBN: " + getISBN()
      + " antall inne " + getAntallinne() + " forlag " + getForlag(); 
    }
}
