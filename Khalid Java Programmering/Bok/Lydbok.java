
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
    private String oppleser; 

    
    public Lydbok( String minutter, int disker, String oppleser, int ISBN, int antallinne,
    String tittel, String forfatter, String forlag)
    {
        super(ISBN, tittel, forfatter, antallinne, forlag); 
        setMinutter(min);
        setDisker(disker);
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
    
    public String getOppleser()
    {
        return oppleser;
    }
    
    public String toString()
    {
        String retur = super.toString() + "Antall minutt" + getMinutter() + " Antall disker " + getDisker() +
        " Oppleser " + getOppleser();
        return retur;
        
    }
    
}
