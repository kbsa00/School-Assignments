

public class Client {

    public static void main (String[] args) {

        MeterArchive m1 = new  MeterArchive();

         m1.add(new Clock(1, "2K17" , "PK2018", "I ORDEN"));
         m1.add(new Weight(1.3, 4.9, "2K18",  "PK2017", "I ORDEN"));
         m1.add(new Thermometer(1.0, 2.0, "2K19", "PK2019", "I ORDEN" ));
         m1.add(new Weight(1.9 , 200.01, "2K20", "PK2020", "I ORDEN" ));
         m1.add(new Clock(5, "2K21", "PK2021", "I ORDEN"));
        System.out.println("Overskrift over alle instrumentene");
        //Sorterer register tallene fra høyest til lavest..
        m1.sortList();
        m1.print();


        m1.remove("");

        System.out.println("Skifter status: ");
        m1.changeStatus("2K21");

        System.out.println("Oversikt over alle instrumentene: \n");
        m1.print();






    }
}
