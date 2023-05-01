package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validator = new PasswordValidator();

        System.out.println(validator.validate("123123456"));
        System.out.println(validator.validate("1212"));

        
        // Define a estratégia de validação por tamanho
        validator.setStrategy(new LengthStrategy());

        // Valida uma senha
        String password = "Senha123";
        boolean isValid = validator.validate(password);
        System.out.println("Senha \"" + password + "\" é válida? " + isValid);

        // Define a estratégia de validação por caracteres em maiúsculo
        validator.setStrategy(new UpperCaseStrategy());

        // Valida outra senha
        password = "senha123";
        isValid = validator.validate(password);
        System.out.println("Senha \"" + password + "\" é válida? " + isValid);

        // Define a estratégia de validação por caracteres especiais
        validator.setStrategy(new SpecialCharStrategy());

        // Valida outra senha
        password = "Senha#123";
        isValid = validator.validate(password);
        System.out.println("Senha \"" + password + "\" é válida? " + isValid);
    }
}
