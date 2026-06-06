/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

public class Perpustakaan {
    // ArrayList yang menampung objek bertipe Buku
    private ArrayList<buku> koleksi = new ArrayList<>();

    // Menambah satu buku ke koleksi
    public void tambahBuku(buku buku) {
        koleksi.add(buku);
    }

    // Menampilkan seluruh koleksi beserta nomor urut
    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        

for (int i = 0; i < koleksi.size(); i++) {
            buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // Mencari buku berdasarkan judul, lalu menandainya dipinjam
    public void pinjamBuku(String judul) {
        for (buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println(judul + " sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println(judul + " berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // Menghitung jumlah buku yang masih tersedia
    public int jumlahTersedia() {
        int jumlah = 0;
        for (buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}
        

