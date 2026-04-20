public class Mahasiswa {
    // 1. Deklarasi atribut (private untuk keamanan data/enkapsulasi)
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // 2. Constructor (Opsional, tapi baik untuk inisialisasi awal)
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // 3. GETTER (Untuk mengambil nilai atribut)
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    // 4. SETTER (Untuk mengubah nilai atribut)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setIpk(double ipk) {
        // Contoh validasi di dalam setter
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("Error: IPK harus berada di antara 0.0 hingga 4.0");
        }
    }
}