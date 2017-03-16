/**
 * Created by khalidsaid on 03.03.17.
 */
public class Published extends Book
{
    private int sider;


    public Published(int ISBN, String forfatter, String tittel, String forlag, int antallInne, int registrert,
                     int sider)
    {
        super(ISBN, forfatter, tittel, forlag, antallInne, registrert);
        setSider(sider);


    }

    public void setSider(int sider) {
        this.sider = sider;
    }


    public int getSider() {
        return sider;
    }

    public String toString() {
        String retur = super.toString() +  "Antall sider: " + getSider();
        return retur;
    }
}
