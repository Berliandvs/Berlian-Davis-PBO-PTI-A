import java.util.Scanner;

class Customer {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private int pin;
    private int transaksigagal;
    private String accountType;
    private boolean sudahBeli;
    private double totalPembelianSebelumnya;

    public Customer(String nomorPelanggan, String nama, double saldo, int pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.transaksigagal = 0;
        this.accountType = nomorPelanggan.substring(0, 2); //mengambil dua digit pertama dari nomor pelanggan
        this.sudahBeli = false;
        this.totalPembelianSebelumnya = 0;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public String fetAccountType() {
        return accountType;
    }

    public boolean verifyPin(int pin) {
        for (int percobaan = 1; percobaan <= 3; percobaan++){
            if (this.pin == pin) {
                transaksigagal = 0; // Reset failed attempts if PIN is correct
                return true;
            } else {
                transaksigagal++;
                if (transaksigagal >= 3) {
                    System.out.println("Akun Anda telah diblokir/defreeze karena 3x kesalahan dalam autentifikasi.");
                    System.exit(0); // Keluar dari program jika melebihi percobaan batas gagal
                } else {
                    System.out.println("PIN salah. Silakan coba lagi. Percobaan gagal: " + transaksigagal);
                    System.out.print("Masukkan PIN : ");
                    Scanner input = new Scanner(System.in);
                    pin = input.nextInt();
                }
            }
        }
        return false;
    }

    public void topUp(double jumlahTopUp) {
        saldo += jumlahTopUp;
        System.out.println("Top up berhasil. Saldo sekarang: Rp" + saldo);
    }

    public boolean purchase(double jumlahBeli) {
        double cashback = 0;
        double uang = 0;
        if (saldo - jumlahBeli >= 10_000) {
            saldo -= (jumlahBeli - totalPembelianSebelumnya);
            System.out.println("Pembelian berhasil.");
            if (!sudahBeli && jumlahBeli > 1_000_000) { // Cek apakah ini pembelian pertama kali dan jumlahnya di atas 1 juta
                switch (accountType) {
                    case "38":
                        cashback = jumlahBeli * 0.05;
                        uang = cashback;
                        break;
                    case "56":
                        cashback = jumlahBeli * 0.07;
                        uang = jumlahBeli * 0.02;
                        saldo += uang;
                        break;
                    case "74":
                        cashback = jumlahBeli * 0.1;
                        uang = jumlahBeli * 0.5;
                        saldo += uang;
                        break;
                }
                sudahBeli = true; //Set flag bahwa sudah melakukan pembelian pertama
            } else if (sudahBeli && jumlahBeli > 1_000_000) { // Jika sudah melakukan pembelian sebelumnya, kurangi saldo dengan jumlah pembelian sebelumnya
              saldo -= (jumlahBeli - totalPembelianSebelumnya);
            }
            System.out.println("Saldo sekarang: Rp" + String.format("%.2f", saldo));
            
            System.out.println("Anda mendapat cashback sebesar Rp" + cashback);

            return true;
        } else {
            System.out.println("Saldo tidak mencukupi untuk melakukan pembelian.");
            return false;
        }
    }

    public void printInfo() {
        System.out.println("Informasi Akun:");
        System.out.println("Nomor Pelanggan: " + nomorPelanggan);
        System.out.println("Nama: " + nama);
        System.out.println("Saldo: Rp" + saldo);
    }
}
