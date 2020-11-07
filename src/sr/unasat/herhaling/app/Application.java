package sr.unasat.herhaling.app;

import sr.unasat.herhaling.services.TafelService;

public class Application {
    public static void main(String[] args) {
        TafelService ts = new TafelService();
        //ts.tafelVan10ForLoop();
        //ts.tafelVan10WhileLoop();
        ts.tafelVanXForLoop(55);
        ts.tafelVanXWhileLoop(55);
    }
}
