package main.java.singleton;
import singleton.DBConnection;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        DBConnection db1 = DBConnection.getInstance();
        db1.connect();

        DBConnection db2 = DBConnection.getInstance();
        System.out.println("É a mesma instância? " + (db1 == db2));
    }
}
