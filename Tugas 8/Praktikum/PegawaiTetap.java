// Subclass PegawaiTetap
class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    @Override
    public double gaji() {
        return upah;
    }

    @Override
    public String toString() {
        return "Pegawai Tetap: " + getNama() + "\n" + super.toString() + "\nUpah: Rp." + upah + "\nPendapatan: Rp." + gaji();
    }
}
