import java.util.*;
/**
 * Created by khalid_bs on 3/12/17.
 */
public abstract class Meter implements Comparable<Meter>  {
    private String regnum;
    private String status;
    private String code;

    public Meter() {

    }

    public Meter(String regnum, String code, String status) {
        setCode(code);
        setRegnum(regnum);
        setStatus(status);

    }

    public String getRegnum() {
        return regnum;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String toString() {
        String retur = "Regnummer: " + getRegnum()  + "\n" + "Plassering: " + getCode() + "\n" + "Status: " +
                getStatus() + "\n";
        return retur;

    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Meter))
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }

        Meter m1 =  (Meter) obj;
        return
        m1.getCode() == getCode() &&
        m1.getRegnum() == getRegnum() &&
        m1.getStatus() == getStatus();
    }


    public int compareTo(Meter o) {
        int compare = o.getRegnum().compareTo(getRegnum());
        return compare;
    }
}
