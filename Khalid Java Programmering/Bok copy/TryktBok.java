
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
    
    
    public TryktBok(int ISBN, String forfatter, String tittle, String forlag,
    int antallinne,  int registrert, int sider)
    {
        super(ISBN, forfatter, tittle, forlag, antallinne);
        setRegistrert(registrert);
        setSider(sider); 
         
         
    
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
