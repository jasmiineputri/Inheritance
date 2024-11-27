public class Kendaraan {
    private String merk;
    private int tahun;
    private double hargaSewa;
    private boolean disewa;

    public Kendaraan(String merk, int tahun, double hargaSewa) {
        this.merk = merk;
        this.tahun = tahun;
        this.hargaSewa = hargaSewa;
        this.disewa = false; // Default status: Tersedia
    }

    public void tampilkanInfo() {
        String status = disewa ? "Disewa" : "Tersedia";
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga Sewa: Rp" + hargaSewa + " per hari");
        System.out.println("Status: " + status);
    }

    public void sewa() {
        if (!disewa) {
            disewa = true;
            System.out.println(merk + " berhasil disewa.");
        } else {
            System.out.println(merk + " sudah disewa.");
        }
    }

    public void kembali() {
        if (disewa) {
            disewa = false;
            System.out.println(merk + " berhasil dikembalikan.");
        } else {
            System.out.println(merk + " sudah tersedia.");
        }
    }
}
