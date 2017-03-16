/**
 * Created by khalid_bs on 3/12/17.
 */
public class Thermometer extends Meter {
    private double minimum;
    private double maximum;

    public Thermometer()
    {

    }

    public Thermometer(double minimum, double maximum, String regnum, String code, String status)
    {
        super(regnum, code, status);
        setMaximum(maximum);
        setMinimum(minimum);
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getMaximum() {
        return maximum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public String toString()
    {
        String retur = "Tempratur \n" + "Min og maks temp: " + getMinimum() + " - " + getMaximum()+ "\n" + super.toString();
        return retur;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Thermometer))
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }

        Thermometer t1 = (Thermometer) obj;

        return
                t1.getMaximum() == getMaximum() &&
                t1.getMinimum() == getMinimum();
    }
}
