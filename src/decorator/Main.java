package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Ketchup(new Milho(new Bacon(new Pao(new Pao()))));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

    }
}
