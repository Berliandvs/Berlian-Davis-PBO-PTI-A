import java.util.Scanner;
public class swalayanTiny {

    public static void main(String[] args) {
        // Inisialisasi data pelanggan
        Customer[] customers = {
                new Customer("3812345678", "Alex", 2000000, 1234),
                new Customer("5612345678", "Isri", 5000000, 5678),
                new Customer("7412345678", "Davis", 9000000, 9012)
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor pelanggan: ");
        String customerId = scanner.nextLine();

        System.out.print("Masukkan PIN: ");
        int pin = scanner.nextInt();

        Customer customer = findCustomer(customers, customerId);

        if (customer != null && customer.verifyPin(pin)) {
            // Tampilkan informasi akun
            customer.printInfo();

            // Menu interaktif
            int choice;
            do {
                System.out.println("\nPilih operasi yang ingin Anda lakukan:");
                System.out.println("1. Top Up");
                System.out.println("2. Pembelian");
                System.out.println("3. Keluar");
                System.out.print("Pilihan Anda: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Masukkan jumlah top up: Rp");
                        double topUpAmount = scanner.nextDouble();
                        customer.topUp(topUpAmount);
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah pembelian: Rp");
                        double purchaseAmount = scanner.nextDouble();
                        customer.purchase(purchaseAmount);
                        break;
                    case 3:
                        System.out.println("Terima kasih telah menggunakan layanan kami.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                        break;
                }
            } while (choice != 3);
        } else {
            System.out.println("Autentifikasi gagal.");
        }

        scanner.close();
    }

    private static Customer findCustomer(Customer[] customers, String customerId) {
        for (Customer customer : customers) {
            if (customer.getNomorPelanggan().equals(customerId)) {
                return customer;
            }
        }
        return null; // Jika pelanggan tidak ditemukan
    }
}
