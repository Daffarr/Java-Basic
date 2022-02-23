package daffa.belajarjava.basic;

import java.util.Scanner;

public class MethodVariableArgument {
    public static void main(String[] args) {

        // Tanpa Variable Argument
        int[] values = {80, 50, 50, 50, 80};
        sayCongrat("Budi", values);

        // Menggunakan Variable Argument
        sayCongrats("Daffa", 80,90,76,80);

    }

    // Tanpa Variable Argument
    static void sayCongrat(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }

    // Menggunakan Variable Argument
    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }
}
