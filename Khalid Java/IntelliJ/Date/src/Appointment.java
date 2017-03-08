/**
 * Created by khalid_bs on 3/8/17.
 */
public class Appointment {
    private Date date;
    private  String time;
    private String agreement;

    public Appointment()
    {
        this(null, null, null);
    }

    public Appointment(Date date, String time, String agreement)
    {
        setDate(date);
        setTime(time);
        setAgreement(agreement);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAgreement() {
        return agreement;
    }

    public String getTime() {
        return time;
    }

    public Date getDate() {
        return date;
    }

    public String toString()
    {
    String returner = getDate() + "\n" + "Appointment: " +  getAgreement() + " Time: " + getTime();
    return returner;
    }

    /*
        En equals metode for Appointment objekter.
     */
    public boolean equals(Object different) {
        if (!(different instanceof Appointment))
        {
            return false;
        }
        if (different == this)
        {
            return true;
        }
        Appointment ap = (Appointment) different;
        return ap.getDate() == getDate() &&
                ap.getTime() == getTime() &&
                ap.getDate() == getDate();
    }
}
