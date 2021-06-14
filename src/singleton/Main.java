package singleton;

public class Main {

    public static void main(String[] args) {

        // DBConnection conn1 = new DBConnection("jdbc:as400://myiSeries;proxy server=myHODServer:3470");
        // DBConnection conn2 = new DBConnection("jdbc:as400://myiSeries;proxy server=myHODServer:3470");

        DBConnection conn1 = DBConnection.getInstance();
        conn1.setConnectionString("jdbc:as400://myiSeries;proxy server=myHODServer:3470");
        DBConnection conn2 = DBConnection.getInstance();
        conn2.setConnectionString("jdbc:as400://myiSeries;proxy server=myHODServer:3470");

        try {
            conn1.connect();
            conn2.connect();

            System.out.println("Same connection? " + (conn1 == conn2));
        } catch (InterruptedException e) {
            System.out.println("Error when connecting to the database");
        }
    }
}
