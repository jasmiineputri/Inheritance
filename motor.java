public class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String merk, int tahun, double hargaSewa, String jenisMotor) {
        super(merk, tahun, hargaSewa);
        this.jenisMotor = jenisMotor;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Motor: " + jenisMotor);
    }
}
