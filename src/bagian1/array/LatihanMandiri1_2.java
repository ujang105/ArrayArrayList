package bagian1.array;

public class LatihanMandiri1_2 {
    public static void main(String[] args) {
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("Hari yang memiliki lebih dari 5 huruf:");
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println("- " + h);
            }
        }
    }
}