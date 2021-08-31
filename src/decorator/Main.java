package decorator;

public class Main {

    public static void main(String[] args) {

        // instanciando ingredientes do produto
        Ingrediente produto = new BatataPalha(new Bacon((new Queijo(new Pao()))));

        // chamando métodos de impressão
        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());

    }
}
