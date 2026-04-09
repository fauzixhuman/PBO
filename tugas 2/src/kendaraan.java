public abstract class kendaraan{
    protected String merk;
    protected int tahun;
    protected double harga;

    public kendaraan(String merk, int tahun, double harga){
        this.merk = merk;
        this.tahun = tahun;
        this.harga = harga;
    }

    public void tampilkaninfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: " + harga);
    }

    abstract double hitungpajak();
}