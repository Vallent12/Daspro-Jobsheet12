import java.util.Scanner;
public class RekapPenjualanCafe03 {

public static String[] menu;

    public static int[][] inputPenjualan(int jumlahMenu, int jumlahHari) {
        Scanner input = new Scanner(System.in);

        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n== INPUT DATA PENJUALAN ==");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }

        return penjualan;
    }

    public static void tampilTabel(int[][] p, int jumlahMenu, int jumlahHari) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= jumlahHari; h++) {
            System.out.printf("Hari %d\t", h);
        }
        System.out.println();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.printf("%d\t", p[i][j]);
            }
            System.out.println();
        }
    }

    public static void tampilMenuTertinggi(int[][] p, int jumlahMenu, int jumlahHari) {
        int max = 0;
        int indexMenu = 0;

        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += p[i][j];
            }
            if (total > max) {
                max = total;
                indexMenu = i;
            }
        }

        System.out.println("\n== MENU DENGAN PENJUALAN TERTINGGI ==");
        System.out.println("Menu: " + menu[indexMenu]);
        System.out.println("Total penjualan: " + max);
    }

    public static void tampilRataRata(int[][] p, int jumlahMenu, int jumlahHari) {
        System.out.println("\n== RATA-RATA PENJUALAN SETIAP MENU ==");
        for (int i = 0; i < jumlahMenu; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHari; j++) {
                total += p[i][j];
            }
            double rata = total / (double) jumlahHari;

            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = input.nextInt();

        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahHari = input.nextInt();
        input.nextLine();

        menu = new String[jumlahMenu];
        System.out.println("\n== iNPUT NAMA MENU ==");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = input.nextLine();
        }

        int [][] data = inputPenjualan(jumlahMenu, jumlahHari);

        tampilTabel(data, jumlahMenu, jumlahHari);
        tampilMenuTertinggi(data, jumlahMenu, jumlahHari);
        tampilRataRata(data, jumlahMenu, jumlahHari);
    }
    
}
