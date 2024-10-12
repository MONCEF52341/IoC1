package prest;

import dao.CalculV1;
import dao.CalculV2;
import dao.ICalcul;
import metier.Gestion;

public class InstanciationStatique {
    public static void main(String[] args) {
        ICalcul calcul = new CalculV2();
        Gestion gestion = new Gestion();
        gestion.setCalc(calcul);
        System.out.println(gestion.calcul());
    }
}
