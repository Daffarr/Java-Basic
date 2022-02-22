package daffa.belajarjava.basic;

public class ForLoop {
    public static void main(String[] args) {

        // Perulangan Tanpa Henti
//        for (; ; ) {
//            // Jika tidak ada pemberhentian perulangan, maka memungkinkan akan terjadinya deadlock/stack
//            System.out.println("Perulangan");
//        }

        // Perulangan Dengan Kondisi
//        var  counter = 1;
//        for(; counter <= 10; ) {
//            System.out.println("Perulangan Ke-" + counter);
//            counter++;
//        }
//
//        System.out.println(counter);

        // Perulangan Dengan Init Statement dan Kondisi
//        for (var counter = 1; counter <= 10; ) {
//            System.out.println("Perulangan Ke-" + counter);
//            counter++;
//        }

        // Perulangan Dengan Init Statement, Kondisi, dan Post Statement
        for (var counter = 1; counter <= 10; counter++) {
            System.out.println("Perulangan Ke-" + counter);
        }

    }
}
