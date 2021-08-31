package singleton;

public class DBConnection {

    private String connectionString;
    // criando instância da classe
    private static DBConnection instance;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
        System.out.println("Connected!!");
    }

    public static DBConnection getInstance(String connectionString) {
        if (instance == null) // se não existe instância
            instance = new DBConnection(connectionString); // cria uma nova instância
        return instance;
    }
}
