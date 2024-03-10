public class PetugasPerpustakaan {
    private String namaPetugas;
    private String jabatanPetugas;
    private double gajiPetugas;
    private String jamOperasional;

    public void karirPetugas() {
        // Implementasi untuk menampilkan karir petugas
        namaPetugas = ("Davis");
        jabatanPetugas = ("Kepala Perpustakaan");
        gajiPetugas = (1000000.00);
        jamOperasional = ("08.00-09.00 WIB");
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Jabatan: " + jabatanPetugas);
        System.out.println("Gaji: Rp" + gajiPetugas);
        System.out.println("Jam Operasional: " + jamOperasional);
    }

    public void menambahkanBuku(int jumlahBuku) {
        // Implementasi untuk menambahkan buku dengan memanggil variabel jumlahBuku
        System.out.println("Menambahkan " + jumlahBuku + " buku ke dalam perpustakaan.");
    }
}
