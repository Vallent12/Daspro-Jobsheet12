import java.util.Scanner;
public class NilaiMahasiswa03 {

    public static int[] isianArray(int N) {
        Scanner sc = new Scanner(System.in);
        int[] nilai = new int[N];

        System.out.println("\n==== Input Nilai Mahasiswa ====");
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        return nilai;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = isianArray(N);

        System.out.println("\nData berhasil dimasukkan!");

        sc.close();
    }
}

