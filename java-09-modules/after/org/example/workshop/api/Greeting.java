package org.example.workshop.api;

import org.example.workshop.internal.PrefixFormatter;

public class Greeting {
    private final PrefixFormatter formatter = new PrefixFormatter("Modul");

    public String text(String name) {
        return formatter.format("Hallo " + name);
    }
}
