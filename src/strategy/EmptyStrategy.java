package strategy;

public class EmptyStrategy extends ValidationStrategy {

    public boolean validate(String password) {
        return !password.isEmpty();
    }
}
