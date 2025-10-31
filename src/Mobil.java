public class Mobil {
    protected String merk;
    protected String warna;
    protected int tahun;
    protected int jumlahPintu;
    protected String jenisBahanBakar;

    public Mobil(String merk, String warna, int tahun, int jumlahPintu, String jenisBahanBakar){
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void displyaInfo() {
        System.out.println("===Informasi Mobil===");
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("Jumlah pintu: " + jumlahPintu);
        System.out.println("Jenis bahan bakar: " + jenisBahanBakar);
    }
}
