package Latihan2;

public class Mahasiswa {
    // Properties
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;

    // Constructor
    public Mahasiswa(String nim, String nama, String jurusan, double ipk) {
        // TODO: Implementasi
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
        System.out.println("");
    }

    // Override toString
    @Override
    public String toString() {
        // TODO: Return string representation
        return "Mahasiswa{nim: '" + nim + "', nama: '" + nama + "', jurusan: '" + jurusan + "', ipk: '" + ipk + "'}";
    }

    // Override equals - compare by NIM
    @Override
    public boolean equals(Object obj) {
        // TODO: Implementasi equals berdasarkan NIM
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Mahasiswa that = (Mahasiswa) obj;
        return this.nim.equals(that.nim);
    }

    // Override hashCode (best practice dengan equals)
    @Override
    public int hashCode() {
        // TODO: Return hash dari NIM
        return nim.hashCode();
    }
}

