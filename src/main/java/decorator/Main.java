package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Pao(new Bacon(new Ketchup(new Salada(new Queijo()))));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

    }
}
