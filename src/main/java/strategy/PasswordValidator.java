
public class PasswordValidator {

    private PasswordValidatorStrategy strategy;

     public PasswordValidator(){
        strategy = new LengthStrategy();
    }

    public void setValidateStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public boolean validate(String password) {
       return strategy.validate(password);
    }

}
