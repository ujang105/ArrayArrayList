/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

public class Latihan3 {
    public static void main(String[] args) {
        // Membuat ArrayList kosong yang menampung String
        ArrayList<String> mahasiswa = new ArrayList<>();

        // add() menambah elemen di akhir
        mahasiswa.add("Andi");
        mahasiswa.add("Budi");
        mahasiswa.add("Citra");

        System.out.println("Isi list : " + mahasiswa);
        System.out.println("Jumlah   : " + mahasiswa.size());
        System.out.println("Index 1  : " + mahasiswa.get(1));
    }
}