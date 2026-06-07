package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2_1 {
    public static void main(String[] args) {
        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Beras");
        belanja.add("Minyak");
        belanja.add("Gula");
        belanja.add("Telur");

        // Hapus item ke-2 (indeks 1)
        belanja.remove(1);

        System.out.println("Isi daftar belanja: " + belanja);
        System.out.println("Jumlah akhir      : " + belanja.size());
    }
}