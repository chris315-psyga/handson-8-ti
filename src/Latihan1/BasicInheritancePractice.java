package Latihan1;

public class BasicInheritancePractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Basic Inheritance
         *
         * Instruksi: Lengkapi semua latihan di bawah ini untuk menguasai
         * konsep dasar inheritance, penggunaan super, dan hierarki class.
         */

        // ===== INHERITANCE DASAR =====
        System.out.println("=== INHERITANCE DASAR ===");

        // Latihan 1: Membuat hierarki kendaraan sederhana
        // - Buat object dari class Mobil dengan parameter:
        //   merk: "Toyota", warna: "Hitam", tahun: 2022, jumlahPintu: 4, jenisBahanBakar: "Bensin"
        Mobil mobil = new Mobil("Toyota", "Hitam", 2022, 4, "Bensin");
        // - Panggil method displayInfo()
        mobil.displayInfo();
        // - Panggil method nyalakanAC()
        mobil.nyalakanAC();

        // Ekspektasi Output:
        // Constructor Kendaraan dipanggil
        // Constructor Mobil dipanggil
        // === Info Kendaraan ===
        // Merk: Toyota
        // Warna: Hitam
        // Tahun Produksi: 2022
        // Jumlah Pintu: 4
        // Bahan Bakar: Bensin
        // AC menyala

        // Latihan 2: Membuat hierarki kendaraan Motor
        // - Buat object dari class Motor dengan parameter:
        //   merk: "Honda", warna: "Merah", tahun: 2023, jenisMotor: "Sport"
        Motor motor = new Motor("Honda", "Merah", 2023, "Sport");
        // - Panggil method displayInfo()
        motor.displayInfo();
        // - Panggil method klakson()
        motor.klakson();
        // - Panggil method lakukanWheely()
        motor.lakukanWheely();

        // Ekspektasi Output:
        // Constructor Kendaraan dipanggil
        // Constructor Motor dipanggil
        // === Info Kendaraan ===
        // Merk: Honda
        // Warna: Merah
        // Tahun Produksi: 2023
        // Jenis Motor: Sport
        // Tiiin tiiin! (suara motor)
        // Honda melakukan wheelie!

        // ===== PENGGUNAAN SUPER =====
        System.out.println("\n=== PENGGUNAAN SUPER ===");

        // Latihan 3: Memanggil constructor parent
        // - Buat object Truk dengan parameter:
        //   merk: "Mitsubishi", warna: "Putih", tahun: 2021, kapasitasMuatan: 5.0, jumlahRoda: 6
        Truk truk = new Truk("Mitsubishi", "Putih", 2021, 5.0, 6);
        // - Panggil method displayInfo()
        truk.displayInfo();

        // Ekspektasi Output:
        // Constructor Kendaraan dipanggil
        // Constructor Truk dipanggil
        // === Info Kendaraan ===
        // Merk: Mitsubishi
        // Warna: Putih
        // Tahun Produksi: 2021
        // Kapasitas Muatan: 5.0 ton
        // Jumlah Roda: 6

        // Latihan 4: Mengakses method parent dengan super
        // - Panggil method klakson() dari object Truk
        truk.klakson();
        // - Method klakson() di Truk harus memanggil super.klakson() terlebih dahulu
        // - Kemudian tambahkan suara klakson truk yang lebih keras

        // Ekspektasi Output:
        // Tin tin!
        // HONK HONK! (suara klakson truk yang lebih keras)

        // ===== MULTILEVEL INHERITANCE =====
        System.out.println("\n=== MULTILEVEL INHERITANCE ===");

        // Latihan 5: Membuat hierarki 3 level
        // - Buat object MobilSport dengan parameter:
        //   merk: "Ferrari", warna: "Merah", tahun: 2024, jumlahPintu: 2,
        MobilSport mobilSport = new MobilSport("Ferrari", "Merah", 2024, 2, "Bensin", true, 320);
        //   jenisBahanBakar: "Bensin", turbo: true, kecepatanMaksimal: 320
        // - Panggil method displayInfo()
        mobilSport.displayInfo();
        // - Panggil method aktifkanTurbo()
        mobilSport.aktifkanTurbo();

        // Ekspektasi Output:
        // Constructor Kendaraan dipanggil
        // Constructor Mobil dipanggil
        // Constructor MobilSport dipanggil
        // === Info Kendaraan ===
        // Merk: Ferrari
        // Warna: Merah
        // Tahun Produksi: 2024
        // Jumlah Pintu: 2
        // Bahan Bakar: Bensin
        // Turbo: Ya
        // Kecepatan Maksimal: 320 km/jam
        // TURBO DIAKTIFKAN! Ferrari melaju dengan kecepatan maksimal!

        // ===== TESTING INHERITANCE =====
        System.out.println("\n=== TESTING INHERITANCE ===");

        // Latihan 6: Menggunakan instanceof
        // - Cek apakah mobilSport instanceof MobilSport
        if (mobilSport instanceof MobilSport){
            System.out.println("mobilSport instanceof MobilSport: true");
        }
        // - Cek apakah mobilSport instanceof Mobil
        if (mobilSport instanceof Mobil){
            System.out.println("mobilSport instanceof Mobil: true");
        }
        // - Cek apakah mobilSport instanceof Kendaraan
        if (mobilSport instanceof Kendaraan){
            System.out.println("mobilSport instanceof Kendaraan: true");
        }
        // - Cek apakah mobilSport instanceof Object
        if (mobilSport instanceof Object){
            System.out.println("mobilSport instanceof Object: true");
        }

        // Ekspektasi Output:
        // mobilSport instanceof MobilSport: true
        // mobilSport instanceof Mobil: true
        // mobilSport instanceof Kendaraan: true
        // mobilSport instanceof Object: true

        // Latihan 7: Akses level dan inheritance
        // - Coba akses property protected (merk, warna, tahunProduksi) dari child class -> BISA
        // - Coba akses property private (nomorRangka) langsung dari child class -> TIDAK BISA
        // - Gunakan getter untuk akses private property
        mobilSport.setNomorRangka("FRR2024001");
        System.out.println("");
        System.out.println("Protected property (merk): " + mobilSport.merk);
        System.out.println("Private property via getter (nomorRangka): " + mobilSport.getNomorRangka());


        // Ekspektasi Output:
        // Protected property (merk): Ferrari
        // Private property via getter (nomorRangka): FRR2024001
    }

}

