package Carshop.Impl;

import Carshop.Cars.Car;
import Carshop.Interface.Admin;
import Carshop.Interface.Customer;

import java.util.ArrayList;

public class MyOwnAutoShop implements Admin, Customer {
    public ArrayList<Car> listOfCars;

    public MyOwnAutoShop(ArrayList<Car> listOfCars) {
        this.listOfCars = listOfCars;
    }

    @Override
    public int getIncome() {
        double sum = 0;
        for(Car c : listOfCars) {
           if(c.isSellOut) {
               sum += c.getSalePrice();
           }
        }
        return (int)sum;
    }

    @Override
    public Integer[] getCarsPrice() {
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        for(Car c : listOfCars) {
            resultArray.add((int)c.getSalePrice());
        }
        Integer[] endResult = (Integer[]) resultArray.toArray();
        return endResult;
    }

    @Override
    public String[] getCarColors() {
        ArrayList<String> resultArray = new ArrayList<String>();
        for(Car c : listOfCars) {
            resultArray.add(c.color);
        }
        String[] endResult = (String[]) resultArray.toArray();
        return endResult;
    }

    @Override
    public int getCarPrice(int id) {
        Car c = listOfCars.get(id-1);
        return (int)c.getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        Car c = listOfCars.get(id-1);
        return c.color;
    }

    @Override
    public boolean purchaseCar(int id) {
        Car c = listOfCars.get(id-1);
        return c.isSellOut;
    }
}