package daffa.belajarjava.basic;

public class DoWhileLoop {
    public static void main(String[] args) {

        // While
        var counter = 100;

//        while (counter <= 10) {
//            System.out.println("Perulangan " + counter);
//            counter++;
//        }

        // Do While
        do {
            System.out.println("Perulangan " + counter);
            counter++;
        } while (counter <= 10); // dieksekusi walaupun nilainya tidak bernilai true

    }
}
