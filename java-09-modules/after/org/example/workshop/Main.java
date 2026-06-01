package org.example.workshop;

import org.example.workshop.api.Greeting;

public class Main {

    public static void main(String[] args) {

        System.out.println(new Greeting().text("Ada"));
        System.out.println("Nur org.example.workshop.api ist exportiert.");
    }
}
