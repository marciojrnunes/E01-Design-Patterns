package strategy;

public class LenghtStrategy extends ValidatorStrategy {
    @Override
    boolean method(String password) {
        return password.length() >= 8;
    }
}
