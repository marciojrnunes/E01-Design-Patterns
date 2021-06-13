package strategy;

public class UppercaseStrategy extends ValidatorStrategy {
    @Override
    boolean method(String password) {
        return password.matches(".*[A-Z].*");
    }
}
