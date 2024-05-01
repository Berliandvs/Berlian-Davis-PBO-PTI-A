import java.time.LocalDate;
public class Main { 
    public static void main(String[] args) {
        // Manusia
        Manusia lakiLakiMenikah = new Manusia("John", true, "1234567890", true);
        Manusia perempuanMenikah = new Manusia("Jane", false, "9876543210", true);
        Manusia belumMenikah = new Manusia("Bob", true, "1111111111", false);
        System.out.print("Manusia :");
        System.out.println(lakiLakiMenikah.toString());
        System.out.println(perempuanMenikah.toString());
        System.out.println(belumMenikah.toString());

        // MahasiswaFILKOM
        MahasiswaFILKOM ipkKurangDari3 = new MahasiswaFILKOM("Alice", true, "2222222222", false, "123456789", 2.5);
        MahasiswaFILKOM ipk3_3_5 = new MahasiswaFILKOM("Bob", true, "3333333333", false, "234567290", 3.2);
        MahasiswaFILKOM ipk3_5_4 = new MahasiswaFILKOM("Charlie", true, "4444444444", false, "345678601", 3.8);
        System.out.print("\nMahasiswa FILKOM :");
        System.out.println(ipkKurangDari3.toString());
        System.out.println(ipk3_3_5.toString());
        System.out.println(ipk3_5_4.toString());
    
        // Pekerja
        Pekerja pekerja2Tahun = new Pekerja("David", true, "5555555555", false, 500000, LocalDate.of(2020, 1, 1), 2);
        Pekerja pekerja9Tahun = new Pekerja("Eve", false, "6666666666", false, 750000, LocalDate.of(2013, 1, 1), 0);
        Pekerja pekerja20Tahun = new Pekerja("Frank", true, "7777777777", true, 1000000, LocalDate.of(2004, 1, 1), 10);
        System.out.print("\nPekerja :");
        System.out.println(pekerja2Tahun.toString());
        System.out.println(pekerja9Tahun.toString());
        System.out.println(pekerja20Tahun.toString());
    
        // Manager
        Manager manager15Tahun = new Manager("Mike", true, "8888888888", false, 7500, LocalDate.of(2009, 1, 1), 0, "IT");
        System.out.print("\nManager :");
        System.out.println(manager15Tahun.toString());
    }
}
