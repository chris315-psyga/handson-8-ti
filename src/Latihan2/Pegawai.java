package Latihan2;

public class Pegawai {
    // Properties
    protected String nip;
    protected String nama;
    protected String jurusan;

    // Constructor
    public Pegawai(String nip, String nama, String jurusan) {
        // TODO: Implementasi
        this.nip = nip;
        this.nama = nama;
        this.jurusan = jurusan;
        System.out.println("");
        System.out.println("===Pegawai===");
    }

    // Method untuk di-override
    public void displayInfo() {
        // TODO: Print info pegawai
        System.out.println("Nim: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }

    // Method clone dengan return type Pegawai
    public Pegawai clone() {
        // TODO: Return new Pegawai dengan data yang sama
        return new Pegawai(nip, nama, jurusan);
    }

    // Protected method untuk ditest widening
    protected void methodProtected() {
        // TODO: Print "Protected method in Pegawai"
        System.out.println("Protected method in Pegawai");
    }

    // Final method - tidak bisa di-override
    public final void calculateSalary() {
        // TODO: Print "Menghitung gaji pegawai..."
        System.out.println("Menghitung gaji pegawai...");
    }

    @Override
    public String toString() {
        // TODO: Override toString()
        return "NIP: " + nip + "\n" +
                "Nama: " + nama + "\n" +
                "Jurusan: " + jurusan;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Pegawai pegawai = (Pegawai) obj;
        return java.util.Objects.equals(nip, pegawai.nip);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nip);
    }
}
