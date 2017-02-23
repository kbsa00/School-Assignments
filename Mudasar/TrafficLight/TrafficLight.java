/**
 * Write a description of class TrafficLight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrafficLight
{
    private String status;

    public TrafficLight() {
        status = "rødt";
    }

    public TrafficLight(String newStatus) {
        status = newStatus;
    }

    public String getStatus() {
        return status;
    }

    public void changeStatus(String nyStatus) {
        status = nyStatus;
    }

    public void changeStatus() {

        switch(status) {
            case "rødt" : changeStatus("rødt og gult");
            break;
            case "rødt og gult" : changeStatus("grønt");
            break;
            case "grønt" : changeStatus("gult");
            break;
            case "gult" : changeStatus("rødt");
        }
    }

    public void mainMethod() {

        for(int i = 0; i <= 5; i++) {
            System.out.println("Trafikklyset viser " + getStatus());
            System.out.println("Trafikklyset skifter status");
            changeStatus();
        }
        System.out.println("Trafikklyset viser " + getStatus());
    }
}
