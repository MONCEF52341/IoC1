package prest;

import dao.ICalcul;
import metier.IGestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InstanciationDynamique {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            Scanner sc = new Scanner(new File("src/main/config.txt"));
            String calcClass = sc.nextLine();
            Class cCalcul = Class.forName(calcClass);
            ICalcul calcul = (ICalcul) cCalcul.getConstructor().newInstance();
        System.out.println(calcul.getValue());

        String gestionClass = sc.nextLine();
        Class cGestion = Class.forName(gestionClass);
        IGestion gestion = (IGestion) cGestion.getConstructor().newInstance();
        Method m = cGestion.getMethod("setCalc",ICalcul.class);
        m.invoke(gestion,calcul);
        System.out.println(gestion.calcul());

    }
}
