import java.util.Scanner;
import java.util.ArrayList;

public class NonVoidTiketKAI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input harga tiket
        System.out.print("Masukkan harga tiket: ");
        double hargaTiket = input.nextDouble();

        // Meminta input jumlah penumpang
        System.out.print("Masukkan jumlah penumpang: ");
        int jumlahPenumpang = input.nextInt();

        // Membuat ArrayList untuk menyimpan data penumpang
        ArrayList<String> namaPenumpang = new ArrayList<>();
        ArrayList<String> nomorKursi = new ArrayList<>();

        // Meminta input nama dan nomor kursi untuk setiap penumpang
        for (int i = 1; i <= jumlahPenumpang; i++) {
            System.out.print("Masukkan nama penumpang ke-" + i + ": ");
            String nama = input.next();
            namaPenumpang.add(nama);

            System.out.print("Masukkan nomor kursi penumpang ke-" + i + ": ");
            String kursi = input.next();
            nomorKursi.add(kursi);
        }

        // Meminta input potongan harga (jika ada)
        System.out.print("Masukkan potongan harga (0 jika tidak ada): ");
        double potonganHarga = input.nextDouble();

        // Meminta input pajak penumpang
        System.out.print("Masukkan pajak penumpang: ");
        double pajakPenumpang = input.nextDouble();

        double totalHargaTiket = hitungTotalHargaTiket(hargaTiket, jumlahPenumpang, potonganHarga, pajakPenumpang);

        // Menampilkan hasil proses
        System.out.println("\nHasil Proses:");
        System.out.println("Total Harga Tiket yang harus dibayar: " + totalHargaTiket);
    }

    public static double hitungTotalHargaTiket(double hargaTiket, int jumlahPenumpang, double potonganHarga, double pajakPenumpang) {
        // Menghitung total harga tiket sebelum potongan harga
        double totalSebelumPotongan = hargaTiket * jumlahPenumpang;

        // Menghitung total harga tiket setelah potongan harga
        double totalSetelahPotongan = totalSebelumPotongan - potonganHarga;

        // Menghitung pajak yang harus dibayar
        double totalPajak = pajakPenumpang * jumlahPenumpang;

        // Mengembalikan total harga tiket
        return totalSetelahPotongan + totalPajak;
    }
}
