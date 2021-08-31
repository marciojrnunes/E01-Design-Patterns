package strategy;

// classe que vai validar o tamanho da senha
public class LengthValidator extends PasswordValidatorStrategy{

    // método de validação do tamanho da senha
    @Override
    public boolean validatePassword(String password) { // retorna true se a senha tiver mais de 8 caracteres
        return password.length() >= 8;
    }
}
