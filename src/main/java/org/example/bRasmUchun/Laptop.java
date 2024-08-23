package org.example.bRasmUchun;

public class Laptop extends Computers {
    private double weight;

    public Laptop(String brand, String model, double price, String processor, double weight) {
        super(brand, model, price, processor);
        this.weight = weight;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Og'irligi: " + weight + " kg");
    }
}
