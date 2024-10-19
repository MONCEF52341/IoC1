package dao;


import org.springframework.stereotype.Component;

@Component
public class CalculV1 implements ICalcul{
    @Override
    public double getValue() {
        System.out.println("Version 1, retourne 500");
        return 500;
    }
}
