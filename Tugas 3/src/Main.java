import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda: ");
        String namaPengguna = scanner.nextLine();
        System.out.println("Selamat datang, " +namaPengguna+ " selanjutnya ada diperkenankan untuk memilih menu yang ada di tampilan");

        // Membuat objek buku
        Buku buku = new Buku();

        // Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan PTI", true, 2024, "Jl FILKOM UB");

        // Membuat objek petugasPerpustakaan
        PetugasPerpustakaan petugas = new PetugasPerpustakaan();

        // Menampilkan menu interaktif
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Data Perpustakaan");
            System.out.println("3. Lihat Data Petugas");
            System.out.println("4. Tampilkan Data Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Menambah buku
                    System.out.print("Masukkan Nama Buku: ");
                    buku.setInputNamaBuku(scanner.next());
                    System.out.print("Masukkan Jenis Buku: ");
                    buku.setInputJenisBuku(scanner.next());
                    System.out.print("Masukkan Halaman Buku: ");
                    buku.setInputHalamanBuku(scanner.next());
                    System.out.print("Apakah Buku memiliki ISBN? (true/false): ");
                    buku.setInputISBN(scanner.nextBoolean());

                    // Menyimpan dan menampilkan pesan
                    buku.simpanBuku();
                    break;

                case 2:
                    // Menampilkan data perpustakaan
                    perpustakaan.tampilkanData();

                    // System.out.println("Jenis Buku: " + buku.getJenisBuku());
                    // System.out.println("Halaman Buku: " + buku.getHalamanBuku());
                    // System.out.println("ISBN: " + buku.getISBN());
                    break;

                case 3:
                    // Menyimpan data petugas
                    // System.out.print("Masukkan Data Petugas: ");
                    // String dataPetugas = scanner.next();
                    petugas.karirPetugas();
                    break;

                case 4:
                    buku.tampilkanDataBuku();
                    break;

                case 5:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
