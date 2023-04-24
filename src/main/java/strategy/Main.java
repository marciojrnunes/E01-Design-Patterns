package strategy;

public class Main {

    public static void testPassword(String password, PasswordStrategy strategy){

        if(strategy.validate(password))
            System.out.println("Senha Valida");
        else
            System.out.println("Senha Invalida");

    }
    public static void main(String[] args) {

        PasswordValidator strategy = new PasswordValidator();

        //Por padrão Length
        System.out.println("Length Validator");

        testPassword("123123456", strategy.getStrategy());
        testPassword("1212", strategy.getStrategy());
        System.out.println();

        System.out.println("UpperCase Validator");

        strategy.setPasswordStrategy(new UpperCaseStrategy());
        testPassword("Senha", strategy.getStrategy());
        testPassword("senha", strategy.getStrategy());
        System.out.println();

        System.out.println("SpecialChar Validator");

        strategy.setPasswordStrategy(new SpecialCharStrategy());
        testPassword("#senha", strategy.getStrategy());
        testPassword("senha", strategy.getStrategy());




    }
}
