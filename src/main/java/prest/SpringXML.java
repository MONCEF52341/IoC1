package prest;

import dao.ICalcul;
import metier.Gestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXML {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
        ICalcul calcul = context.getBean(ICalcul.class);
        Gestion gestion = context.getBean(Gestion.class);
        System.out.println(calcul.getValue());
        System.out.println(gestion.calcul());
    }
}
