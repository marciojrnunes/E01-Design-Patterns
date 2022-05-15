package singleton;

public class DBConnection {

   private static DBConnection instance;

    private String connectionString;

    private DBConnection() {

    }

    //public DBConnection(String connectionString) {
    //    this.connectionString = connectionString;
   // }

    public static synchronized DBConnection getInstance(String connectionString) {
        if (instance == null)
        instance = new DBConnection();
        instance.connectionString = connectionString;
        return instance;
    }

    public void connect(String connectionString) throws InterruptedException {
        System.out.println("Connecting to " + instance.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
