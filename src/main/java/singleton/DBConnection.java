package singleton;

public class DBConnection {

    public static  DBConnection dbConnection;
    private String connectionString;

    //Retorna instancia unica de DBConnection
    public static DBConnection getInstaceDBConnection(){
        if(dbConnection == null)
            new DBConnection("DBConnection");
        return  dbConnection;
    }

    //Construtor privado da classe
    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }
}
