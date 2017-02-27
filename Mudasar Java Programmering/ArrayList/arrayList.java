import java.util.ArrayList;

/**
 * Write a description of class arrayList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrayList
{
    private ArrayList<String> studentList;
    
    public void mainMethod() {
        studentList = new ArrayList<>();
        
        studentList.add("Mudasar");
        studentList.add("Khalid");
        studentList.add("Robert");
        
        System.out.println("The numbers of students " + studentList.size());
        
        System.out.println("The first student in the list " + studentList.get(0));
        System.out.println("The last student in the list " + studentList.get(studentList.size() - 1));
    }
}
