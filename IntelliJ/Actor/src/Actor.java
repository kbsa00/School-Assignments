/**
 * Created by khalid_bs on 4/1/17.
 */
public class Actor extends Person implements talents {
    private String experience;

    public Actor(){

    }

    public Actor(String name, String socialsec, int age, String experience) {
        super(name, socialsec, age);
        this.experience = experience;
    }

    public String  getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public void Sing(String sing) {
        System.out.println(sing);

    }

    @Override
    public void readlines(String read) {
        System.out.println(read);
    }

    @Override
    public void Dance(String dance) {
        System.out.println(dance);
    }

    @Override
    public String toString() {
        return super.toString() + " Experience Year: " + getExperience() + "\n";
    }
}
