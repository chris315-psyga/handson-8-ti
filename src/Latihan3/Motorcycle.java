package Latihan3;

public class Motorcycle extends Vehicle {
    // Properties tambahan
    private String jenisMotor; // "Sport", "Matic", "Bebek"
    private int kapasitasMesin; // dalam CC

    // Constructor
    public Motorcycle(String merk, String model, int tahunProduksi, String nomorPolisi, double hargaRentalPerHari, String jenisMotor, int kapasitasMesin) {
        // TODO: Implementasi
        super(merk, model, tahunProduksi, nomorPolisi, hargaRentalPerHari);
        this.jenisMotor = jenisMotor;
        this.kapasitasMesin = kapasitasMesin;
    }

    // Override displayInfo
    @Override
    public void displayInfo() {
        // TODO: Implementasi
        super.displayInfo();
        System.out.println("Jenis sepeda motor: " + jenisMotor);
        System.out.println("Kapasitas mesin: " + kapasitasMesin);
    }

    // Override biaya rental (Motor lebih murah)
    @Override
    public double hitungBiayaRental(int jumlahHari) {
        // TODO: Implementasi
        return super.hitungBiayaRental(jumlahHari) * 0.90;
    }

    public String getJenisMotor() {
        return this.jenisMotor;
    }
}

