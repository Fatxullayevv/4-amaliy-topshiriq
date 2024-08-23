package org.example.bRasmUchun;

public class Pc extends Computers {

    String graphicsCard;


    public Pc(String brand, String model, double price, String processor, String graphicsCard) {
        super(brand, model, price, processor);
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Grafik karta: " + graphicsCard);
    }

}
