package strategy;

public class Main {
    public static void main(String[] args) {

        PasswordValidator validatorTamanho = new Tamanho();
        ((Tamanho) validatorTamanho).setTamanho(8);
        System.out.println(validatorTamanho.validate("123123456"));
        System.out.println(validatorTamanho.validate("1212"));

        System.out.println("-------------------");

        PasswordValidator validatorPresencaDeLetrasMaiusculas = new PresencaDeLetrasMaiusculas();
        ((PresencaDeLetrasMaiusculas) validatorPresencaDeLetrasMaiusculas).setPresencaDeLetrasMaiusculas(true);
        System.out.println(validatorPresencaDeLetrasMaiusculas.validate("zxcvbN"));
        System.out.println(validatorPresencaDeLetrasMaiusculas.validate("zxcvbn"));

        System.out.println("-------------------");

        PasswordValidator validatorPresencaDeCaracteresEspeciais = new PresencaDeCaracteresEspeciais();
        ((PresencaDeCaracteresEspeciais) validatorPresencaDeCaracteresEspeciais).setPresencaDeCaracteresEspeciais(true);
        System.out.println(validatorPresencaDeCaracteresEspeciais.validate("qwer123!"));
        System.out.println(validatorPresencaDeCaracteresEspeciais.validate("Qwer1234"));

    }
}
