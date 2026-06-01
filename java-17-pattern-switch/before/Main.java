sealed interface Payment permits Card, Wire {}
record Card(String token) implements Payment {}
record Wire(String iban) implements Payment {}

public class Main { public static void main(String[] args) { System.out.println(new Card("tok")); } }
