package org.example.bRasmUchun;

public class Electronics {
     String brand;
     String model;
     double price;

    public Electronics(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void printInfo() {
        System.out.println("Brend: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Narxi: $" + price);
    }

}
