package singleton;

public class DBConnection {

    private static DBConnection instancia;
    private String connectionString;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public static synchronized DBConnection getInstance(String connectionString) {
        if (instancia == null) {
            instancia = new DBConnection(connectionString);
        }
        return instancia;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
