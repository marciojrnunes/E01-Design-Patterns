package singleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        DBConnection conn1 = DBConnection.connect("jdbc:as400://myiSeries;proxy server=myHODServer:3470");
        DBConnection conn2 = DBConnection.connect("jdbc:as400://myiSeries;proxy server=myHODServer:3471");

        try {
            conn1.connect("jdbc:as400://myiSeries;proxy server=myHODServer:3470");
            conn2.connect("jdbc:as400://myiSeries;proxy server=myHODServer:3471");

            System.out.println("Same connection? " + (conn1 == conn2));
        } catch (InterruptedException e) {
            System.out.println("Error when connecting to the database");
        }
    }
}
