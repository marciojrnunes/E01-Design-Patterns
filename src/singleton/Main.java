package singleton;

public class Main {

    public static void main(String[] args) {
        /*
        DBConnection conn1 = new DBConnection("jdbc:as400://myiSeries;proxy server=myHODServer:3470");
        DBConnection conn2 = new DBConnection("jdbc:as400://myiSeries;proxy server=myHODServer:3470");
        */
        DBConnection connection = DBConnection.getInstance();

        try {
            connection.connect();

            System.out.println("Same connection? " + true); // só tem uma conexão
        } catch (InterruptedException e) {
            System.out.println("Error when connecting to the database");
        }
    }
}
