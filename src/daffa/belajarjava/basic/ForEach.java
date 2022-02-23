package daffa.belajarjava.basic;

public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Daffa", "Rayhan", "Riadi",
                "Programmer", "Zaman", "Now"
        };

        System.out.println("FOR LOOP");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");
        for (var name: names) {
            System.out.println(name);
        }

    }
}
