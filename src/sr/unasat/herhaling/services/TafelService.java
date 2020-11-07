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
    //tafelVanXWhileLoop
    // X is d tafel die je wenst uit te printen. gebruik een parameter

}
