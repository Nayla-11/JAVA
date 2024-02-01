import java.util.Scanner;

public class kelas3KA03_YanyanNayla {
// percobaan ke 23
    static Scanner scanner = new Scanner(System.in);
    static int[] nomor = new int[6];
    static String[] namaPasien = new String[6];
    static String[] alamat = new String[6];
    static int[] lamaInap = new int[6];
    static String[] penanganan = new String[6];

    public static void main(String[] args) {
        inputPasien();
        generateLaporan();
    }

    static void inputPasien() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Input data pasien ke-" + (i + 1));
            System.out.print("Nomor: ");
            nomor[i] = scanner.nextInt();
            scanner.nextLine(); // baris baru
            System.out.print("Nama Pasien: ");
            namaPasien[i] = scanner.nextLine();
            System.out.print("Alamat: ");
            alamat[i] = scanner.nextLine();
            System.out.print("Lama Inap (hari): ");
            lamaInap[i] = scanner.nextInt();
            scanner.nextLine(); //  baris baru lagi
            System.out.print("Penanganan (Dokter Spesialis/Bidan)(D/B): ");
            penanganan[i] = scanner.nextLine();
        }

        // Menambahkan data tambahan
        nomor[1] = 2;
        namaPasien[1] = "Putri Lestari";
        alamat[1] = "Jl Mahakam 10 Depok";
        lamaInap[1] = 3;
        penanganan[1] = "D";

        nomor[2] = 3;
        namaPasien[2] = "Dwi Kusuma";
        alamat[2] = "Jl Kompas 12 Depok";
        lamaInap[2] = 2;
        penanganan[2] = "D";

        nomor[3] = 4;
        namaPasien[3] = "Endang Pertiwi";
        alamat[3] = "Jl Durian IV Depok";
        lamaInap[3] = 3;
        penanganan[3] = "B";
    }

    static void printHorizontalLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void generateLaporan() {
        int tableWidth = 132;
        printHorizontalLine(tableWidth);
        System.out.printf("| %-5s | %-25s | %-25s | %-10s | %-25s | %-15s | %-15s |\n",
                "Nomor", "Nama Pasien", "Alamat", "Lama Inap", "Penanganan", "Jenis Kamar", "Biaya");
        printHorizontalLine(tableWidth);

        for (int i = 0; i < 6; i++) {
            System.out.printf("| %-5d | %-25s | %-25s | %-10d | %-25s", nomor[i], namaPasien[i], alamat[i], lamaInap[i], penanganan[i]);

            System.out.print("Jenis Kamar (1/2/3/V/W): ");
            char jenisKamar = scanner.next().charAt(0);

            System.out.print("Penanganan (Dokter Spesialis/Bidan)(D/B): ");
            char penanganan = scanner.next().charAt(0);

            System.out.print("Layanan Bersalin (Normal/Caesar)(N/C): ");
            char layananBersalin = scanner.next().charAt(0);

            int biaya = hitungBiaya(jenisKamar, penanganan, layananBersalin, lamaInap[i]);
            System.out.printf("| %-15s | %-15d |\n", getJenisKamar(jenisKamar), biaya);
            if (i < 5) {
                printHorizontalLine(tableWidth);
            }
        }
        printHorizontalLine(tableWidth);
    }

    static int hitungBiaya(char jenisKamar, char penanganan, char layananBersalin, int lamaInap) {
        int biayaKamar = 0;
        int biayaPenanganan = 0;
        int biayaBersalin = 0;

        switch (jenisKamar) {
            case '1':
                biayaKamar = 450000;
                break;
            case '2':
                biayaKamar = 250000;
                break;
            case '3':
                biayaKamar = 150000;
                break;
            case 'V':
                biayaKamar = 600000;
                break;
            case 'W':
                biayaKamar = 800000;
                break;
            default:
                System.out.println("Jenis kamar tidak valid.");
        }

        if (penanganan == 'D') {
            biayaPenanganan = 3000000;
        } else if (penanganan == 'B') {
            biayaPenanganan = 1500000;
        }

        if (layananBersalin == 'N') {
            biayaBersalin = 4000000;
        } else if (layananBersalin == 'C') {
            biayaBersalin = 8000000;
        }

        // Biaya lama inap per hari adalah 100000
        int biayaLamaInap = lamaInap * 100000;

        return biayaKamar + biayaPenanganan + biayaBersalin + biayaLamaInap;
    }

    static String getJenisKamar(char jenisKamar) {
        switch (jenisKamar) {
            case '1':
                return "Kamar 1";
            case '2':
                return "Kamar 2";
            case '3':
                return "Kamar 3";
            case 'V':
                return "Kamar VIP";
            case 'W':
                return "Kamar VVIP";
            default:
                return "Tidak Valid";
        }
    }
}