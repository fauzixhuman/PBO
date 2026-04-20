class Tunai extends Pembayaran {

    public Tunai(double jumlah) {
        super(jumlah);
    }
    @Override
    public void bayar() {
        System.out.println("Pembayaran tunai sebesar: " + jumlah);
    }

}
