package org.example.bRasmUchun;

public class Loudspeaker extends Sounds{
     String type;

    public Loudspeaker(String brand, String model, double price, int power, String type) {
        super(brand, model, price, power);
        this.type = type;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tip: " + type);
    }
}
