package org.example.bRasmUchun;

public class Computers extends Electronics {

    String processor;

    public Computers(String brand, String model, double price, String processor) {
        super(brand, model, price);
        this.processor = processor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Processor: " + processor);
    }
}
