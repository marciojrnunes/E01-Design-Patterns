package decorator;

public class Batata extends IngredienteDecorator {

    public Batata(Ingrediente ingrediente){
        super(ingrediente);
    }


    public Batata(){
        super(null);
    }


    public String imprimeIngrediente() {
        String ingredientes = "Batata";

        if (super.ingrediente != null)
            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

        return ingredientes;
    }


    public double valorDoIngrediente() {

        double valor = 4.0;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}