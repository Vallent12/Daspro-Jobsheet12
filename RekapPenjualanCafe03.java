import java.util.Scanner;
public class RekapPenjualanCafe03 {

public static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    public static int[][] inputPenjualan() {
        Scanner input = new Scanner(System.in);

        int[][] penjualan = new int[5][7];

        System.out.println("\n== INPUT DATA PENJUALAN ==");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nMenu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }

        return penjualan;
    }

    public static void tampilTabel(int[][] p) {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.printf("%-15s", "Menu");
        for (int h = 1; h <= 7; h++) {
            System.out.printf("Hari %d\t", h);
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-15s", menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%d\t", p[i][j]);
            }
            System.out.println();
        }
    }

    public static void tampilMenuTertinggi(int[][] p) {
        int max = 0;
        int indexMenu = 0;

        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
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

    public static void tampilRataRata(int[][] p) {
        System.out.println("\n== RATA-RATA PENJUALAN SETIAP MENU ==");
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += p[i][j];
            }
            double rata = total / 7.0;

            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {

        int[][] data = inputPenjualan();

        tampilTabel(data);

        tampilMenuTertinggi(data);

        tampilRataRata(data);
    }
    
}
