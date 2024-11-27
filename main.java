import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // List untuk menyimpan kendaraan
        ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            // Tampilkan menu
            System.out.println("\n== Sistem Rental Kendaraan ==");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Lihat Daftar Kendaraan");
            System.out.println("3. Sewa Kendaraan");
            System.out.println("4. Kembalikan Kendaraan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Tambah kendaraan
                    System.out.println("\n== Tambah Kendaraan ==");
                    System.out.print("Jenis Kendaraan (1 = Mobil, 2 = Motor): ");
                    int jenis = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan buffer
                    System.out.print("Masukkan Merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Masukkan Tahun: ");
                    int tahun = scanner.nextInt();
                    System.out.print("Masukkan Harga Sewa: ");
                    double hargaSewa = scanner.nextDouble();

                    if (jenis == 1) {
                        System.out.print("Masukkan Jumlah Kursi: ");
                        int jumlahKursi = scanner.nextInt();
                        kendaraanList.add(new Mobil(merk, tahun, hargaSewa, jumlahKursi));
                    } else if (jenis == 2) {
                        scanner.nextLine(); // Membersihkan buffer
                        System.out.print("Masukkan Jenis Motor: ");
                        String jenisMotor = scanner.nextLine();
                        kendaraanList.add(new Motor(merk, tahun, hargaSewa, jenisMotor));
                    } else {
                        System.out.println("Jenis kendaraan tidak valid.");
                    }
                    break;

                case 2:
                    // Lihat daftar kendaraan
                    System.out.println("\n== Daftar Kendaraan ==");
                    if (kendaraanList.isEmpty()) {
                        System.out.println("Tidak ada kendaraan yang tersedia.");
                    } else {
                        for (int i = 0; i < kendaraanList.size(); i++) {
                            System.out.println("Kendaraan #" + (i + 1));
                            kendaraanList.get(i).tampilkanInfo();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    // Sewa kendaraan
                    System.out.print("\nMasukkan nomor kendaraan yang ingin disewa: ");
                    int sewaIndex = scanner.nextInt() - 1;
                    if (sewaIndex >= 0 && sewaIndex < kendaraanList.size()) {
                        kendaraanList.get(sewaIndex).sewa();
                    } else {
                        System.out.println("Nomor kendaraan tidak valid.");
                    }
                    break;

                case 4:
                    // Kembalikan kendaraan
                    System.out.print("\nMasukkan nomor kendaraan yang ingin dikembalikan: ");
                    int kembaliIndex = scanner.nextInt() - 1;
                    if (kembaliIndex >= 0 && kembaliIndex < kendaraanList.size()) {
                        kendaraanList.get(kembaliIndex).kembali();
                    } else {
                        System.out.println("Nomor kendaraan tidak valid.");
                    }
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih telah menggunakan sistem rental kendaraan!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
