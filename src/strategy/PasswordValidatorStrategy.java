package strategy;

// classe abstrata que irá permitir a abertura da PasswordValidator para novs métodos sem alterá-la diretamente
public abstract class PasswordValidatorStrategy {

    // criando método abstrato
    abstract boolean validatePassword(String password);
}
