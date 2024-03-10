public class Buku {
    private String namaBuku;
    private String jenisBuku;
    private String halamanBuku;
    private boolean ISBN;

    public String getJenisBuku () {
        return jenisBuku;
    }

    public String getHalamanBuku () {
        return halamanBuku;
    }

    public boolean getISBN () {
        return ISBN;
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
