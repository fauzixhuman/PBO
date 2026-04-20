public class Produk {
    // 1. Deklarasi atribut (private)
    private String nama;
    private double harga;
    private int stok;

    // 2. Constructor
    public Produk(String nama, double harga, int stok) {
        
        setNama(nama);
        setHarga(harga);
        setStok(stok);
    }

    // 3. GETTER
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }


    public int getStok() {
        return stok;
    }

    // 4. SETTER DENGAN VALIDASI

    public void setNama(String nama) {
        // Validasi: Nama tidak boleh kosong
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        } else {
            System.out.println("Error: Nama produk tidak boleh kosong!");
            this.nama = "Produk Tanpa Nama"; // Nilai default jika salah
        }
    }

    public void setHarga(double harga) {
        // Validasi: Harga tidak boleh negatif (kurang dari 0)
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Error (" + this.nama + "): Harga tidak boleh kurang dari 0!");
            // Jika salah, nilai harga tidak akan diubah (tetap nilai sebelumnya)
        }
    }

    public void setStok(int stok) {
        // Validasi: Stok tidak boleh negatif
        if (stok >= 0) {
            this.stok = stok;
        } else {
            System.out.println("Error (" + this.nama + "): Stok tidak boleh kurang dari 0!");
        }
    }
}