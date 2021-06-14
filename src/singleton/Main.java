package singleton;

public class Main {

    public static void main(String[] args) {
        DBConnection conn1 = DBConnection.getInstance("jdbc:as400://myiSeries;proxy server=myHODServer:3470");
        DBConnection conn2 = DBConnection.getInstance("jdbc:as400://myiSeries;proxy server=myHODServer:3470");

        try {
            conn1.connect();
            conn2.connect();
            System.out.println("Same connection? " + (conn1 == conn2));
        } catch (InterruptedException e) {
            System.out.println("Error when connecting to the database");
        }
    }
}
