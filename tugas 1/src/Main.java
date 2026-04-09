
class Mahasiswa {

    String nama;
    String nim;
    String jurusan;


    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }


    public void tampilkanData() {
        System.out.println("--- Data Mahasiswa ---");
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
    }
}


class Dosen {

    String nama;
    String nidn;
    String fakultas;


    public Dosen(String nama, String nidn, String fakultas) {
        this.nama = nama;
        this.nidn = nidn;
        this.fakultas = fakultas;
    }


    public void tampilkanData() {
        System.out.println("--- Data Dosen ---");
        System.out.println("Nama     : " + nama);
        System.out.println("NIDN     : " + nidn);
        System.out.println("Fakultas : " + fakultas);
    }
}


class MataKuliah {

    String namaMk;
    String kodeMk;
    int sks;


    public MataKuliah(String namaMk, String kodeMk, int sks) {
        this.namaMk = namaMk;
        this.kodeMk = kodeMk;
        this.sks = sks;
    }


    public void tampilkanData() {
        System.out.println("--- Data Mata Kuliah ---");
        System.out.println("Nama MK  : " + namaMk);
        System.out.println("Kode MK  : " + kodeMk);
        System.out.println("SKS      : " + sks);
        System.out.println();
    }
}

// Class Utama untuk menjalankan program dan membuat Objek
public class Main {
    public static void main(String[] args) {



        Mahasiswa mhs1 = new Mahasiswa("Ahmad Fauzi", "A11.2024.001", "Teknik Informatika");
        mhs1.tampilkanData();


        Dosen dosen1 = new Dosen("Aldi Firmansyah", "0612345678", "Ilmu Komputer");
        dosen1.tampilkanData();


        MataKuliah mk1 = new MataKuliah("Pemrograman Berorientasi Objek", "CS301", 3);
        mk1.tampilkanData();

        Mahasiswa mhs2 = new Mahasiswa("Aldi Firmansyah", "0612345678", "Ilmu Komputer");
        mhs2.tampilkanData();
    }
}