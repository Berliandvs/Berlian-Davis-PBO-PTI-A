import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kue[] kueArray = new Kue[25]; 

        String[] namaPesanan = { "Kue Tar", "Kue Ulang Tahun", "Kue Enak", "Kue Lezat", "Kue Coklat", "Kue Bolu Kukus", "Kue Basah", "Kue Oreo", "Kue Cokelat Susu", "Kue Lapis" };
        String[] namaJadi = { "Kue Klepon", "Kue Panjang", "Kue Sus", "Kue Pie Susu", "Kue Snack", "Kue Hajatan", "Lyly Cake", "Coklat Roll", "Banana Roll", "Kue Tok" };
        String[] namaBasi = { "Kue Lumpia", "Kue Wingko", "Kue Talas", "Roti o", "Roti Boy" };

        for (int i = 0; i < kueArray.length; i++) {
            double hargaDasar = 10 + i * 0.5; 
            if (i < 10) {
                kueArray[i] = new KuePesanan(namaPesanan[i % namaPesanan.length], hargaDasar * 100, 1.0 + i * 0.1);
            } else if (i >= 10 && i < 20) {
                kueArray[i] = new KueJadi(namaJadi[(i - 10) % namaJadi.length], hargaDasar * 100, 1 + (i - 10) / 2);
            } else {
                kueArray[i] = new KueBasi(namaBasi[i - 20], hargaDasar * 100, (i % 4) + 1);
            }
        }

        int pilihan;
        do {
            System.out.println("========== MENU ==========");
            System.out.println("1. Tampilkan semua kue dan jenisnya");
            System.out.println("2. Hitung total harga semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-5): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanSemuaKue(kueArray);
                    break;
                case 2:
                    hitungTotalHargaSemuaKue(kueArray);
                    break;
                case 3:
                    hitungTotalHargaDanBeratKuePesanan(kueArray);
                    break;
                case 4:
                    hitungTotalHargaDanJumlahKueJadi(kueArray);
                    break;
                case 5:
                    tampilkanKueTerbesar(kueArray);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang sesuai.");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }

    public static void tampilkanSemuaKue(Kue[] kueArray) {
        System.out.println("===============================================");
        System.out.println("          Daftar Semua Kue dan Jenisnya        ");
        System.out.println("===============================================");
        System.out.printf("%-25s%-20s%-15s\n", "Nama Kue", "Jenis Kue", "Harga");
        System.out.println("-----------------------------------------------");
        for (Kue kue : kueArray) {
            System.out.printf("%-25s%-20s%.2f\n", kue.getNama(), kue.getClass().getSimpleName(),
                    kue.hitungHarga());
        }
        System.out.println("===============================================");
    }

    public static void hitungTotalHargaSemuaKue(Kue[] kueArray) {
        double totalHargaSemua = 0;
        for (Kue kue : kueArray) {
            totalHargaSemua += kue.hitungHarga();
        }
        System.out.println("===============================================");
        System.out.println("Total Harga Semua Kue: " + totalHargaSemua);
        System.out.println("===============================================");
    }

    public static void hitungTotalHargaDanBeratKuePesanan(Kue[] kueArray) {
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("===============================================");
        System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);
        System.out.println("===============================================");
    }

    public static void hitungTotalHargaDanJumlahKueJadi(Kue[] kueArray) {
        double totalHargaKueJadi = 0;
        int totalJumlahKueJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("===============================================");
        System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);
        System.out.println("===============================================");
    }

    public static void tampilkanKueTerbesar(Kue[] kueArray) {
        double maxHarga = Double.MIN_VALUE;
        Kue kueMaxHarga = null;
        for (Kue kue : kueArray) {
            if (kue.hitungHarga() > maxHarga) {
                maxHarga = kue.hitungHarga();
                kueMaxHarga = kue;
            }
        }
        if (kueMaxHarga != null) {
            System.out.println("===============================================");
            System.out.println("Informasi Kue dengan Harga Terbesar: " + kueMaxHarga.toString());
            System.out.println("===============================================");
        }
    }
}
