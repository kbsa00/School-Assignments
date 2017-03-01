
/**
 * Write a description of class Lydbok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lydbok extends Bok
{ 
    private int min; 
    private int disker;
    private int registrert;
    private String oppleser;
    

    
    public Lydbok(int ISBN, String forfatter, String tittel, String forlag, int antallinne,int registrerte, int min, int disker,
    String oppleser)
    {
        super(ISBN, forfatter, tittel, forlag, antallinne); 
        setMinutter(min);
        setDisker(disker);
        setRegistrert(registrert);
        setOppleser(oppleser);
        
    }
   
    public void setMinutter(int min)
    {
        this.min = min;
    }
    
    public void setDisker(int disker)
    {
        this.disker = disker;
    }
    
    public void setRegistrert(int registrert)
    {
        this.registrert = registrert; 
        
    }
    
    public void setOppleser(String oppleser)
    {
        this.oppleser = oppleser;
    
    }
   
    public int getMinutter()
    {
        return min; 
    }
    
    public int getDisker()
    {
        return disker;
    }
    
    public int getRegisteret()
    {
        return registrert;
    }
    
    public String getOppleser()
    {
        return oppleser;
    }
    
    public String toString()
    {
        String retur = super.toString() + "Antall minutt" + getMinutter() + " Antall disker " + getDisker() +
        "Antall registeret" + getRegisteret() +
        " Oppleser " + getOppleser();
        return retur;
        
    }
    
}
