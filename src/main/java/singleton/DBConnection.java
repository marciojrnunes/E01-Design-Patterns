package singleton;

public class DBConnection {

    private static DBConnection connectionString;

    private DBConnection() {}

    public static DBConnection getInstance() {
        if (connectionString == null) {
            connectionString = new DBConnection();
        }
        return connectionString;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
