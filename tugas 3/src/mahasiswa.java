public class mahasiswa {
    String nama;
    String nim;
    String alamat;
    String jurusan;
    String fakultas;
    String email;

    public mahasiswa(String nama, String nim, String alamat, String jurusan, String fakultas, String email) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.jurusan = jurusan;
        this.fakultas = fakultas;
        this.email = email;
    }
    
    void tampil() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Email: " + email);
    }
}
