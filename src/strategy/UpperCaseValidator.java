package strategy;

// classe que vai validar se existe letra maiúscula na senha
public class UpperCaseValidator extends PasswordValidatorStrategy{

    @Override
    boolean validatePassword(String password) {
        for(char i : password.toCharArray()) { // percorre o array de caracteres
            if (Character.isUpperCase(i)) { // se um caracter é maiúsculo
                return true; // retorna verdadeiro
            }
        }
        return false; // senão, retorna falso
    }
}
