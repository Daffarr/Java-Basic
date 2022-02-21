package daffa.belajarjava.basic;

public class OperasiBoolean {
    public static void main(String[] args) {

        var absen = 75; // jika 70 maka hasil nya akan false
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilaiAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilaiAkhir;
        System.out.println(lulus);

    }
}
