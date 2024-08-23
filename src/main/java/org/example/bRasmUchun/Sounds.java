package org.example.bRasmUchun;

public class Sounds extends Electronics {
    int power;

    public Sounds(String brand, String model, double price, int power) {
        super(brand, model, price);
        this.power = power;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Quvvat: " + power + " W");
    }
}
