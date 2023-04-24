package decorator;

import singleton.DBConnection;

public class Main {

    public static void main(String[] args)  {

        Ingrediente produto = new Pao(new Bacon(new Salada( new Ketchup( new Pao()))));

        System.out.println(produto.imprimeIngrediente());
        System.out.println(produto.valorDoIngrediente());



    }
}
