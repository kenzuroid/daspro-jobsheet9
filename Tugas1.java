import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = scanner.nextInt();

        int[] nilaiMhs = new int[jmlMhs];

        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = scanner.nextInt();
        }

        int totalNilai = 0;
        for (int i = 0; i < jmlMhs; i++) {
            totalNilai += nilaiMhs[i];
        }
        double rata2Nilai = (double) totalNilai / jmlMhs;

        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];

        for (int i = 1; i < jmlMhs; i++) {
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }

        System.out.println();
        System.out.println("Rata-rata nilai: " + rata2Nilai);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Semua nilai: ");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print(nilaiMhs[i] + " ");
        }
    }
}