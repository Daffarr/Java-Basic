package daffa.belajarjava.basic;

public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Daffa", "Rayhan");
        sayHello("Rio", "Alfarisky");
        sayHello("Ayu", "Aini");

    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
