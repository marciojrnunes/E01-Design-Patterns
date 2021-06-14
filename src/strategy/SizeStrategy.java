package strategy;

public class SizeStrategy extends ValidationStrategy {

    public boolean validate(String password) {
        return password.length() >= 8;
    }
    
}
