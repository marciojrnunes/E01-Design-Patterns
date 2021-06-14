package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        validator.setValidator(new TamanhoStrategy());
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212"));

        validator.setValidator(new LetraMaiusculaStrategy());
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212"));

        validator.setValidator(new CaractereEspecialStrategy());
        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212"));

    }
}
