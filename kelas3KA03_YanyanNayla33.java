import java.util.Scanner;

public class kelas3KA03_YanyanNayla33 {
    public static void Kelas() {
        System.out.println("Kelas 1:Rp.450.000");
        System.out.println("Kelas 2:Rp.250.000");
        System.out.println("Kelas 3:Rp.150.000");
        System.out.println("Kelas VIP:Rp.600.000");
        System.out.println("Kelas VVIP:Rp.800.000");
    }
    public static void penangananNormal() {
        System.out.println("Dokter Spesialis:   3.000.000");
        System.out.println("Bidan           :   3.000.000");
    }
    public static void penangananCaesar() {
        System.out.println("Dokter Spesialis:   8.000.000");
    }
    public static void layananBersalin() {
        System.out.println("Dokter Spesialis:   8.000.000");
    }
    public static void main(String[] args) {
        // Data
        Scanner scanner = new Scanner(System.in);

        String[] nama = new String[1];
        String[] alamat = new String[1];
        String[] jenisKamar = new String[1];
        String[] layananBersalin = new String[1];
        int[] lamaInap = new int[1];
        String[] penanganan = new String[1];
        int[] totalObat = new int[1];
        int[] totalBayar = new int[1];
        int[] biayaDokterBidan = new int[1];

        int i = 0;
        while (i < nama.length) {
            // Membaca input nama pasien
            System.out.print("Masukkan nama pasien: ");
            nama[i] = scanner.nextLine();

            // Membaca input alamat
            System.out.print("Masukkan alamat pasien: ");
            alamat[i] = scanner.nextLine();

            // Membaca input penanganan
            System.out.print("Masukkan penanganan: ");
            penanganan[i] = scanner.nextLine();

            System.out.print("Masukkan layananBersalin: ");
            layananBersalin[i] = scanner.nextLine();

            // Membaca input jenis kamar
            System.out.print("Masukkan jenis kamar: ");
            jenisKamar[i] = scanner.nextLine();

            // Membaca input lama inap
            System.out.print("Masukkan lama inap: ");
            lamaInap[i] = scanner.nextInt();

            // Membaca input Total Obat
            System.out.print("Masukkan Total Obat: ");
            totalObat[i] = scanner.nextInt();

            // Membaca input total Bayar
            System.out.print("Masukkan total Bayar: ");
            totalBayar[i] = scanner.nextInt();

            // Membaca input total biayaDokterBidan
            System.out.print("Masukkan total biayaDokterBidan: ");
            biayaDokterBidan[i] = scanner.nextInt();

            // Increment i
            i++;
        }

        int no = 1;
        
        // Format
        String formatHeader = "| %-1s | %-20s | %-25s | %-3s | %-2s | %-10s | %-20s | %-20s | %-20s |%n";
        String formatData = "| %-3s | %-20s | %-25s | %-11s | %-9s | %-10s | %-20d | %-20d | %-20d |%n";

        // Cetak header
        System.out.printf("|====================================================================================================================================================================|%n");
        System.out.printf(formatHeader, "No.", "Nama Pasien", "Alamat", "Jenis Kamar", "Lama Inap", "Penanganan", "Biaya Dokter/Bidan", "Layanan Bersalin", "Total Obat", "Total Bayar");
        System.out.printf("|====================================================================================================================================================================|%n");
        // Cetak data
        for (int j = 0; j < nama.length; j++) {
            no++;
            System.out.printf(formatData, no, nama[j], alamat[j], jenisKamar[j], lamaInap[j], penanganan[j], biayaDokterBidan[j], layananBersalin[j], totalObat[j], totalBayar[j]);
        }
        System.out.printf("|====================================================================================================================================================================|%n");
    }
}