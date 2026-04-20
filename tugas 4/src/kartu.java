class kartu extends Pembayaran {
    public kartu(double jumlah) {
        super(jumlah);
    }

    @Override
    public void bayar() {
        System.out.println("Pembayaran kartu sebesar: " + jumlah);
    }
}
