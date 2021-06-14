package strategy;

import strategy.strategy.PasswordValidator;
import strategy.strategy.ValidateCaracteresEspeciais;
import strategy.strategy.ValidateLetrasMaiusculas;
import strategy.strategy.ValidateNumbers;
import strategy.strategy.ValidateSize;


public class Main {
    public static void main(String[] args) {

        String pass1 = "World2021";
        String pass2 = "HelloWorld!";
        String pass3 = "Hey2021";


        ValidateCaracteresEspeciais s1 = new ValidateCaracteresEspeciais();
        ValidateLetrasMaiusculas s2 = new ValidateLetrasMaiusculas();
        ValidateNumbers s3 = new ValidateNumbers();
        ValidateSize s4 = new ValidateSize();


        PasswordValidator validator = new PasswordValidator();
        System.out.println(validator.validate("123123456"));
        validator.setValidateStrategy(s1);
        System.out.println(validator.validate("123123456"));
        validator.setValidateStrategy(s2);
        System.out.println(validator.validate("123123456"));
        validator.setValidateStrategy(s3);
        System.out.println(validator.validate("123123456"));


        System.out.println("\n===============\nPass 1: \n" + validator.validate(pass1));
        validator.setValidateStrategy(s1);
        System.out.println(validator.validate(pass1));
        validator.setValidateStrategy(s2);
        System.out.println(validator.validate(pass1));
        validator.setValidateStrategy(s3);
        System.out.println(validator.validate(pass1));
        validator.setValidateStrategy(s4);
        System.out.println(validator.validate(pass1));


        System.out.println("\n===============\nPass 2: \n" + validator.validate(pass2));
        validator.setValidateStrategy(s1);
        System.out.println(validator.validate(pass2));
        validator.setValidateStrategy(s2);
        System.out.println(validator.validate(pass2));
        validator.setValidateStrategy(s3);
        System.out.println(validator.validate(pass2));
        validator.setValidateStrategy(s4);
        System.out.println(validator.validate(pass2));


        System.out.println("\n===============\nPass 3: \n" + validator.validate(pass3));
        validator.setValidateStrategy(s1);
        System.out.println(validator.validate(pass3));
        validator.setValidateStrategy(s2);
        System.out.println(validator.validate(pass3));
        validator.setValidateStrategy(s3);
        System.out.println(validator.validate(pass3));
        validator.setValidateStrategy(s4);
        System.out.println(validator.validate(pass3));

    }
}
