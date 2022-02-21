package daffa.belajarjava.basic;

public class Array {
    public static void main(String[] args) {

        // Cara menginisialisasi Tipe Data Array
        // cara 1
        String[] stringArray;
        stringArray = new String[3];
        // cara 2
        String[] stringArrays2 = new String[3];

        // cara 3
        String[] nameNama = {"Daffa", "Rayhan", "Riadi"};
        // cara 4
        int[] arrayInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // cara 5
        long[] arrayLong = {10L, 20L, 30L};

        // cara mengubah data yang ada di dalam array
        stringArray[0] = "Daffa";
        stringArray[1] = "Rayhan";
        stringArray[2] = "Riadi";

        // mengambil data yang ada di dalam array
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // jika data yang telah diinisialisasi di ubah kembali
        stringArray[0] = "Budi";
        System.out.println(stringArray[0]); // maka nilainya akan berubah

        // Operasi Di Array
        System.out.println(arrayLong.length); // Panjangan Array

        // penghilangan (penghapusan data di array) data di dalam array
        arrayLong[0] = 0;
        //atau
        nameNama[0] = null;

        // Array di dalam Array
        String[][] memberes = {
                {"Daffa", "Rayhan", "Riadi"}, // Array index 0
                {"Budi","Setiawan"},// Array index 1
                {"Joko"} // Array index 2
        };
        System.out.println(memberes[0][0]); // jika ingin mengakses data "Daffa"
        System.out.println(memberes[1][0]); // jika ingin mengakses data "Budi"


    }
}
