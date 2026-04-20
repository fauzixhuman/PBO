class Kasir {
    private String idKasir;
    private String nama;

    public Kasir(String idKasir, String nama) {
        this.idKasir = idKasir;
        this.nama = nama;
    }

    public void login() {
        System.out.println("Kasir " + nama + " berhasil login.");
    }

    public void prosesTransaksi() {
        System.out.println("Kasir " + nama + " sedang memproses transaksi...");
    }

    public String getNama() { return nama; }
}