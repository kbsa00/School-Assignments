/**
 * Created by khalid_bs on 3/12/17.
 */
public class Weight extends Meter {
    private double maxWeight;
    private double minWeight;

    public Weight(){

    }

    public Weight(double minWeight, double maxWeight, String regnum, String code, String status) {
        super(regnum, code, status);
        setMaxWeight(maxWeight);
        setMinWeight(minWeight);
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public String toString()
    {
        String retur = "Weight \n" +  "(Min og maks temp: " + getMinWeight() + " - " + getMaxWeight()+ "\n" + super.toString();
        return retur;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Weight))
        {
            return false;
        }
        if(obj == this )
        {
            return true;
        }

        Weight w1 = (Weight) obj;
        return
        w1.getMaxWeight() == getMaxWeight() &&
        w1.getMinWeight() == getMinWeight();

    }
}
