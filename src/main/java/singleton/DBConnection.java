package singleton;

public class DBConnection {

    private String connectionString;

    private DBConnection(String connectionString){
        this.connectionString = connectionString;
    }

    private static DBConnection instancia;

    public static DBConnection getInstancia(String connectionString){
        if(instancia == null)
            instancia = new DBConnection(connectionString);
        else
            instancia.setString(connectionString);
        
        return instancia;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }

    public void setString(String cstring){
        this.connectionString = cstring;
    }
}
