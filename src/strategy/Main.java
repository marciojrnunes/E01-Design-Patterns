package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();  
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate(""));

        validator.setValidationStrategy(new SizeStrategy());
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212"));

        validator.setValidationStrategy(new AlphaNumStrategy());
        System.out.println(validator.validate("senha_teste"));
        System.out.println(validator.validate("123teste"));
    }
}
