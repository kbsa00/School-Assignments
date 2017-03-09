/**
 * Created by Mudasar on 09.03.2017.
 */
public class Appointment {

    private Date date;
    private String time;
    private String agreement;

    public Appointment() {
        this(null, null, null);
    }

    public Appointment(Date date, String time, String agreement) {
        setDate(date);
        setTime(time);
        setAgreement(agreement);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getAgreement() {
        return agreement;
    }

    public String toString() {
        return getDate() + "" + getTime() + "" + getAgreement();
    }

    public boolean equals(Object testObject) {
        if(!(testObject instanceof Appointment)) {
            return false;
        }
        if(testObject == this) {
            return true;
        }

        Appointment test = (Appointment) testObject;
        return test.getDate() == getDate() &&
                test.getTime() == getTime() &&
                test.getAgreement() == getAgreement();
    }
}
