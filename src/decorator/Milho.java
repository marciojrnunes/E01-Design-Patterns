package decorator;

public class Milho extends IngredienteDecorator{

	public Milho(Ingrediente ingrediente) {
		super(ingrediente);
	}
	
	public Milho() {
        super(null);
    }
	
	@Override
	public String imprimeIngrediente() {
		 String ingredientes = "Milho";

	        if (super.ingrediente != null)
	            ingredientes += ", " + super.ingrediente.imprimeIngrediente();

	        return ingredientes;
    }

    @Override
    public double valorDoIngrediente() {
    	double valor = 1.0;

        if (super.ingrediente != null)
            valor += ingrediente.valorDoIngrediente();

        return valor;
    }
}
