package daffa.belajarjava.basic;

public class Variable {
    public static void main(String[] args) {

        String name;
        name = "Daffa Rayhan Riadi";

        int age = 20;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        // Bisa di edit isi variable, karena Java selalu meng-eksekusi code dari atas ke bawah
        name = "Cecep";
        System.out.println(name);

        // Kata kunci Var
        var firstName = "Daffa";
        var middleName = "Rayhan";
        var lastName = "Riadi";

//        var company; // ERROR karena tidak di inisialisasi secara langsung
//        company = "PZN";

        // Kata kunci final
        final var application = "Belajar Java";

//        application = "Belajar PHP"; // ERROR karena final
        
    }
}
