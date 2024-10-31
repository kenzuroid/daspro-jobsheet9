import java.util.Scanner;

public class MenuCafe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        System.out.println("Menu makanan di kafe:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan jumlah pesanan: ");
        int jmlPesanan = scanner.nextInt();
        scanner.nextLine();

        String[] namaPesanan = new String[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("\nMasukkan nama pesanan ke-" + (i + 1) + ": ");
            String namaMakanan = scanner.nextLine();
            boolean ditemukan = false;

            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(namaMakanan)) {
                    namaPesanan[i] = menu[j];
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Maaf, makanan \"" + namaMakanan + "\" tidak ada di menu.");
                i--;
            } else {
                System.out.println("Makanan/Minuman \""+ namaMakanan + "\" Tersedia");
            }
        }

        System.out.println("\nDaftar pesanan:");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i]);
        }
    }
}
