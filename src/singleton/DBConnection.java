
public class DBConnection {

    private static String connectionString;

    private DBConnection(String connectionString) {
        this.connectionString = connectionString;
    }

    private static DBConnection dbConnection;

    public static DBConnection connect(String connectionString) throws InterruptedException{
        if (dbConnection == null) {
            dbConnection = new DBConnection(connectionString);
        }
        return dbConnection;
    }
}
