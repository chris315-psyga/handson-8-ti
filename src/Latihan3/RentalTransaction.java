package Latihan3;

public class RentalTransaction {
    // Properties
    private String namaPelanggan;
    private Vehicle kendaraan;
    private int durasiHari;
    private double totalBiaya;

    // Constructor
    public RentalTransaction(String namaPelanggan, Vehicle kendaraan, int durasiHari) {
        // TODO: Implementasi
        // TODO: Calculate total biaya
        this.namaPelanggan = namaPelanggan;
        this.kendaraan = kendaraan;
        this.durasiHari = durasiHari;
        this.totalBiaya = this.kendaraan.hitungBiayaRental(this.durasiHari);
    }

    // Method display rental details
    public void displayRentalDetails() {
        // TODO: Print detail rental
        System.out.println("Nama pelanggan: " + namaPelanggan);
        System.out.println("Kendaraan: " + kendaraan.merk + " " + kendaraan.model + " (" + kendaraan.getClass().getSimpleName() + ")");
        System.out.println("Durasi hari: " + durasiHari + " hari");
        System.out.println("Biaya per Hari: Rp " + (int)kendaraan.hargaRentalPerHari);
        System.out.println("Total biaya: Rp " + (int)totalBiaya);
    }

    // Getters
    public double getTotalBiaya() {
        return totalBiaya;
    }

    public Vehicle getKendaraan() {
        return kendaraan;
    }
}

