public class Main {

    public static void main(String[] args) {

        String source = "public class Generated { public String message() { return \"Hallo\"; } }";

        System.out.println("Quelltext liegt als String vor:");
        System.out.println(source);

        System.out.println("Vor der Compiler API brauchte man dafuer typischerweise einen externen javac-Prozess.");
    }
}
