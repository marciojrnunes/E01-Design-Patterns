package strategy;

public class PasswordValidator {

    private PasswordStrategy passwordStrategy;

    public PasswordValidator(){
        setPasswordStrategy(new LengthStrategy());
    }

    public void setPasswordStrategy(PasswordStrategy passwordStrategy) {
        this.passwordStrategy = passwordStrategy;
    }

    public PasswordStrategy getPasswordStrategy() {
        return passwordStrategy;
    }

    public boolean validate(String password) {
        return passwordStrategy.validate(password);
    }

}
