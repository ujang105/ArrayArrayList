package bagian1.array;

public class LatihanMandiri1_3 {
    public static void main(String[] args) {
        int[] angka = {4, 8, 15, 16, 23, 42};
        int genap = 0;

        for (int a : angka) {
            if (a % 2 == 0) genap++;
        }
        System.out.println("Jumlah genap: " + genap);
    }
}