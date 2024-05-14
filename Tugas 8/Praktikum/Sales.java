class Sales extends Pegawai {
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public double getKomisi() {
        return komisi;
    }

    @Override
    public double gaji() {
        return penjualan * komisi;
    }

    @Override
    public String toString() {
        return "Sales: " + getNama() + "\n" + super.toString() + "\nTotal Penjualan: " + penjualan + "\nBesaran Komisi: Rp." + komisi + "\nPendapatan: Rp." + gaji();
    }
}
