import java.util.Scanner;

import javax.swing.JOptionPane;

public class NonVoidDakerYanM4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menggunakan JOptionPane untuk mengambil input dari pengguna
        String namaDepan = JOptionPane.showInputDialog("Nama Depan Pemilik Kendaraan: ");
        String namaBelakang = JOptionPane.showInputDialog("Nama Belakang Pemilik Kendaraan: ");
        String pemilik = namaDepan + " " + namaBelakang;
        String kendaraan = JOptionPane.showInputDialog("Jenis Kendaraan: ");
        String nomorKendaraan = JOptionPane.showInputDialog("Nomor Kendaraan: ");

        int tahunBeli = Integer.parseInt(JOptionPane.showInputDialog("Tahun Pembelian Kendaraan: "));
        int tahunSekarang = 2023;
        int usiaKendaraan = tahunSekarang - tahunBeli;

        double tarif = Double.parseDouble(JOptionPane.showInputDialog("Tarif Kendaraan: "));
        double pajak = Double.parseDouble(JOptionPane.showInputDialog("Besar Pajak (dalam persen): "));
        double diskon = Double.parseDouble(JOptionPane.showInputDialog("Diskon (dalam persen): "));

        // Membuat objek dari kelas Kendaraan untuk menghitung total pajak, potongan, dan total harga
        NonVoidDakerYanM4 kendaraanCalculator = new NonVoidDakerYanM4();
        double totalPajak = kendaraanCalculator.calculateTotalPajak(tarif, pajak, usiaKendaraan);
        double potongan = kendaraanCalculator.calculatePotongan(tarif, diskon, usiaKendaraan);
        double totalHarga = kendaraanCalculator.calculateTotalHarga(tarif, totalPajak, potongan);

        // Menggunakan JOptionPane untuk menampilkan hasil
        String hasil = "Data Kendaraan:\n" +
            "Nama Pemilik: " + pemilik + "\n" +
            "Jenis Kendaraan: " + kendaraan + "\n" +
            "Usia Kendaraan: " + usiaKendaraan + " tahun\n" +
            "Total Pajak: Rp" + totalPajak + "\n" +
            "Total potongan: Rp" + potongan + "\n" +
            "Total Harga: Rp" + totalHarga;

        JOptionPane.showMessageDialog(null, hasil);

        // Menghentikan program
        System.exit(0);
    }
    public double calculateTotalPajak(double tarif, double pajak, int usiaKendaraan) {
        return (tarif * pajak / 100) * usiaKendaraan;
    }
    public double calculatePotongan(double tarif, double diskon, int usiaKendaraan) {
        return (tarif * diskon / 100) * usiaKendaraan;
    }
    public double calculateTotalHarga(double tarif, double totalPajak, double potongan) {
        return tarif + totalPajak - potongan;
    }

}