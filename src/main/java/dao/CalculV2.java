package dao;

public class CalculV2 implements ICalcul{
    @Override
    public double getValue() {
        System.out.println("Version 2, retourne 7");
        return 7;
    }
}
