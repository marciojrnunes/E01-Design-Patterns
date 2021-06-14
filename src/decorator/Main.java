package decorator;

public class Main {

    public static void main(String[] args) {

        //Ingrediente produto = new Pao(new Pao());
        Ingrediente produto = new Pao(new Carne(new Salada(new Bacon(new Ketchup(new Pao())))));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

    }
}
