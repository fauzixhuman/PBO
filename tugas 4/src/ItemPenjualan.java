import java.util.ArrayList;
import java.util.Date;
import java.util.List;


class ItemPenjualan {
    private int qty;
    private double harga;
    private double subtotal;
    
    // Aggregation: ItemPenjualan berelasi dengan Produk dan Kategori
    private Produk produk; 
    private Kategori kategori;

    public ItemPenjualan(Produk produk, Kategori kategori, int qty) {
        this.produk = produk;
        this.kategori = kategori;
        this.qty = qty;
        this.harga = produk.harga; // Mengambil harga dari Produk
        hitungSubtotal();
    }

    public void hitungSubtotal() {
        this.subtotal = this.qty * this.harga;
    }

    public double getSubtotal() { return subtotal; }
    public Produk getProduk() { return produk; }
    public int getQty() { return qty; }
}