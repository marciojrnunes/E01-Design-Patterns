package strategy;

abstract class PasswordValidator {

    // FIXME só aceita um tipo de validação (por tamanho)

    abstract boolean validate(String password);

}
