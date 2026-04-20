import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Penjualan {
    private String idPenjualan;
    private Date tanggal;
    private double total;

    // Aggregation
    private Pelanggan pelanggan;
    private Kasir kasir;

    // Composition & Collection
    private List<ItemPenjualan> daftarItem = new ArrayList<>();
    private Pembayaran pembayaran;

    public Penjualan(String idPenjualan, Pelanggan pelanggan, Kasir kasir) {
        this.idPenjualan = idPenjualan;
        this.tanggal = new Date();
        this.pelanggan = pelanggan;
        this.kasir = kasir;
        this.total = 0;
    }

    public void tambahItem(ItemPenjualan item) {
        daftarItem.add(item);
        System.out.println("Ditambahkan: " + item.getProduk().getNama() + " x" + item.getQty());
    }

    public void hitungTotal() {
        total = 0;
        for (ItemPenjualan item : daftarItem) {
            total += item.getSubtotal();
        }
        System.out.println("Total Belanja: Rp " + total);
    }

    // Dependency & Composition
    public void prosesPembayaran(Pembayaran p) {
        this.pembayaran = p;
        pembayaran.bayar();
        System.out.println("Transaksi selesai! Terima kasih, " + pelanggan.getNama() + ".");
    }
    
    public double getTotal() { return total; }
}