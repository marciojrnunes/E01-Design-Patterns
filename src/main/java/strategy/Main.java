package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        System.out.println(validator.validate("123@"));
        System.out.println(validator.validate("aBcdef"));
        System.out.println(validator.validate("12345678"));

    }
}
