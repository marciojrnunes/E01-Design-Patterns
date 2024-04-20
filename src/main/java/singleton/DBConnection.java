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
            // Cria uma nova instância se ainda não existir
            instance = new DBConnection();
        }
        // Retorna a instância existente
        return instance;
    }
    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(1000);
    }
   
}

