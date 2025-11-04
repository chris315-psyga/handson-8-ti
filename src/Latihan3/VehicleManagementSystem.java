package Latihan3;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        /*
         * REAL-WORLD PROJECT: Vehicle Rental Management System
         *
         * Deskripsi: Sistem untuk mengelola rental kendaraan dengan berbagai
         * tipe kendaraan dan perhitungan biaya rental yang berbeda.
         */

        // ===== SETUP RENTAL SYSTEM =====
        System.out.println("=== VEHICLE RENTAL MANAGEMENT SYSTEM ===\n");

        // Latihan 1: Create vehicle fleet
        // - Buat 3 Mobil: Toyota Avanza, Honda Jazz, Suzuki Ertiga
        Vehicle Mobil1 = new Vehicle("Toyota", "Avanza", 2021, "BM 1315 GX", 300000);
        Vehicle Mobil2 = new Vehicle("Honda", "Jazz", 2018, "BM 2002 CN", 350000);
        Vehicle Mobil3 = new Vehicle("Suzuki", "Ertiga", 2018, "BM 1928 RX", 325000);
        // - Buat 2 Motor: Honda Beat, Yamaha NMAX
        Vehicle Motor1 = new Vehicle("Honda", "Beat", 2017, "BM 4927 RN", 100000);
        Vehicle Motor2 = new Vehicle("Yamaha", "NMAX", 2019, "BM 9780", 150000);
        // - Set harga rental per hari untuk masing-masing
        System.out.println("Fleet created: 5 vehicles");
        System.out.println("");

        // Ekspektasi Output:
        // Fleet created: 5 vehicles

        // Latihan 2: Display all vehicles
        // - Loop semua kendaraan
        // - Display info lengkap masing-masing
        Mobil1.displayInfo();
        Mobil2.displayInfo();
        Mobil3.displayInfo();
        Motor1.displayInfo();
        Motor2.displayInfo();

        // Ekspektasi Output:
        // [Info detail untuk setiap kendaraan]

        // Latihan 3: Rent a vehicle
        // - Customer "Andi" rental Toyota Avanza selama 3 hari
        RentalTransaction transaksi1 = new RentalTransaction("Andi", Mobil1, 3);
        // - Calculate total biaya
        // - Display rental details
        transaksi1.displayRentalDetails();

        // Ekspektasi Output:
        // Rental untuk: Andi
        // Kendaraan: Toyota Avanza (Mobil)
        // Durasi: 3 hari
        // Biaya per hari: Rp 300,000
        // Total biaya: Rp 900,000

        // Latihan 4: Calculate monthly revenue
        // - Rent beberapa kendaraan
        Car Mobil4 = new Car("Toyota", "Avanza", 2021, "BM 2681 GX", 300000.0, 7, "Manual", false);
        Car Mobil5 = new Car("Honda", "Jazz", 2018, "BM 9611 OP", 350000.0, 5, "Automatic", true);
        Car Mobil6 = new Car("Suzuki", "Ertiga", 2018, "BM 4600 WE", 325000.0, 7, "Manual", true);
        Motorcycle Motor3 = new Motorcycle("Honda", "Beat", 2017, "BM 8412 MB", 100000.0, "Matic", 110);
        Motorcycle Motor4 = new Motorcycle("Yamaha", "NMAX", 2019, "BM 7920 RT", 150000.0, "Matic", 155);
        // - Calculate total revenue bulan ini
        RentalTransaction[] transaksiBulanIni = new RentalTransaction[2];
        transaksiBulanIni[0] = new RentalTransaction("Sule", Mobil4, 10);
        transaksiBulanIni[1] = new RentalTransaction("Siti", Mobil5, 6);

        double totalRevenue = 0.0;
        for (RentalTransaction transaksi : transaksiBulanIni) {
            totalRevenue += transaksi.getTotalBiaya();
        }
        System.out.println("");
        System.out.println("Total revenue bulan ini: Rp " + (int)totalRevenue);
        System.out.println("");

        // Ekspektasi Output:
        // Total revenue bulan ini: Rp 5,400,000

        // Latihan 5: Vehicle maintenance
        // - Mark beberapa kendaraan sebagai "under maintenance"
        Car Mobil7 = new Car("Toyota", "Avanza", 2021, "BM 2398 AB", 300000.0, 7, "Manual", false);
        Car Mobil8 = new Car("Honda", "Jazz", 2018, "BM 6490 LK", 350000.0, 5, "Automatic", true);
        Car Mobil9 = new Car("Suzuki", "Ertiga", 2018, "BM 1050 KA", 325000.0, 7, "Manual", true);
        Motorcycle Motor5 = new Motorcycle("Honda", "Beat", 2017, "BM 2189 JH", 100000.0, "Matic", 110);
        Motorcycle Motor6 = new Motorcycle("Yamaha", "NMAX", 2019, "BM 6511 KC", 150000.0, "Matic", 155);

        Mobil7.setTersedia(true);
        Mobil8.setTersedia(false);
        Mobil9.setTersedia(true);
        Motor5.setTersedia(true);
        Motor6.setTersedia(false);

        Vehicle[] fleet = new Vehicle[5];
        fleet[0] = Mobil7;
        fleet[1] = Mobil8;
        fleet[2] = Mobil9;
        fleet[3] = Motor5;
        fleet[4] = Motor6;
        // - Display available vehicles only

        int jumlahTersedia = 0;
        int jumlahMaintenance = 0;

        for (Vehicle kendaraan : fleet) {
            if (kendaraan.isTersedia()) {
                jumlahTersedia++;
            } else {
                jumlahMaintenance++;
            }
        }

        System.out.println("Available vehicles: " + jumlahTersedia);
        System.out.println("Under maintenance: " + jumlahMaintenance);
        System.out.println("");

        // Ekspektasi Output:
        // Available vehicles: 3
        // Under maintenance: 2

        // Latihan 6: Find vehicles by criteria
        // - Find all Mobil dengan harga < Rp 350,000/hari
        int jumlahMobilMurah = 0;
        for (Vehicle kendaraan : fleet) {
            if (kendaraan instanceof Car) {
                if (kendaraan.hargaRentalPerHari < 350000) {
                    jumlahMobilMurah++;
                }
            }
        }
        System.out.println("Found " + jumlahMobilMurah + " Mobil sesuai kriteria");

        // - Find all Motor jenis "matic"
        int jumlahMotorMatic = 0;
        for (Vehicle kendaraan : fleet) {
            if (kendaraan instanceof Motorcycle) {
                Motorcycle motor = (Motorcycle) kendaraan;

                if (motor.getJenisMotor().equals("Matic")) {
                    jumlahMotorMatic++;
                }
            }
        }
        System.out.println("Found " + jumlahMotorMatic + " Motor matic");
        System.out.println("");

        // Ekspektasi Output:
        // Found 2 Mobil sesuai kriteria
        // Found 1 Motor matic

        // Latihan 7: Generate rental report
        // - Display summary rental bulan ini
        // - Group by vehicle type
        // - Show total revenue per
        transaksiBulanIni = new RentalTransaction[4];
        transaksiBulanIni[0] = new RentalTransaction("Budi", Mobil7, 10);
        transaksiBulanIni[1] = new RentalTransaction("Siti", Mobil9, 6);
        transaksiBulanIni[2] = new RentalTransaction("Rina", Motor5, 5);
        transaksiBulanIni[3] = new RentalTransaction("Doni", Motor4, 7);

        int jumlahRentalMobil = 0;
        double totalPendapatanMobil = 0.0;

        int jumlahRentalMotor = 0;
        double totalPendapatanMotor = 0.0;

        for (RentalTransaction transaksi : transaksiBulanIni) {
            Vehicle kendaraanDisewa = transaksi.getKendaraan();

            if (kendaraanDisewa instanceof Car) {
                jumlahRentalMobil++;
                totalPendapatanMobil += transaksi.getTotalBiaya();
            } else if (kendaraanDisewa instanceof Motorcycle) {
                jumlahRentalMotor++;
                totalPendapatanMotor += transaksi.getTotalBiaya();
            }
        }

        double totalPendapatanKeseluruhan = totalPendapatanMobil + totalPendapatanMotor;
        System.out.println("=== RENTAL REPORT ===");
        System.out.println("Mobil: " + jumlahRentalMobil + " rentals, Rp " + (int)totalPendapatanMobil);
        System.out.println("Motor: " + jumlahRentalMotor + " rentals, Rp " + (int)totalPendapatanMotor);
        System.out.println("Total: Rp " + (int)totalPendapatanKeseluruhan);
        // Ekspektasi Output:
        // === RENTAL REPORT ===
        // Mobil: 15 rentals, Rp 4,200,000
        // Motor: 8 rentals, Rp 1,200,000
        // Total: Rp 5,400,000
    }
}

