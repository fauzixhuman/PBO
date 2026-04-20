public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM POINT OF SALES ===\n");


        Kasir kasir1 = new Kasir("KSR-01", "Budi");
        kasir1.login();

        Pelanggan pelanggan1 = new Pelanggan("PLG-99", "Ahmad");
        pelanggan1.registrasi();

        Kategori katOtomotif = new Kategori("Perawatan Mobil");
        Produk prod1 = new Produk("PRD-01", "Shampoo Mobil", 50000);
        Produk prod2 = new Produk("PRD-02", "Cairan Pembersih Kaca", 35000);

        System.out.println("\n--- Memulai Transaksi ---");
        

        kasir1.prosesTransaksi();
        Penjualan transaksi1 = new Penjualan("TRX-1001", pelanggan1, kasir1);

 
        ItemPenjualan item1 = new ItemPenjualan(prod1, katOtomotif, 2); 
        ItemPenjualan item2 = new ItemPenjualan(prod2, katOtomotif, 1); 

        transaksi1.tambahItem(item1);
        transaksi1.tambahItem(item2);

        
        transaksi1.hitungTotal();

        Pembayaran bayarPakaiQris = new EWallet(transaksi1.getTotal());
        transaksi1.prosesPembayaran(bayarPakaiQris);
    }
}