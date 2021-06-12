package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Pao(new Hamburger(new Alface( new Bacon(new Ovo()))));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

    }
}
