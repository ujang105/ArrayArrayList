package bagian1.array;

public class LatihanMandiri1_1 {
    public static void main(String[] args) {
        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};
        double max = suhu[0], min = suhu[0];

        for (double s : suhu) {
            if (s > max) max = s;
            if (s < min) min = s;
        }
        System.out.println("Suhu Tertinggi: " + max);
        System.out.println("Suhu Terendah : " + min);
    }
}