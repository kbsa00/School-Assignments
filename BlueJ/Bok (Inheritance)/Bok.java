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
    private String forlag;
    private int antallinne; 
    
    public Bok()
    {
        this(0, "Ukjent", "Ukjent","Ukjent", 0);
    }
    
    public Bok(int ISBN, String forfatter, String tittel, String forlag, int antallinne)
    {
        this.ISBN = ISBN; 
        this.forfatter = forfatter ;
        this.tittel = tittel;
        this.forlag = forlag;
        this.antallinne = antallinne;
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
      return   "ISBN: " + getISBN() + "\n" + getForfatter() + "\n" +getTittel() + "\n" + getForlag() + 
      "\nAntall inne: " + getAntallinne() + "\n";
    }
}


