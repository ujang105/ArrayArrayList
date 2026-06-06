package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
       
        Perpustakaan perpus = new Perpustakaan();

      
        perpus.tambahBuku(new buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new buku("Sang Pemimpi", "Andrea Hirata", 2006)); // Untuk tes nomor 3

  
        perpus.tampilkanKoleksi();
        System.out.println();

      
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println();
        perpus.tampilkanKoleksi();
        System.out.println();

      
        System.out.println("--- Pengujian Nomor 1 (Kembalikan Buku) ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println();

       
        System.out.println("--- Pengujian Nomor 3 (Cari Penulis) ---");
        perpus.cariPenulis("Andrea Hirata");
        System.out.println();

      
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia saat ini: " + perpus.jumlahTersedia());
    }
}