package strategy;

public class Main {

    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        
        validator.setStrategy(new LengthStrategy(8));
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212"));

        
        validator.setStrategy(new UpperCaseStrategy());
        System.out.println(validator.validate("senha"));
        System.out.println(validator.validate("Senha"));

        validator.setStrategy(new SpecialCharStrategy());
        System.out.println(validator.validate("senha"));
        System.out.println(validator.validate("senha!"));

    }

}
