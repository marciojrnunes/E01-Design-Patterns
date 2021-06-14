package strategy;

public class AlphaNumStrategy extends ValidationStrategy {
    
    public boolean validate(String password) {
        return password.matches("[a-zA-Z0-9]+");
    }
}
