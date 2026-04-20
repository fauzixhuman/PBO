class Pelanggan {
    private String idPelanggan;
    private String nama;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
    }

    public void registrasi() {
        System.out.println("Pelanggan " + nama + " berhasil diregistrasi.");
    }

    public void updateData() {
        System.out.println("Data pelanggan " + nama + " diperbarui.");
    }

    public String getNama() { return nama; }
}