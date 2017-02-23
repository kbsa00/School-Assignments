
/**
 * Her bruker vi en switch metode til int og string
 */
public class WeekDay
{
    public String weekDay(int day) {

        String dayNumber = "";

        switch(day) {
            case 1: dayNumber = "Mandag";
            break;
            case 2: dayNumber = "Tirsdag";
            break;
            case 3: dayNumber = "Onsdag";
            break;
            case 4: dayNumber = "Torsdag";
            break;
            case 5: dayNumber = "Fredag";
            break;
            case 6: dayNumber = "Lørdag";
            break;
            case 7: dayNumber = "Søndag";
            break;
            default:  dayNumber = "Ukjent";
        }
        return dayNumber;
    }

    public int weekDay(String dayName) {

        int day = 0;

        switch(dayName) {
            case "mandag": day = 1;
            break;
            case "tirsdag": day = 2;
            break;
            case "onsdag": day = 3;
            break;
            case "torsdag": day = 4;
            break;
            case "fredag": day = 5;
            break;
            case "lørdag": day = 6;
            break;
            case "søndag": day = 7;
            break;
            default: day = 0;
        }
        return day;
    }
}
