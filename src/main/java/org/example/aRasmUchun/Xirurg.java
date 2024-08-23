package org.example.aRasmUchun;

public class Xirurg extends Doctor {
    String surgeryType;

    public Xirurg(String name, String surname, int experience,  String surgeryType) {
        super(name, surname, experience, "Xirurg");
        this.surgeryType = surgeryType;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Amaliyot turi: " + surgeryType);
    }
}
