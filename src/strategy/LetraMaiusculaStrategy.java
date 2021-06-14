package strategy;

public class LetraMaiusculaStrategy extends ValidatorStrategy {
    @Override
    boolean method(String password) {
        return password.matches(".*[A-Z].*");
    }
}
