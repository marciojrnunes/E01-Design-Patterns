package strategy;
import strategy.LengthStrategy;
import strategy.UpperCaseStrategy;
import strategy.SpecialCharStrategy;
import strategy.PasswordValidator;

public class Main {
    public static void main(String[] args) {
        
        PasswordValidator validator = new PasswordValidator();

        // Testando validação por comprimento
        validator.setStrategy(new LengthStrategy());
        System.out.println("Length strategy (valid): " + validator.validate("111111111"));
        System.out.println("Length strategy (invalid): " + validator.validate("1212"));

        // Testando validação por letra maiúscula
        validator.setStrategy(new UpperCaseStrategy());
        System.out.println("UpperCase strategy (valid): " + validator.validate("55AAA"));
        System.out.println("UpperCase strategy (invalid): " + validator.validate("55aaa"));

        // Testando validação por caractere especial
        validator.setStrategy(new SpecialCharStrategy());
        System.out.println("SpecialChar strategy (valid): " + validator.validate("123abc@"));
        System.out.println("SpecialChar strategy (invalid): " + validator.validate("123abc"));
    }
}
