package singleton;

public class DBConnection {

    private String connectionString;
    private static DBConnection connection;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static DBConnection getInstance(String connectionString){
        if (connection == null){

            connection = new DBConnection(connectionString);
        }

        return connection;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + connection.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
