import java.util.Scanner;

public class Main {
    public static final Scanner input = new Scanner(System.in);
    public static final int totalPengguna = 1;
    public static User[] pengguna = new User[totalPengguna];
    public static int akunPengguna = 0;

    public static void main(String[] args) {
        int pilih;
        do {
            printMenu();
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    Login();
                    break;
                case 2:
                    SignUp();
                    break;
                case 3:
                    LogOut();
                    break;
                case 4:
                    Exit();
                    break;
                default:
                    System.out.println("Terjadi kesalahan. Tolong coba lagi!!");
            }
        } while (pilih != 4);
    }

    public static void printMenu() {
        System.out.println("======= SELAMAT DATANG DI AKADEMIK FILKOM =======");
        System.out.println("1. Login (Jika kamu sudah memiliki akun)");
        System.out.println("2. Sign Up (Untuk kamu yang belum memiliki akun)");
        System.out.println("3. Log Out");
        System.out.println("4. Exit");
        System.out.println("=================================================");
        System.out.print("SILAHKAN PILIH MENU YANG TERSEDIA : ");
    }

    public static void Login() {
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        boolean found = false;
        for (int i = 0; i < akunPengguna; i++) {
            if (pengguna[i].getUsername().equals(username) && pengguna[i].getPassword().equals(password)) {
                found = true;
                System.out.println("Login Berhasil.");
                break;
            }
        }

        if (!found) {
            System.out.println("Kesalahan username atau password. Tolong coba lagi!!");
            input.nextLine();
        }
    }

    public static void SignUp() {
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        if (akunPengguna >= totalPengguna) {
            System.out.println("Maksimal pengguna mencapai batas, coba beberapa saat lagi.");
            return;
        }

        pengguna[akunPengguna] = new User(username, password);
        akunPengguna++;
        System.out.println("Sign Up Berhasil.");
    }

    public static void LogOut() {
        System.out.println("Log Out Berhasil.");
    }

    public static void Exit() {
        System.out.println("Keluar program.");
    }
}

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
