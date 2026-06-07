package tugas;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilai;

    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

   
    public boolean lulus() {
        return this.nilai >= 60;
    }
}