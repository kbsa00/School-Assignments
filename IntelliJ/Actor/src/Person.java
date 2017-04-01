/**
 * Created by khalid_bs on 4/1/17.
 */
public abstract class Person {
    private String name;
    private String socialsec;
    private int age;

    public Person() {

    }

    public Person(String name, String socialsec, int age) {
        this.name = name;
        this.socialsec = socialsec;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialsec() {
        return socialsec;
    }

    public void setSocialsec(String socialsec) {
        this.socialsec = socialsec;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Social Security: " + getSocialsec() + " Age: " + getAge();
    }
}
