package daffa.belajarjava.basic;

public class Scope {
    public static void main(String[] args) {

        sayHello("Daffa");
        sayHello("");

    }

    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
//        System.out.println(hi); // ERROR karena Scope akses nya berbeda
        System.out.println(hello);
    }
}
