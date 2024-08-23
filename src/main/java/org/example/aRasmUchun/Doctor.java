package org.example.aRasmUchun;

public class Doctor {
    String name;
    String surname;
    int experience;
    String specialization;

    public Doctor() {

    }

    public Doctor(String name, String surname, int experience, String specialization) {
        this.name = name;
        this.surname = surname;
        this.experience = experience;
        this.specialization = specialization;
    }
    public void printInfo() {
        System.out.println("Doktor ismi: " + name);
        System.out.println("Doktor familyasi: "+surname);
        System.out.println("Tajriba yillari: " + experience);
        System.out.println("Ixtisoslik: " + specialization);
    }
}

