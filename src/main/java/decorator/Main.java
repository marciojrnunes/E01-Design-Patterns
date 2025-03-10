package decorator;
import main.java.decorator.Queijo;
import main.java.decorator.Bacon;
import main.java.decorator.Ketchup;
import main.java.decorator.Salada;
import decorator.Ingrediente;
import decorator.IngredienteDecorator;

public class Main {

    public static void main(String[] args) {

        Ingrediente produto = new Pao(); 
        produto = new Queijo(produto);
        produto = new Queijo(produto);
        produto = new Bacon(produto);
        produto = new Ketchup(produto);
        produto = new Salada(produto);

        System.out.println("Ingredientes: " + produto.imprimeIngrediente());
        System.out.println("Preço Total: R$ " + produto.valorDoIngrediente());

    }
}
