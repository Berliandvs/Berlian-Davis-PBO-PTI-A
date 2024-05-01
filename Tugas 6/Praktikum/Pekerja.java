import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Pekerja extends Manusia {
    protected double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        if (tahunMasuk.until(LocalDate.now()).getYears() <= 5) {
            return gaji * 0.05;
        } else if (tahunMasuk.until(LocalDate.now()).getYears() <= 10) {
            return gaji * 0.1;
        } else {
            return gaji * 0.15;
        }
    }

    public double getTunjangan() {
        return getBonus() + jumlahAnak * 20;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return super.toString() + "\nTahun Masuk\t: " + tahunMasuk.format(formatter) + "\nJumlah Anak\t: " + jumlahAnak + "\nGaji\t\t: " + gaji + "\nBonus\t\t: " + getBonus() + "\nTunjangan\t: " + getTunjangan();
    }
}
