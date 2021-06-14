package decorator;

public class Queijo extends IngredienteDecorator {

    public Queijo(Ingrediente ingrediente){
        super(ingrediente);
    }


    public Queijo(){
        super(null);
    }


    public String imprimeIngrediente() {
        String ingredientes = "Queijo";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }


    public double valorDoIngrediente() {

        double valor = 2.5;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
