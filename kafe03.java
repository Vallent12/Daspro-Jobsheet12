import java.util.Scanner;
public class kafe03 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");

            if (kodePromo.equals("DISKON50")) {
                System.out.println("Kode promo valid: Diskon 50%");
            } else if (kodePromo.equals("DISKON30")) {
                System.out.println("Kode promo valid: Diskon 30%");
            } else if (!kodePromo.isEmpty()) {
                System.out.println("Kode promo " + kodePromo + " tidak valid.");
            }
        }    
        
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

        System.out.print("Apakah Anda member? (true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine();
        
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();

        Menu(nama, isMember, kodePromo);
    }
    
}
