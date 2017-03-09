/**
 * Created by Mudasar on 09.03.2017.
 */
public class Date {

    private int dayNumber;
    private int monthNumber;
    private int year;

    public Date() {
    }

    public Date(int dayNumber, int monthNumber, int year) {
        this.dayNumber = dayNumber;
        this.monthNumber = monthNumber;
        this.year = year;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String switchMonth(int monthNumber) {

        String month = "";

        switch(monthNumber) {
            case 1: month = "Januar";
            break;
            case 2: month = "Februar";
            break;
            case 3: month = "Mars";
            break;
            case 4: month = "April";
            break;
            case 5: month = "Mai";
            break;
            case 6: month = "Juni";
            break;
            case 7: month = "Juli";
            break;
            case 8: month = "August";
            break;
            case 9: month = "September";
            break;
            case 10: month = "Oktober";
            break;
            case 11: month = "November";
            break;
            case 12: month = "Desember";
            break;
            default: month = "";

        }
        return month;
    }

    @Override
    public String toString() {
        return getDayNumber() + ". " + switchMonth(getMonthNumber()) + " " + getYear();


}
    /*
        Denne metoden sjekker opp to objekter mot hverandre og ser om disse har samme innhold.
        Objektene kjøres mot hverandre i Client klassen.
     */

    @Override
    public boolean equals(Object testObject) {
        if(!(testObject instanceof Date)) {
            return false;
        }
        if(testObject == this) {
            return true;
        }

        Date test = (Date) testObject;
            return test.getDayNumber() == getDayNumber() &&
                    test.getMonthNumber() == getMonthNumber() &&
                    test.getYear() == getYear();
    }
}
