package dao;

public class CalculV1 implements ICalcul{
    @Override
    public double getValue() {
        System.out.println("Version 1, retourne 500");
        return 500;
    }
}
