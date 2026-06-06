package bagian3.perpustakaan;

public class buku {
    
    private String judul;
    private String penulis;
    private boolean dipinjam;
    
   
    private int tahunTerbit;

    
    public buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false; // Buku baru dianggap tersedia
    }

    
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}