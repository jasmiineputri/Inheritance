public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String merk, int tahun, double hargaSewa, int jumlahKursi) {
        super(merk, tahun, hargaSewa);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}
