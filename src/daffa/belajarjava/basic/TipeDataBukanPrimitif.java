package daffa.belajarjava.basic;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniByte); // akan ERROR apabila tidak di inisialisasi

        iniByte = 100;
        System.out.println(iniByte);

        // Konversi tipe data primitif -> non primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        // non primitif -> primitif
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long annount = 1000000L;

    }
}
