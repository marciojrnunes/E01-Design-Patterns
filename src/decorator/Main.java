package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Bacon(new Queijo(new Salada(new Carne(new Pao()))));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

        Ingrediente produto2 = new Bacon(new Queijo(new Carne(new Pao())));

        System.out.println(produto2.imprimeIngrediente());
        System.out.println(produto2.valorDoIngrediente());

    }
}
