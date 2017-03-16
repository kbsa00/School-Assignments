/**
 * Created by khalid_bs on 3/12/17.
 */
public class Clock extends Meter{
    private double time;

    public Clock()
    {

    }

    public Clock(double time, String regnum, String code, String status)
    {
        super(regnum, code, status);
        setTime(time);
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public String toString()
    {
        String retur = "Klokke \n" + "Minste tidsintervall: " + getTime()+ "\n" + super.toString();
        return retur;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Clock))
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }

        Clock c1 = (Clock) obj;
        return
        c1.getTime() == getTime();
    }
}
