package daffa.belajarjava.basic;

public class MethodOverloading {
    public static void main(String[] args) {
        
        sayHello("Daffa","Rayhan Riadi");
        sayHello("Daffa");
        sayHello();
        
    }

    static void sayHello(String firstName, String lastname) {
        System.out.println("Hello " + firstName + " " + lastname );
    }

    static void sayHello(String firstName) {
        System.out.println("Hello " + firstName);
    }

    static void sayHello() {
        System.out.println("Hello");
    }
    
}
