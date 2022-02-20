package daffa.belajarjava.basic;

public class KonversiNumber {
    public static void main(String[] args) {

        // Widening Casting
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        // Narrowing Casting
        byte iniByte2 = (byte) iniInt;

        // Hati-hati ketika melakukan konversi paksa
        // Karena dapat terjadi Number Overflow -> nilai angka nya akan terus diputar ulang dari minus ke positif nya dari ukuran tipe data itu sendiri
        int iniInt2 = 1000;
        byte iniByte3 = (byte) iniInt;
        System.out.println(iniByte3);
    }
}
