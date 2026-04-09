class mobil extends kendaraan implements Servis{
    int jumlahpintu;

    public mobil(String merk, int tahun, double harga, int jumlahpintu){
        super(merk, tahun, harga);
        this.jumlahpintu = jumlahpintu;
    }
    
    @Override
    double hitungpajak(){
        return harga * 0.1;
    }

    @Override
    public void jadwalservis(){
        System.out.println("Jadwal Servis setiap 10.000 KM ");
    }
}