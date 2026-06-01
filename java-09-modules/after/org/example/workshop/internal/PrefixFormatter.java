package org.example.workshop.internal;

public class PrefixFormatter {

    private final String prefix;

    public PrefixFormatter(String prefix) {
        this.prefix = prefix;
    }

    public String format(String text) {
        return "[" + prefix + "] " + text;
    }
}
