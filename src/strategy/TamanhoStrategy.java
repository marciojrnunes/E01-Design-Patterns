package strategy;

public class TamanhoStrategy extends ValidatorStrategy {
    @Override
    boolean method(String password) {
        return password.length() >= 8;
    }
}
