import java.util.Scanner;

public class LURINGM8 {
    public static void StandarRoom() {
        System.out.println("Standard Room");
        System.out.println("Harga /malam : Rp 550,000,-");
        System.out.println("+Sarapan : Rp 75.000");
    }

    public static void SuperiorRoom(){
        System.out.println("Superior Room");
        System.out.println("Harga /malam : Rp 650,000,-");
        System.out.println("+Sarapan : Rp 100.000,-");
    }

    public static void DeluxeRoom(){
        System.out.println("Deluxe Room");
        System.out.println("Harga /malam : Rp 850,000,-");
        System.out.println("+Sarapan : Rp 150.000,-");
    }

    public static void main(String[] args) {
        LURINGM8 LM = new LURINGM8();
        Scanner sc = new Scanner(System.in);

        System.out.println("[1]. Standar Room");
        System.out.println("[2]. Superior Room");
        System.out.println("[3]. Deluxe Room");
        System.out.println("[4]. Selesai ");

        System.out.print("Masukkan pilihan anda : ");
        int pilih = sc.nextInt();

        int jumlahRoom, jumlahOrang, hargaSarapan = 0, hargaPerMalam = 0, totalBayar = 0;

        switch (pilih) {
            case 1 :
                LM.StandarRoom();
                hargaPerMalam = 550000;
                hargaSarapan = 75000;
                break;

            case 2 :
                LM.SuperiorRoom();
                hargaPerMalam = 650000;
                hargaSarapan = 100000;
                break;

            case 3 :
                LM.DeluxeRoom();
                hargaPerMalam = 850000;
                hargaSarapan = 150000;
                break;

            case 4 :
                System.exit(0);
                break;

            default:
                System.out.println("Anda salah memilih nomor menu");
        }

        System.out.print("Masukkan jumlah room: ");
        jumlahRoom = sc.nextInt();

        System.out.print("Masukkan jumlah orang: ");
        jumlahOrang = sc.nextInt();

        System.out.print("Apakah Anda ingin sarapan? [YA/TIDAK]: ");
        String pilihanSarapan = sc.next();
       

        if (pilihanSarapan.equalsIgnoreCase("YA")) {
        totalBayar = (hargaPerMalam * jumlahRoom) + (hargaSarapan * jumlahOrang);
        System.out.println("Total bayar: Rp " + totalBayar);
    } else {
        totalBayar = (hargaPerMalam * jumlahRoom);
        System.out.println("Total bayar: Rp " + totalBayar);
            }
     }

    }