public class Percobaan506 {
    static void Tampil(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter (int): " + a.length);

        for (int i : a) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    static void Tampil(String str, double... b) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter (double): " + b.length);

        for (double d : b) {
            System.out.print(d + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknologi Informasi", 1.5, 2.5, 3.5, 4.5, 5.5);
        Tampil("Polinema");
    }
}

