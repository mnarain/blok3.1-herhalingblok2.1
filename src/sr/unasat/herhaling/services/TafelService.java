package sr.unasat.herhaling.services;

public class TafelService {

    public void tafelVan10ForLoop() {
        System.out.println("Running tafelVan10ForLoop");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(multiplier + " * " + 10 + " = " + (multiplier * 10));
        }
        System.out.println();
    }

    public void tafelVan10WhileLoop() {
        System.out.println("Running tafelVan10WhileLoop");
        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(multiplier + " * " + 10 + " = " + (multiplier * 10));
            multiplier++;
        }
        System.out.println();
    }

    //Implementeer de onderstaande 2 methods
    //tafelVanXForLoop
    public void tafelVanXForLoop(int tafel) {
        System.out.println("Running tafel van " + tafel + " ForLoop");
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(multiplier + " * " + tafel + " = " + (multiplier * tafel));
        }
        System.out.println();
    }
    //tafelVanXWhileLoop
    // X is d tafel die je wenst uit te printen. gebruik een parameter
    public void tafelVanXWhileLoop(int tafel) {
        System.out.println("Running tafel van " + tafel + " WhileLoop");
        int multiplier = 1;
        while (multiplier <= 10) {
            System.out.println(multiplier + " * " + tafel + " = " + (multiplier * tafel));
            multiplier++;
        }
        System.out.println();
    }
    // implementeer onderstaande methods nu met 3 parameters en volgorde (begin,eind,tafel)
    //tafelVanXForLoop
    //tafelVanXWhileLoop

}
