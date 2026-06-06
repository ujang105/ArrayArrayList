/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

/**
 *
 * @author LENOVO
 */
public class Mainperpustakaan {
    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku lalu memasukkannya ke koleksi
        perpus.tambahBuku(new buku("Laskar Pelangi", "Andrea Hirata"));
        perpus.tambahBuku(new buku("Bumi Manusia", "Pramoedya"));
        perpus.tambahBuku(new buku("Negeri 5 Menara", "Ahmad Fuadi"));

        perpus.tampilkanKoleksi();

        System.out.println();
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // coba pinjam kedua kali

        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}