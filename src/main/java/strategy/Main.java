package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();
        System.out.println(validator.validate("abcdEfg"));

    }
}
