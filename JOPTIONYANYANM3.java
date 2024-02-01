import javax.swing.JOptionPane;

public class JOPTIONYANYANM3 {
    public static void main(String[] args) {
        // Input data pemilik kendaraan
        String namaDepan = JOptionPane.showInputDialog("Masukkan Nama Depan Pemilik Kendaraan: ");
        String namaBelakang = JOptionPane.showInputDialog("Masukkan Nama Belakang Pemilik Kendaraan: ");
        String jenisKendaraan = JOptionPane.showInputDialog("Masukkan Jenis Kendaraan: ");
        String nomorKendaraan = JOptionPane.showInputDialog("Masukkan Nomor Kendaraan: ");
        int tahunPembelian = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tahun Pembelian Kendaraan: "));
        double tarif = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tarif (Rp): "));
        double pajakPersentase = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Pajak (%): "));
        double potonganPersentase = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Potongan (%): "));

        //PROSES
        String namaLengkap = namaDepan + " " + namaBelakang;
        int masaPakai = 2023 - tahunPembelian;
        double pajakLayanan = (pajakPersentase / 100) * tarif;
        double potongan = (potonganPersentase / 100) * tarif;
        double totalBayar = tarif + pajakLayanan - potongan;

        // Output data pemilik kendaraan
        String outputMessage = "Data Pemilik Kendaraan:\n";
        outputMessage += "1. Nama Pemilik Kendaraan: " + namaLengkap + "\n";
        outputMessage += "2. Jenis Kendaraan: " + jenisKendaraan + "\n";
        outputMessage += "3. Nomor Kendaraan: " + nomorKendaraan + "\n";
        outputMessage += "4. Lama Pakai (Tahun): " + masaPakai + " tahun\n";
        outputMessage += "5. Total Bayar (Rp): " + totalBayar;
        
        JOptionPane.showMessageDialog(null, outputMessage);
    }
}