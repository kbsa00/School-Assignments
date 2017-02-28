
/**
 * Write a description of class TryktBok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryktBok extends Bok
{
    // instance variables - replace the example below with your own 
    private int sider;
    private int registrert;
    
    
    public TryktBok(int ISBN, String tittel, String forfatter,int antallinne,
    String forlag, int sider, int registrert)
    {
        super(ISBN, tittel, forfatter, antallinne, forlag);
        setSider(sider); 
        setRegistrert(registrert); 
         
    
    }
    
    public void setSider(int sider)
    {
        this.sider = sider;
    }
    
    public void setRegistrert(int registrert)
    {
        this.registrert = registrert;
    }
   
    public int getSider()
    {
        return sider; 
    }
    
    
    public int getRegistrert()
    {
        return registrert;
    }
    
    public String toString()
    {
        String retur = super.toString() + " Antall sider " + getSider() + " Registrert " + getRegistrert() 
        ; 
        return retur;
    
    }
}
