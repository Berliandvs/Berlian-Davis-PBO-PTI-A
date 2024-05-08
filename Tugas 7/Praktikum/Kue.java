// Konsep class
abstract class Kue { 
    private String nama; 
    private double harga; 

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    public String getNama() { 
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        System.out.println("Nama kue: " + this.nama);
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
        System.out.println("Harga kue diubah menjadi: " + this.harga);
    }

    public String toString() {
        return ""+ nama+", Harga: " + hitungHarga();
    }
}
