package Carshop.Interface;

public interface Customer {
    Integer[] getCarsPrice();
    String[] getCarColors();

    int getCarPrice(int id);
    String getCarColor(int id);
    boolean purchaseCar(int id);

}
