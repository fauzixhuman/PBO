class EWallet extends Pembayaran {
    public EWallet(double jumlah) {
        super(jumlah);
    }

    @Override
    public void bayar() {
        System.out.println("Pembayaran eWallet sebesar: " + jumlah);
    }
}
