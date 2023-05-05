package singleton;

public class DBConnection {

    private DBConnection() {}

    private static DBConnection instance;


    public static DBConnection getInstace() {
        if(instance == null)
        instance = new DBConnection();
        return instance;
        //this.connectionString = connectionString;
    }

    public void connect (String connectionString){
        /*System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");*/
        System.out.println(connectionString);

    }


void connection() {
    DBConnection con = DBConnection.getInstance();
    con.println("Connecting to "); 
  }
  
  void Connected() {
    DBConnection con = DBConnection.getInstance();
    con.println("Connected!!");
  }
}
