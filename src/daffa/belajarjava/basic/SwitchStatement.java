package daffa.belajarjava.basic;

public class SwitchStatement {
    public static void main(String[] args) {

        // Switch Statement
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda Lulus Dengan Baik");
                break;
            case "B": // B dan C digabungkan
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default: // Jika semua kondisi tidak terpenuhi
                System.out.println("Mungkin Anda Salah Jurusan");
        }

        // Switch Lambda -> Java 14

        switch (nilai) {
            case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
            case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
            case "D"-> System.out.println("Anda Tidak Lulus");
            default -> { // Jika lebih dari satu baris, maka dapat menggunakan `{}`
                System.out.println("Mungkin Anda Salah Jurusan");
            }

        }

        // switch statement lambda tanpa kata kunci yield -> manual
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
            case "D"-> ucapan = "Anda Tidak Lulus";
            default -> { // Jika lebih dari satu baris, maka dapat menggunakan `{}`
                ucapan = "Mungkin Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);

        // switch statement lambda kata kunci yield -> auto
        ucapan = switch (nilai){
            case "A":
                yield "Wow, Anda Lulus Dengan Baik";
            case "B", "C":
                yield "Nilai Anda Cukup Baik";
            case "D" :
                yield "Anda Tidak Lulus";
            default:
                yield "Mungkin Anda Salah Jurusan";

        };
        System.out.println(ucapan);

    }
}
