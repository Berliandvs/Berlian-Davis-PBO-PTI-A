public class Buku {
    private String namaBuku;
    private String jenisBuku;
    private String halamanBuku;
    private boolean ISBN;

    //NO 1 (Tambahkan 3 constructor overload pada 1 class diagram yang telah kalian buat)
    // Constructor pertama
    public Buku() {
        // Constructor kosong
    }
    // Constructor overload kedua
    public Buku(String namaBuku) {
        this.namaBuku = namaBuku;
    }
    // Constructor overload ketiga
    public Buku(String namaBuku, String jenisBuku) {
        this.namaBuku = namaBuku;
        this.jenisBuku = jenisBuku;
    }
    // Constructor overload keempat
    public Buku(String namaBuku, String jenisBuku, String halamanBuku) {
        this.namaBuku = namaBuku;
        this.jenisBuku = jenisBuku;
        this.halamanBuku = halamanBuku;
    }

    public String getJenisBuku () {
        return jenisBuku;
    }

    public String getHalamanBuku () {
        return halamanBuku;
    }

    public boolean getISBN () {
        return ISBN;
    }

    //NO 2 (Tambahkan 3 method overload pada 1 class diagram yang telah kalian buat)
    // Method overload pertama
    public void simpanBuku(String lokasiSimpan) {
        System.out.println("Buku " + namaBuku + " disimpan di " + lokasiSimpan);
    }

    // Method overload kedua
    public void simpanBuku(int jumlahSalinan) {
        System.out.println(jumlahSalinan + " salinan dari buku " + namaBuku + " disimpan.");
    }

    // Method overload ketiga
    public void simpanBuku(String lokasiSimpan, int jumlahSalinan) {
        System.out.println(jumlahSalinan + " salinan dari buku " + namaBuku + " disimpan di " + lokasiSimpan);
    }

    //NO 3 (Tambahkan 1 method instans yang mengembalikan tipe data class itu sendiri pada 1 class diagram yang telah kalian buat)
    // Method instans yang mengembalikan tipe data kelas itu sendiri
    public Buku getCopy() {
        Buku copyBuku = new Buku();
        copyBuku.namaBuku = this.namaBuku;
        copyBuku.jenisBuku = this.jenisBuku;
        copyBuku.halamanBuku = this.halamanBuku;
        copyBuku.ISBN = this.ISBN;
        return copyBuku;
    }

    public void bacaBuku() {
        // Implementasi untuk membaca buku
        System.out.println("Sedang membaca buku: " + namaBuku);
    }

    public void simpanBuku() {
        // Implementasi untuk menyimpan informasi buku
        System.out.println("Buku disimpan: " + namaBuku);
    }
    public void tampilkanDataBuku() {
        System.out.println("Data Buku:");
        System.out.println("Nama Buku: " + namaBuku);
        System.out.println("Jenis Buku: " + jenisBuku);
        System.out.println("Halaman Buku: " + halamanBuku);
        System.out.println("ISBN: " + ISBN);
    }

    public void setInputNamaBuku(String inputNamaBuku) {
        this.namaBuku = inputNamaBuku;
    }

    public void setInputJenisBuku(String inputJenisBuku) {
        this.jenisBuku = inputJenisBuku;
    }

    public void setInputHalamanBuku(String inputHalamanBuku) {
        this.halamanBuku = inputHalamanBuku;
    }

    public void setInputISBN(boolean inputISBN) {
        this.ISBN = inputISBN;
    }
}

