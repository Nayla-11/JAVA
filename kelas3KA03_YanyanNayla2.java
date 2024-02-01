import java.text.DecimalFormat;
import java.util.Scanner;

public class kelas3KA03_YanyanNayla2 {
    private static class Pasien {
        String nama;
        String alamat;
        String tipeKamar;
        int lamaInap;
        String tipePenanganan;
        String tipeDokter;
        double biayaDokter;
        double layananMelahirkan;
        double totalBiayaObat;
        double totalPembayaran;

        private double hitungBiayaKamar(String tipeKamar, int lamaInap) {
	     double biayaKamar = 0;
             switch (tipeKamar) {
                case "1":
                    biayaKamar = 450000 * lamaInap;
                    break;
                case "2":
                    biayaKamar = 250000 * lamaInap;
                    break;
                case "3":
                    biayaKamar = 150000 * lamaInap;
                    break;
                case "VIP":
                    biayaKamar = 600000 * lamaInap;
                    break;
                case "VVIP":
                    biayaKamar = 800000 * lamaInap;
                    break;
                default:
                    System.out.println("Tipe kamar tidak valid");
                    break;
            }

            return biayaKamar;
        }

        private double hitungBiayaDokter(String tipePenanganan, String tipeDokter) {
            double biayaDokter = 0;
        
            if (tipePenanganan.equals("Normal")) {
                if (tipeDokter.equals("Dokter Spesialis")) {
                    biayaDokter = 3000000;
                } else if (tipeDokter.equals("Bidan")) {
                    biayaDokter = 1500000;
                }
            } else if (tipePenanganan.equals("Caesar")) {
                biayaDokter = 8000000;
            }
            return biayaDokter;
        }

        private double hitungLayananMelahirkan(String tipePenanganan) {
            double layananMelahirkan = 0;
    
            if (tipePenanganan.equals("Normal")) {
                layananMelahirkan = 4000000;
            } else if (tipePenanganan.equals("Caesar")) {
                layananMelahirkan = 8000000;
            }
            return layananMelahirkan;
        }
        private double hitungTotalPembayaran(Pasien pasien) {
            double totalBiayaKamar = hitungBiayaKamar(pasien.tipeKamar, pasien.lamaInap);
            double totalDokterLayanan = pasien.biayaDokter + pasien.layananMelahirkan + pasien.totalBiayaObat;
            return totalBiayaKamar + totalDokterLayanan;
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pasien[] pasien = new Pasien[3];

        for (int i = 0; i < 3; i++) {
            pasien[i] = new Pasien();

            System.out.println("Masukkan data pasien " + (i + 1) + ":");
            System.out.print("Nama: ");
            pasien[i].nama = scan.nextLine();
            System.out.print("Alamat: ");
            pasien[i].alamat = scan.nextLine();
            System.out.print("Tipe Kamar (1,2,3,VIP,VVIP): ");
            pasien[i].tipeKamar = scan.nextLine();
            System.out.print("Lama Inap: ");
            pasien[i].lamaInap = scan.nextInt();
            scan.nextLine();
            System.out.print("Tipe Penanganan (Normal/Caesar): ");
            pasien[i].tipePenanganan = scan.nextLine();

            if (pasien[i].tipePenanganan.equals("Normal")) {
                System.out.print("Pilih Dokter (Dokter Spesialis/Bidan): ");
                pasien[i].tipeDokter = scan.nextLine();
            } else if (pasien[i].tipePenanganan.equals("Caesar")) {
                pasien[i].tipeDokter = "Dokter Spesialis";
            }

            System.out.print("Total Biaya Obat: ");
            pasien[i].totalBiayaObat = scan.nextDouble();
            scan.nextLine();

            pasien[i].biayaDokter = pasien[i].hitungBiayaDokter(pasien[i].tipePenanganan, pasien[i].tipeDokter);
            pasien[i].layananMelahirkan = pasien[i].hitungLayananMelahirkan(pasien[i].tipePenanganan);
            pasien[i].totalPembayaran = pasien[i].hitungTotalPembayaran(pasien[i]);

        }

        tampilkanTabel(pasien);
    }

    private static DecimalFormat df = new DecimalFormat("0,000");
    private static void tampilkanTabel(Pasien[] pasien) {
        System.out.println("LAPORAN PERIODIK PASIEN MELAHIRKAN RAWAT INAP\n");
        System.out.println("RUMAH SAKIT IBU DAN ANAK BUNDA\n");
        System.out.println("DESEMBER 2023\n");
        System.out.println("\n============================================================Tabel Pasien========================================================================");
        System.out.println("No  Nama Pasien        Alamat               Jenis Kamar Lama Inap  Penanganan   Biaya Dokter/Bidan Layanan Bersalin  Total Obat  Total Bayar");
        System.out.println("================================================================================================================================================");
        for (int i = 0; i < pasien.length; i++) {
            System.out.printf("%-4s%-19s%-21s%-13s%-9s%-13s%-18s%-20s%-11s%-12s%n",
                    i + 1,
                    pasien[i].nama,
                    pasien[i].alamat,
                    pasien[i].tipeKamar,
                    pasien[i].lamaInap,
                    pasien[i].tipePenanganan,
                    df.format(pasien[i].biayaDokter),
                    df.format(pasien[i].layananMelahirkan),
                    df.format(pasien[i].totalBiayaObat),
                    df.format(pasien[i].totalPembayaran));
        }
        System.out.println("================================================================================================================================================");
    }
}
