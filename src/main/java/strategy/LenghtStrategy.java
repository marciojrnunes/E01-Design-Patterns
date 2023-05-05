package strategy;

public class LengthStrategy extends PasswordStrategy {

    private final int minSize;

    public LengthStrategy(int minSize) {
        this.minSize = minSize;
    }

    @Override
    public boolean validate(String password) {
        return password.length() >= minSize;
    }

}
