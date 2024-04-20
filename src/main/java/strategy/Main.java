package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        // testando as validações de cada tiupo
        validator.setStrategy(new LengthStrategy()); // pelo menos 8 caracteres
        System.out.println("Senha '123123456' é válida? " + validator.validate("123123456"));
        System.out.println("Senha '1212'  é válida? " + validator.validate("1212"));

        validator.setStrategy(new UpperCaseStrategy()); // pelo menos uma letra maiuscula
        System.out.println("Senha 'abcdefgH' válida? " + validator.validate("abcdefgH"));
        System.out.println("Senha 'abcdefg' válida? " + validator.validate("abcdefg"));

        validator.setStrategy(new SpecialCharStrategy()); // pleo menos um caractere especial
        System.out.println("Senha 'abc@123' válida? " + validator.validate("abc@123"));
        System.out.println("Senha 'abcdefg' válida? " + validator.validate("abcdefg"));

    }
}
