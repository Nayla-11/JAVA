import java.util.Scanner;

public class kelas3KA03_YanyanNayla1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahData = 3;
        String bulan = "Desember";

        String[] namaPasien = new String[jumlahData];
        String[] alamat = new String[jumlahData];
        int[] lamaInap = new int[jumlahData];
        int[] totalObat = new int[jumlahData];
        int[] jenisKamar = new int[jumlahData];
        int[] pilihanDokterBidan = new int[jumlahData];
        int[] jenisLayananBersalin = new int[jumlahData];


        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data Pasien ke-" + (i + 1));
            namaPasien[i] = inputData("Nama Pasien");
            alamat[i] = inputData("Alamat");
            lamaInap[i] = inputAngka("Lama Inap");
            totalObat[i] = inputAngka("Total Obat");
            
            System.out.println("Jenis Kamar:");
            System.out.println("1. Kelas 1 (Rp.450.000)");
            System.out.println("2. Kelas 2 (Rp.250.000)");
            System.out.println("3. Kelas 3 (Rp.150.000)");
            System.out.println("4. VIP (Rp.600.000)");
            System.out.println("5. Kelas VVIP (Rp.800.000)");
            jenisKamar[i] = inputAngka("Pilih Jenis Kamar");

            System.out.println("Dokter/Bidan:");
            System.out.println("1. Normal : Dokter Spesialis (Rp.3.000.000)");
            System.out.println("2. Normal : Bidan (Rp.1.500.000)");
            System.out.println("3. Caesar : Dokter Spesialis (Rp.8.000.000)");
            pilihanDokterBidan[i] = inputAngka("Pilih Dokter/Bidan");

            System.out.println("Jenis Layanan Bersalin:");
            System.out.println("1. Normal (Rp.4.000.000)");
            System.out.println("2. Caesar (Rp.8.000.000)");
            jenisLayananBersalin[i] = inputAngka("Pilih Jenis Layanan Bersalin");
        }

        System.out.println("\nLAPORAN PERIODIK PASIEN MELAHIRKAN RAWAT INAP");
        System.out.println("RUMAH SAKIT IBU & ANAK BUNDA");
        System.out.println(bulan + " 2023");
        System.out.println("\nNo. | Nama Pasien | Alamat | Jenis Kamar | Lama Inap | Penanganan | Biaya Dokter/Bidan | Layanan Bersalin | Total Obat | Total Bayar");
        System.out.println("======================================================================================================================================");
        String formatHeader = "| %-1s | %-20s | %-25s | %-3s | %-2s | %-10s | %-20s | %-20s | %-20s |%n";
        String formatData = "| %-3s | %-20s | %-25s | %-11s | %-9s | %-10s | %-20s | %-20s | %-20s |%n";


        for (int i = 0; i < jumlahData; i++) {
            int HargaKamar = hitungHargaKamar(jenisKamar[i], lamaInap[i]);
            int biayaDokterBidan = hitungBiayaDokterBidan(pilihanDokterBidan[i]);
            int biayaLayananBersalin = hitungBiayaLayananBersalin(jenisLayananBersalin[i]);
            int totalBiaya = HargaKamar + biayaDokterBidan + biayaLayananBersalin + totalObat[i];

            System.out.printf("%-4d| %-13s| %-7s| %-11d| %-9d| %-11s| %-18d| %-17d| %-11d| %-13d\n",
                    (i + 1), namaPasien[i], alamat[i], jenisKamar[i], lamaInap[i],
                    jenisPenanganan(pilihanDokterBidan[i]), biayaDokterBidan, biayaLayananBersalin, totalObat[i], totalBiaya);
        }

        input.close();
    }

    static String inputData(String label) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan " + label + ": ");
        return input.nextLine();
    }

    static int inputAngka(String label) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan " + label + ": ");
        return input.nextInt();
    }

    static int hitungHargaKamar(int jenisKamar, int lamaInap) {
        int hargaKamarPerHari;

        switch (jenisKamar) {
            case 1:
                hargaKamarPerHari = 450000;
                break;
            case 2:
                hargaKamarPerHari = 250000;
                break;
            case 3:
                hargaKamarPerHari = 150000;
                break;
            case 4:
                hargaKamarPerHari = 600000;
                break;
            case 5:
                hargaKamarPerHari = 800000;
                break;
            default:
                System.out.println("Pilihan jenis kamar tidak valid.");
                System.exit(0);
                return 0;
        }

        return hargaKamarPerHari * lamaInap;
    }

    static int hitungBiayaDokterBidan(int pilihanDokterBidan) {
        switch (pilihanDokterBidan) {
            case 1:
                return 3000000;
            case 2:
                return 1500000;
            case 3:
                return 8000000;
            default:
                System.out.println("Pilihan penanganan tidak valid.");
                System.exit(0);
                return 0;
        }
    }

    static int hitungBiayaLayananBersalin(int jenisLayananBersalin) {
        switch (jenisLayananBersalin) {
            case 1:
                return 4000000;
            case 2:
                return 8000000;
            default:
                System.out.println("Pilihan layanan bersalin tidak valid.");
                System.exit(0);
                return 0;
        }
    }

    static String jenisPenanganan(int pilihanDokterBidan) {
        switch (pilihanDokterBidan) {
            case 1:
                return "Dokter Spesialis";
            case 2:
                return "Bidan";
            case 3:
                return "Dokter Spesialis";
            default:
                System.out.println("Pilihan penanganan tidak valid.");
                System.exit(0);
                return "";
        }
    }
}