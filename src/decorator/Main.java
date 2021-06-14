package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente pao_com_queijo = new Pao(new Queijo());
        Ingrediente batata_com_bacon_e_ketchup = new Batata(new Bacon(new Ketchup()));
        Ingrediente bacon_e_ketchup = new Bacon(new Ketchup());
        Ingrediente pao_e_ketchup_e_maionese_e_bacon = new Pao(new Ketchup(new Maionese(new Bacon())));
        Ingrediente maionese_e_ketchup = new Maionese(new Ketchup());
        Ingrediente batata_e_bacon = new Batata(new Bacon());

        System.out.println(pao_com_queijo.imprimeIngrediente());
        System.out.println(pao_com_queijo.valorDoIngrediente());

        System.out.println(batata_com_bacon_e_ketchup.imprimeIngrediente());
        System.out.println(batata_com_bacon_e_ketchup.valorDoIngrediente());
        
        System.out.println(bacon_e_ketchup.imprimeIngrediente());
        System.out.println(bacon_e_ketchup.valorDoIngrediente());
        
        System.out.println(pao_e_ketchup_e_maionese_e_bacon.imprimeIngrediente());
        System.out.println(pao_e_ketchup_e_maionese_e_bacon.valorDoIngrediente());
        
        System.out.println(maionese_e_ketchup.imprimeIngrediente());
        System.out.println(maionese_e_ketchup.valorDoIngrediente());
        
        System.out.println(batata_e_bacon.imprimeIngrediente());
        System.out.println(batata_e_bacon.valorDoIngrediente());

    }
}
