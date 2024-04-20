package singleton;

public class DBConnection {

    private static DBConnection instance;

    public DBConnection(String connectionString) {
        private DBConnection(String connectionString) {
            this.connectionString = connectionString;
        }
    
    }
    
    public static synchronized DBConnection getInstance() {
        
        if (instance == null) {
    
            instance = new DBConnection();
        }
    
        return instance;
    }
    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
    }
   
}

