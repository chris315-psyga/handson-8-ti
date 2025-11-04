package Latihan1;

public class Motor extends Kendaraan {
    // Properties tambahan
    private String jenisMotor; // "sport", "matic", "bebek"
    private boolean hadRemCakram;

    // Constructor
    public Motor(String merk, String warna, int tahunProduksi, String jenisMotor) {
        // TODO: Implementasi constructor dengan super
        super(merk, warna, tahunProduksi);

        this.jenisMotor = jenisMotor;
        System.out.println("Contructor Motor dipanggil");
    }

    // Override method
    @Override
    public void displayInfo() {
        // TODO: Implementasi dengan memanggil super dan menambahkan info Motor
        super.displayInfo();
        System.out.println("Jenis motor: " + jenisMotor);
    }

    @Override
    public void klakson() {
        // TODO: Print "Tiiin tiiin! (suara motor)"
        System.out.println("Tiiin tiiin! (suara motor");
    }

    // Method khusus Motor
    public void lakukanWheely() {
        // TODO: Print "[merk] melakukan wheelie!)"
        System.out.println(merk + "melakukan wheelie!");
    }
}

