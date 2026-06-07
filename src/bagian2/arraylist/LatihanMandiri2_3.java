package bagian2.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class LatihanMandiri2_3 {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        String[] data = {"Andi", "Budi", "Ayu", "Citra", "Adit", "Doni"};
        
        nama.addAll(Arrays.asList(data));

        System.out.println("Nama yang diawali huruf 'A':");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println("- " + n);
            }
        }
    }
}