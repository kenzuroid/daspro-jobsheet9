import java.util.Scanner;

public class CafeOrder22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaPesanan = new String[jmlPesanan];
        double[] hrgPesanan = new double[jmlPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hrgPesanan[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        double totalBiaya = 0;
        for (int i = 0; i < jmlPesanan; i++) {
            totalBiaya += hrgPesanan[i];
        }

        System.out.println("\nDaftar pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hrgPesanan[i]);
        }
        System.out.println("Total biaya: Rp" + totalBiaya);
    }
}