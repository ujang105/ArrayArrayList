package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<buku> koleksi = new ArrayList<>();

    public void tambahBuku(buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
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

    public int jumlahTersedia() {
        int jumlah = 0;
        for (buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }

  
    public void kembalikanBuku(String judul) {
        for (buku b : koleksi) {
            if (b.getJudul().equalsIgnoreCase(judul)) {
                if (b.isDipinjam()) {
                    b.setDipinjam(false);
                    System.out.println(judul + " telah dikembalikan.");
                } else {
                    System.out.println(judul + " memang tidak sedang dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Buku Karya: " + penulis + " ==");
        boolean ditemukan = false;
        for (buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) {
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada buku yang ditemukan dari penulis: " + penulis);
        }
    }
}