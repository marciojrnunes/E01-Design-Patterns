package decorator;

public class Bacon extends Ingredientes {

    public Bacon(Ingrediente ingrediente) {
        super(ingrediente, "Bacon", 1.50);
    }

    public Bacon() {
        this(null);
    }
}
