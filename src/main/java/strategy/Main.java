package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        validator.setStrategy(new LengthStrategy());
        System.out.println("TESTE TAMANHO SENHA");
        System.out.println(validator.validate("123456789"));
        System.out.println(validator.validate("123"));

        validator.setStrategy(new UpperCaseStrategy());
        System.out.println("TESTE LETRAS MAIUSCULAS");
        System.out.println(validator.validate("SenhaSuperSecreta"));
        System.out.println(validator.validate("senhaseupersecreta"));

        validator.setStrategy(new SpecialCharStrategy());
        System.out.println("TESTE CARACTERE ESPECIAL");
        System.out.println(validator.validate("senha@%"));
        System.out.println(validator.validate("senha"));

    }
}

