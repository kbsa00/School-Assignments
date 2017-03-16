/**
 * Created by khalid_bs on 3/8/17.
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date()
    {


    }

    public Date(int day, int month, int year)
    {
        setDay(day);;
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    public String month(int day)
    {
        String monthnr = "";
        switch (day)
        {
            case 1: monthnr = "Januar";
            break;
            case 2: monthnr = "Februar";
            break;
            case 3: monthnr = "Mars";
            break;
            case 4: monthnr = "April";
            break;
            case 5: monthnr = "Mai";
            break;
            case 6: monthnr = "Juni";
            break;
            case 7: monthnr = "Juli";
            break;
            case 8: monthnr = "August";
            break;
            case 9: monthnr = "September";
            break;
            case 10: monthnr = "Oktober";
            break;
            case 11: monthnr = "November";
            break;
            case 12: monthnr = "Desember";
            break;
            default: monthnr = "Default";

        }
        return monthnr;

    }
    /*
        Denne metoden sjekker opp to objekter mot hverandre og ser om disse har samme innhold.
        Objektene kjøres mot hverandre i Client klassen.
     */

    public boolean check (Object obj) {
        if (!(obj instanceof Date))
        {
            return false;
        }
        if (obj == this)
        {
            return true;
        }
        Date test = (Date) obj;
        return test.getDay() == getDay() &&
                test.getMonth() == getMonth() &&
                test.getYear() == getYear();
    }

    public String toString()
    {
        String retur = "Day: " + getDay() + ". " + " Month: " + month(getMonth()) + ", " + " Year: " + getYear() + "."
                + "\n";
        return retur;

    }
}
