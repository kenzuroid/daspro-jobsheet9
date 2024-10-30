import java.util.Scanner;

public class ArrayRataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa]; 
        double total = 0;
        double rata2;
        int lulus = 0; 
        double totalLulus = 0; 
        double totalTidakLulus = 0; 
        int tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            
            if (nilaiMhs[i] > 70) {
                lulus++;
                totalLulus += nilaiMhs[i];
            } else {
                tidakLulus++;
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rata2 = total / nilaiMhs.length;
        double rata2Lulus = (lulus > 0) ? totalLulus / lulus : 0;
        double rata2TidakLulus = (tidakLulus > 0) ? totalTidakLulus / tidakLulus : 0;

        System.out.println("Rata-rata Nilai Keseluruhan = " + rata2);
        System.out.println("Rata-rata Nilai Mahasiswa yang Lulus = " + rata2Lulus);
        System.out.println("Rata-rata Nilai Mahasiswa yang Tidak Lulus = " + rata2TidakLulus);
    }
}
