package prest;

import dao.ICalcul;
import metier.Gestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        ICalcul calcul = (ICalcul) context.getBean("calculV2");
        Gestion gestion = context.getBean(Gestion.class);
        System.out.println(calcul.getValue());
        System.out.println(gestion.calcul());
    }
}
