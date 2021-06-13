package singleton;

public class DBConnection {

    private String connectionString;
/*
    public DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }
*/

    private  DBConnection(){}
    private static DBConnection instance;

    public static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
