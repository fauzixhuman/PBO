class truk extends kendaraan implements Servis{
    double kapasitas;

    public truk(String merk, int tahun, double harga, double kapasitas){
        super(merk, tahun, harga);
        this.kapasitas = kapasitas;
    }

    @Override
    double hitungpajak(){
        return harga * 0.15;
    }

    @Override
    public void jadwalservis(){
        System.out.println("Jadwal Servis setiap 5.000 KM hingga 10.000 KM ");
    }
}