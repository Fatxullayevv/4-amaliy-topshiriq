package org.example.aRasmUchun;

public class Lor extends Doctor{
    String surgeryType;

    public Lor(){}

    public Lor(String name, String surname, int experience, String surgeryType) {
        super(name, surname, experience, "Lor");
        this.surgeryType = surgeryType;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Vazifasi: " + surgeryType);
    }
}
