public class App {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa("Syamsul", "A23.2028.221144", "Teknik Informatika", 3.50);

        
        System.out.println("=== DATA MAHASISWA AWAL ===");
        System.out.println("Nama    : " + mhs1.getNama());
        System.out.println("NIM     : " + mhs1.getNim());
        System.out.println("Jurusan : " + mhs1.getJurusan());
        System.out.println("IPK     : " + mhs1.getIpk());

        
        System.out.println("\n=== MENGUBAH DATA ===");
        mhs1.setIpk(3.85); 
        mhs1.setJurusan("Teknik Informatika"); 

        
        System.out.println("Jurusan Baru : " + mhs1.getJurusan());
        System.out.println("IPK Baru     : " + mhs1.getIpk());

        
        System.out.println("\n=== UJI VALIDASI SETTER IPK ===");
        mhs1.setIpk(4.5); 

        Produk produkGagal = new Produk("", -50000, -10);
        
        System.out.println("\nHasil data produkGagal:");
        System.out.println("Nama  : " + produkGagal.getNama());
        System.out.println("Harga : Rp " + produkGagal.getHarga());
        System.out.println("Stok  : " + produkGagal.getStok());

        System.out.println("\n=== 2. MEMBUAT DATA YANG BENAR ===");
        Produk laptop = new Produk("Laptop Asus", 15000000, 5);
        System.out.println("Nama  : " + laptop.getNama());
        System.out.println("Harga : Rp " + laptop.getHarga());
        System.out.println("Stok  : " + laptop.getStok());

        System.out.println("\n=== 3. UJI VALIDASI SAAT MENGUBAH DATA (SETTER) ===");
        // Mencoba mengubah stok menjadi negatif karena barang rusak/hilang (salah input)
        laptop.setStok(-2); 
        
        // Memastikan stok tidak berubah menjadi -2
        System.out.println("Stok Akhir " + laptop.getNama() + " : " + laptop.getStok());
    }
}