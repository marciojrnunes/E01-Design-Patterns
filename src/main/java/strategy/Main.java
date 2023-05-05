package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212"));

        validator.setPasswordStrategy(new SpecialCharStrategy());
        System.out.println(validator.validate("12$1#34!6"));
        System.out.println(validator.validate("1212"));

        validator.setPasswordStrategy(new UpperCaseStrategy());
        System.out.println(validator.validate("W$1#34!6"));
        System.out.println(validator.validate("1a12"));

    }
}
