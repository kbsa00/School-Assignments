import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by khalidsaid on 13.03.17.
 */
public class MeterArchive {

    private ArrayList<Meter> list;

    public MeterArchive() {
    list = new ArrayList<Meter>();
    }

    public Meter get(String regnum) {
        for (int i = 0; i < list.size(); i++) {


            System.out.println(list.get(i));


        }
        return null;
    }

    public void add(Meter meter)
    {
        list.add(meter);
    }

    public void print() {
        for (Meter p : list) {
            System.out.println(p);
        }
    }

    public void changeCode(String regnum, String code)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getRegnum().equals(regnum))
            {
                list.get(i).setCode(code);

            }
        }

    }

    public boolean changeStatus(String regnum) {
        for (Meter p : list)
        {
            if (p.getRegnum().equals(regnum))
            {
                p.setStatus("I UORDEN");
                return true;
            }

        }
        return false;
    }


    public boolean remove(String regnum)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getRegnum().equals(regnum))
            {
                list.remove(i);
                return true;
            }

        }


        System.out.println("Ukjent registeringsnummer. \n");
        return false;
    }

    public void sortList()
    {
        Collections.sort(list);
    }


}

