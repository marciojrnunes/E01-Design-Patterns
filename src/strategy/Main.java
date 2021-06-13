package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        // Adicionado à segunda senha os carateres "*A" para testar
        validator.setValidator(new LenghtStrategy());
        System.out.println("By lenght:");
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212*A"));

        validator.setValidator(new UppercaseStrategy());
        System.out.println("By uppercase:");
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212*A"));

        validator.setValidator(new SpecialCharacterStrategy());
        System.out.println("By special characters:");
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212*A"));

    }
}
