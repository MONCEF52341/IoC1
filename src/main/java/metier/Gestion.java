package metier;

import dao.ICalcul;

public class Gestion implements IGestion{
    private ICalcul calc;
    @Override
    public double calcul() {
        return calc.getValue()*10;
    }
    //Ajouter méthode pour pouvoir injecter des objets de type Icalcul

    public void setCalc(ICalcul calc) {
        this.calc = calc;
    }
}
