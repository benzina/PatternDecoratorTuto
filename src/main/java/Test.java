import composants.Boisson;
import composants.Deca;
import composants.Sumatra;
import decorator.Caramel;
import decorator.Chocolat;

public class Test {
    public static void main(String [] args){
        Boisson boisson;
        boisson= new Sumatra();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("-----------------------------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("-----------------------------------");
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
    }
}
