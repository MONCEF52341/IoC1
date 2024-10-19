package metier;

import dao.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gestion implements IGestion{
     @Autowired
        @Qualifier("calculV1")
    private ICalcul calc;
    @Override
    public double calcul() {
        System.out.println("Multiplie La valeur ci-dessous par 10");
        return calc.getValue()*10;
    }
    //Ajouter méthode pour pouvoir injecter des objets de type Icalcul

    public void setCalc(ICalcul calc) {
        this.calc = calc;
    }
}
