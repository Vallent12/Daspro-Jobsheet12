import java.util.Scanner;
public class kafe03 {

    public static int hitungTotalHarga03(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid: Diskon 50%");
            hargaTotal *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid: Diskon 30%");
            hargaTotal *= 0.7;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo \"" + kodePromo + "\" tidak valid.");
        }

        return hargaTotal;
    }
        
    public static void Menu(String namaPelanggan, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        System.out.println();
        
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();

        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        Menu(nama, kodePromo);

        int totalKeseluruhan = 0;
        String lanjut;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            totalKeseluruhan += hitungTotalHarga03(pilihanMenu, banyakItem, kodePromo);

            System.out.print("Apakah ingin pesan menu lagi? (ya/tidak): ");
            sc.nextLine();
            lanjut = sc.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalKeseluruhan);

        sc.close();
    }
    
}
