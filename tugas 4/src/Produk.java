class Produk {
    private String idProduk;
    private String nama;
    public double harga;

    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() { return nama; }
}