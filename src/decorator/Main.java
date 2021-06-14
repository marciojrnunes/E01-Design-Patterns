package decorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Pao(new Pao(new Bacon(new CarneHamburger(new Ketchup(new Azeitona())))));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

    }
}
