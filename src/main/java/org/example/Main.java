package org.example;

import org.example.aRasmUchun.Lor;
import org.example.aRasmUchun.Xirurg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Xirurg xirurg = new Xirurg("Ali","Aliyev" ,10, "Jarrohlik amaliyoti");
        Lor lor = new Lor("Karim","Karimov",9,"Quloq, burun, tomoq shifokori");

        xirurg.printInfo();
        System.out.println(); // Bo'sh qator
        lor.printInfo();

    }
}