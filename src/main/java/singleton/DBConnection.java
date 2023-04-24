package singleton;

public class DBConnection {

    //Variável para definir a rota de conexão
    private String connectionString;

    //Cria uma nova variável estática para validar a instancia
    private static DBConnection instance;

    //Costrutores privados para não ser permitido criar instancias fora da classe

    //Construtor com String para definir o local da conexão.
    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    //Construtor sem String define local padrão.
    private DBConnection(){
        this.connectionString = "localhost:3000";
    }



    //getInstance()  cria conexão com local padrão.
    public static DBConnection getInstance(){
        if (instance == null)
            instance = new DBConnection();
        return instance;
    }

    //getInstance(String) cria conexão com local definido por quem chama.
    public static DBConnection getInstance(String connectionString){
        if (instance == null)
            instance = new DBConnection(connectionString);
        return instance;
    }

    public void connect() throws InterruptedException {
        System.out.println("Connecting to " + this.connectionString);
        Thread.sleep(5000);
        System.out.println("Connected!!");
    }
}
