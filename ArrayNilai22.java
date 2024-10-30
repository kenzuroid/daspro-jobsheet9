import java.util.Scanner;
public class ArrayNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiakhir = new int[10];

        for (int i = 0; i < nilaiakhir.length; i++) {
            System.out.print("Masukkan Nilai Akhir ke-" + i + " : ");
            nilaiakhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiakhir[i] > 70) {
            System.out.println("Mahasiswa ke-" + i + " LULUS!");
            } else {
                System.out.println("Mahasiswa ke-" + i + " TIDAK LULUS!");
            }
        }
    }
}