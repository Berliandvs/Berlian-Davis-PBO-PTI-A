import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Perpustakaan library = new Perpustakaan();
        library.readFromFile("C:\\BELAJAR CODE\\Punya davis\\src\\Perpustakaan_data.txt"); // Sesuaikan dengan path lengkap file library_data.txt

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Perpustakaan");

        while (true) {
            System.out.println("MENU:");
            System.out.println("1. Tambah buku");
            System.out.println("2. Tampilkan Buku dalam Kategori");
            System.out.println("3. Tulis Data ke File");
            System.out.println("4. Baca Data dari File");
            System.out.println("5. Keluar");
            System.out.print("Menu yang anda pilih adalah : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Masukkan judul buku:");
                    String title = scanner.nextLine();

                    System.out.println("Masukkan penulis (dipisahkan koma):");
                    String[] authors = scanner.nextLine().split(", ");
                    System.out.println("Masukkan nama kategori:");
                    String categoryName = scanner.nextLine();
                    library.tambahBukuKategori(categoryName, new Buku(title, Arrays.asList(authors)));
                    break;
                case 2:
                    System.out.println("Masukkan nama kategori:");
                    categoryName = scanner.nextLine();
                    library.displayBooksInCategory(categoryName);
                    break;
                case 3:
                    System.out.println("Masukkan nama file untuk disimpan:");
                    String saveFileName = scanner.nextLine();
                    library.writeToFile(saveFileName);
                    break;
                case 4:
                    System.out.println("Masukkan nama file yang akan dimuat:");
                    String loadFileName = scanner.nextLine();
                    library.readFromFile(loadFileName);
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
