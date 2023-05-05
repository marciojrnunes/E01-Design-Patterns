package decorator;

public class Ketchup extends Ingredientes {

    public Ketchup(Ingrediente ingrediente) {
        super(ingrediente, "Ketchup", 1.00);
    }

    public Ketchup() {
        this(null);
    }
}
