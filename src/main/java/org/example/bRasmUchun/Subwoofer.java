package org.example.bRasmUchun;

public class Subwoofer extends Sounds {
    String frequencyResponse;


    public Subwoofer(String brand, String model, double price, int power, String frequencyResponse) {
        super(brand, model, price, power);
        this.frequencyResponse = frequencyResponse;
    }

    public String getFrequencyResponse() {
        return frequencyResponse;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Chastota javobi: " + frequencyResponse);
    }
}
