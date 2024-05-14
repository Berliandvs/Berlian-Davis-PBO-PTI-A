class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    @Override
    public double gaji() {
        return upahPerJam * totalJam;
    }

    @Override
    public String toString() {
        return "Pegawai Harian: " + getNama() + "\n" + super.toString() + "\nUpah/jam: Rp." + upahPerJam + "\nTotal jam kerja: " + totalJam + "\nPendapatan: Rp." + gaji();
    }
}
