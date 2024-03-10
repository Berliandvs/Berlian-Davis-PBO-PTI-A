public class Perpustakaan {
    private String namaPerpustakaan;
    private boolean statusPerpustakaan;
    private int tahunBerdiriPerpustakaan;
    private String alamatPerpustakaan;

    public Perpustakaan(String namaPerpustakaan, boolean statusPerpustakaan, int tahunBerdiriPerpustakaan, String alamatPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.statusPerpustakaan = statusPerpustakaan;
        this.tahunBerdiriPerpustakaan = tahunBerdiriPerpustakaan;
        this.alamatPerpustakaan = alamatPerpustakaan;
    }

    public void tampilkanData() {
        // Implementasi untuk menampilkan data perpustakaan
        System.out.println("Perpustakaan "+namaPerpustakaan+" adalah perpustakaan yang berdiri pada tahun "+tahunBerdiriPerpustakaan);
        System.out.println("Status Perpustakaan " +namaPerpustakaan +" adalah " + statusPerpustakaan);
        System.out.println("Dan alamat perpustakaan ini " + alamatPerpustakaan);
    }

    public void menyimpanBuku(int jumlahBuku) {
        // Implementasi untuk menyimpan buku dengan memanggil variabel jumlahBuku
        System.out.println("Menyimpan " + jumlahBuku + " buku ke dalam perpustakaan.");
    }

    public void simpanData(String dataPetugas) {
        // Implementasi untuk menyimpan data petugas dengan memanggil variabel dataPetugas
        System.out.println("Data petugas disimpan: " + dataPetugas);
    }
}
