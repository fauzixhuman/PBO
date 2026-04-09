class motor extends kendaraan implements Servis{
    String tipe;

    public motor(String merk, int tahun, double harga, String tipe){
        super(merk, tahun, harga);
        this.tipe = tipe;
    }

    @Override
    double hitungpajak(){
        return harga * 0.05;
    }

    @Override
    public void jadwalservis(){
        System.out.println("Jadwal Servis setiap 2.000 KM ");
    }
}