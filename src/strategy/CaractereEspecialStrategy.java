package strategy;

import java.util.regex.Pattern;

public class CaractereEspecialStrategy extends ValidatorStrategy {
    @Override
    boolean method(String password) {
        Pattern special = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        return special.matcher(password).find();
    }
}