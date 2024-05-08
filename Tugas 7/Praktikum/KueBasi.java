public class KueBasi extends Kue {
    private int lamaHari;

    public KueBasi(String nama, double harga, int lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    public int getLamaHari() {
        return lamaHari;
    }

    public void setLamaHari(int lamaHari) {
        this.lamaHari = lamaHari;
    }

    @Override
    public double hitungHarga() {
        return super.getHarga() - (lamaHari * (super.getHarga() * 0.1));
    }

    @Override
    public String toString() {
        return "\nKue Basi\n" + super.toString() + String.format("\nLama Hari: %d hari", lamaHari);
    } 
}
