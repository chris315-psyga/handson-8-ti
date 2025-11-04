package Latihan2;

public class MethodOverridingPractice {
    public static void main(String[] args) {
        /*
         * PRAKTIK HANDS-ON: Method Overriding
         *
         * Instruksi: Lengkapi semua latihan untuk menguasai method overriding,
         * covariant return types, dan best practices.
         */

        // ===== BASIC METHOD OVERRIDING =====
        System.out.println("=== BASIC METHOD OVERRIDING ===");

        // Latihan 1: Override method toString()
        // - Buat object Mahasiswa dengan parameter:
        //   nim: "2024001", nama: "Budi", jurusan: "Informatika", ipk: 3.75
        Mahasiswa mahasiswa = new Mahasiswa("2481004", "Chris Maruli Siagian", "Teknik Informatika", 3.5);
        // - Print object menggunakan toString()
        System.out.println(mahasiswa);

        // Ekspektasi Output:
        // Mahasiswa{nim='2024001', nama='Budi', jurusan='Informatika', ipk=3.75}

        // Latihan 2: Override method equals()
        // - Buat dua object Mahasiswa dengan NIM yang sama
        Mahasiswa mahasiswa1 = new Mahasiswa("2481004", "Santa", "Teknik Informatika", 3.69);
        Mahasiswa mahasiswa2 = new Mahasiswa("2481004", "Satan", "Teknik Informatika", 3.68);
        // - Compare menggunakan equals()
        System.out.println("m1.equals(m2): " + mahasiswa1.equals(mahasiswa2));
        // - Compare menggunakan == (reference equality)
        System.out.println("m1 == m2: " + (mahasiswa1 == mahasiswa2));

        // Ekspektasi Output:
        // m1.equals(m2): true (karena NIM sama)
        // m1 == m2: false (referensi berbeda)

        // ===== OVERRIDING WITH SUPER =====
        System.out.println("\n=== OVERRIDING WITH SUPER ===");

        // Latihan 3: Override dengan memanggil super
        // - Buat object Dosen dengan parameter:
        //   nip: "198901001", nama: "Dr. Sarah", jurusan: "Informatika",
        //   mataKuliah: "PBO", pengalamanMengajar: 10
        Dosen dosen1 = new Dosen("198901001", "Dr. Sule", "Informatika", "Sistem Basis Data", 15);
        // - Panggil method displayInfo()
        dosen1.displayInfo();

        // Ekspektasi Output:
        // === Info Pegawai ===
        // NIP: 198901001
        // Nama: Dr. Sarah
        // Jurusan: Informatika
        // Mata Kuliah: PBO
        // Pengalaman: 10 tahun

        // Latihan 4: Chain of overriding
        // - Buat object DosenProfessor extends Dosen
        DosenProfessor dosenProfessor = new DosenProfessor("198901002", "Pak RT", "Informatika", "Matematika diskrit", 20, "D.Sc", 20);
        // - Override displayInfo() untuk menambah info gelar profesor
        dosenProfessor.displayInfo();
        // - Test chain dari Pegawai -> Dosen -> DosenProfessor

        // Ekspektasi Output:
        // Pegawai constructor called
        // Dosen constructor called
        // DosenProfessor constructor called
        // [info lengkap dengan gelar profesor]

        // ===== COVARIANT RETURN TYPES =====
        System.out.println("\n=== COVARIANT RETURN TYPES ===");

        // Latihan 5: Return type yang lebih spesifik
        // - Override method clone() untuk return type yang lebih spesifik
        // - Parent return type: Pegawai
        // - Child return type: Dosen (covariant)
        Dosen dosenAsli = new Dosen("198901001", "Dr. Sarah", "Informatika", "PBO", 10);
        Dosen clone = dosenAsli.clone();
        if (clone instanceof Dosen){
            System.out.println("Clone berhasil dengan type yang lebih spesifik");
        }
        System.out.println("orginal != clone (referensi berbeda): " + (dosenAsli != clone));
        System.out.println("original.equals(clone) (konten sama): " + dosenAsli.equals(clone));

        // Ekspektasi Output:
        // Clone berhasil dengan type yang lebih spesifik
        // original != clone (referensi berbeda)
        // original.equals(clone) (konten sama)

        // ===== OVERRIDING RULES =====
        System.out.println("\n=== OVERRIDING RULES ===");

        // Latihan 6: Access modifier rules
        // - Override method dengan access yang sama atau lebih luas
        // - Test: protected -> public (VALID)
        Dosen dosen2 = new Dosen("198901033", "Makmur", "Informatika", "Structur data", 15);
        dosen2.methodProtected();
        System.out.println("Widening access modifier: ALLOWED");
        // - Test: public -> protected (INVALID - compile error)

        // Ekspektasi Output:
        // Widening access modifier: ALLOWED
        // Narrowing access modifier: COMPILE ERROR
        // hasilnya yang Narrowing itu error dan jadi seperti ini : java: displayInfo() in Latihan2.Dosen cannot override displayInfo() in Latihan2.Pegawai
        //  attempting to assign weaker access privileges; was public

        // Latihan 7: Return type rules
        // - Override dengan same return type
        System.out.println("Bagian same return type:");
        System.out.println("1.Bagian kelas induk yakni pegawai: public void displayInfo() {\n" +
                "    System.out.println(\"Nim: \" + nip);\n" +
                "    System.out.println(\"Nama: \" + nama);\n" +
                "    System.out.println(\"Jurusan: \" + jurusan);\n" +
                "}");
        System.out.println("2.Bagian kelas anak yakni dosen: @Override\n" +
                "public void displayInfo() {\n" +
                "    super.displayInfo(); // Memanggil method induk\n" +
                "    System.out.println(\"Mata kuliah: \" + mataKuliah);\n" +
                "    System.out.println(\"Pengalaman: \" + pengalamanMengajar + \" tahun\");\n" +
                "}");
        System.out.println("Karena kedua method display info di class pegawai dan dosen itu memiliki return type yang sama maka hasil overridingnya Valid");
        System.out.println("Same return type: VALID\n");
        // - Override dengan covariant return type
        System.out.println("Bagian covariant return type:");
        System.out.println("1. Bagian kelas induk yakni pegawai: public Pegawai clone() {\n" +
                "        // TODO: Return new Pegawai dengan data yang sama\n" +
                "        return new Pegawai(nip, nama, jurusan);\n" +
                "    }");
        System.out.println("2. Bagian kelas anak yakni dosen: @Override\n" +
                "    public Dosen clone() {\n" +
                "        // TODO: Return new Dosen\n" +
                "        return new Dosen(nip, nama, jurusan, mataKuliah, pengalamanMengajar);\n" +
                "    }");
        System.out.println("3. Bagian MethodOverridingPractice: Dosen dosen2 = new Dosen(\"198901033\", \"Makmur\", \"Informatika\", \"Structur data\", 15);\n" +
                "        dosen2.methodProtected();");
        System.out.println("Hasilnya valid karena class Dosen adalah subclass dari class Pegawai sehingga setiap objek pada class Dosen juga adalah sebuah objek di class Pegawai.");
        System.out.println("Covariant return type: VALID\n");
        // - Override dengan unrelated return type (ERROR)
        System.out.println("Bagian unrealated return type: ");
        System.out.println("1. Bagian class anak yakni Dosen yang di ubah ke yang salah:   @Override\n" +
                "    public String clone() {\n" +
                "        // TODO: Return new Dosen\n" +
                "        return \"clone yang salah\";\n" +
                "    }");
        System.out.println("Hasil outputnya seperti ini: java: incompatible types: java.lang.String cannot be converted to Latihan2.Dosen");
        System.out.println("Unrelated return type: COMPILE ERROR\n");

        // Ekspektasi Output:
        // Same return type: VALID
        // Covariant return type: VALID
        // Unrelated return type: COMPILE ERROR

        // Latihan 8: Final method
        // - Try to override final method -> COMPILE ERROR
        System.out.println("Apabila menambahkan coding di samping pada class Dosen maka akan timbul error seperti yang ada dibawah: @Override\n" +
                "    public void calculateSalary() {\n" +
                "        // TODO: Print \"Menghitung gaji pegawai...\"\n" +
                "        System.out.println(\"Menghitung gaji pegawai...\");\n" +
                "    }");
        System.out.println("java: calculateSalary() in Latihan2.Dosen cannot override calculateSalary() in Latihan2.Pegawai\n" +
                "  overridden method is final");
        System.out.println("Cannot override final method: COMPILE ERROR");
        // - Final method tidak bisa di-override

        // Ekspektasi Output:
        // Cannot override final method: COMPILE ERROR
    }
}

