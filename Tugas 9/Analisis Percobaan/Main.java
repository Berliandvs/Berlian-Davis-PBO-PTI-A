import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek dari class Manusia dengan constructor

        //Manusia manusia = new Manusia("Davis", "19"); //NO6

        //NO 7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama manusia: ");
        String namaManusia = scanner.nextLine();
        System.out.print("Masukkan umur manusia:");
        String umurManusia = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin: ");
        String jenisKelaminManusia = scanner.nextLine();
        Manusia manusia = new Manusia(namaManusia, umurManusia, jenisKelaminManusia);

        manusia.tampilkanNama();
        manusia.tampilkanUmur();
        manusia.tampilkanJenisKelamin();
        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();

        //NO 7
        System.out.print("Masukkan nama hewan: ");
        String namaHewan = scanner.nextLine();
        System.out.print("Masukkan umur hewan: ");
        String umurHewan = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin hewan: ");
        String jenisKelaminHewan = scanner.nextLine();
        Hewan hewan = new Hewan() {
            @Override
            public void tampilkanNama() {
                System.out.println("Nama hewan: " + namaHewan);
            }
            @Override
            public void tampilkanUmur() {
                System.out.println("Umur hewan: " + umurHewan);
            }
            @Override
            public void tampilkanJenisKelamin() {
                System.out.println("Jenis Kelamin Hewan: " + jenisKelaminHewan);
            }
        };

        //Instansiasi objek dari class Hewan
        //Hewan hewan = new Hewan();
        hewan.tampilkanNama();
        hewan.tampilkanUmur();
        hewan.tampilkanJenisKelamin();
        hewan.makan();
        hewan.berjalan();
        hewan.bersuara();

        scanner.close();
    }
}
