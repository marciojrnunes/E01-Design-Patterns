package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Pao(new Queijo(new Bacon(new Ketchup(new Salada()))));
        System.out.println("INGREDIENTES: " + produto.imprimeIngrediente());
        System.out.println("PREÇO TOTAL: " + produto.valorDoIngrediente());

    }
}
