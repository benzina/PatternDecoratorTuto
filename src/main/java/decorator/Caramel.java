package decorator;

import composants.Boisson;

public class Caramel extends Decorator {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " au caramel";
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }
}
