package tugas;

/**
 * Nama : Muhammad Raihan Ardhani /
 * NPM  : 2410010506             /
 */
public class MainTugas {
    public static void main(String[] args) {
       
        String[] matakuliah = {"Pemrograman Berbasis Objek 1", "Basis Data", "Struktur Data"};
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < matakuliah.length; i++) {
            System.out.println((i + 1) + ". " + matakuliah[i]);
        }
        System.out.println();

        
        KelasKuliah kelas = new KelasKuliah();

       
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "221001", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "221002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "221003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Deni", "221004", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka", "221005", 75.0));

        System.out.println("=== DATA MAHASISWA AWAL ===");
        kelas.tampilkanSemua();


        System.out.println("Rata-rata Nilai Kelas : " + kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println();

      
        System.out.println("... Menambahkan 1 mahasiswa baru ...");
        kelas.tambahMahasiswa(new Mahasiswa("Fahmi", "221006", 65.0));
        
        System.out.println("\n=== DATA MAHASISWA TERBARU ===");
        kelas.tampilkanSemua();
        System.out.println("Jumlah Total Mahasiswa Sekarang: " + kelas.getJumlahData());
    }
}