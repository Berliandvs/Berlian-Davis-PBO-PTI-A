public class Main {
    public static void main(String[] args) {
        
        Pegawai pegawaiTetap1 = new PegawaiTetap("Davis", "123456789", 2000000);
        Pegawai pegawaiTetap2 = new PegawaiTetap("Alex", "1111111111", 1000);
        Pegawai pegawaiTetap3 = new PegawaiTetap("Yuven", "22222222222", 4000);
        
        Pegawai pegawaiHarian1 = new PegawaiHarian("Diva", "234567890", 8500, 40);
        Pegawai pegawaiHarian2 = new PegawaiHarian("Shabrina", "2323232323", 9000, 40);
        Pegawai pegawaiHarian3 = new PegawaiHarian("Salsabila", "45454545", 8000, 50);
     
        Pegawai sales1 = new Sales("Orang Ganteng", "345678901", 50, 50000); // Upcasting
        Pegawai sales2 = new Sales("Isri", "3535353535", 70, 40000);
        Pegawai sales3 = new Sales("Apalah dia", "36363636", 90, 80000);

        System.out.println("Informasi Pegawai dan Gaji:");
        System.out.println("============================");
        System.out.println(pegawaiTetap1);
        System.out.println("\n" + pegawaiTetap2);
        System.out.println("\n" + pegawaiTetap3);
        System.out.println();
        System.out.println(pegawaiHarian1);
        System.out.println("\n" + pegawaiHarian2);
        System.out.println("\n" + pegawaiHarian3);
        System.out.println();
        System.out.println(sales1);
        System.out.println("\n" + sales2);
        System.out.println("\n" + sales3);

        if (sales1 instanceof Sales) { 
            Sales salesEmployee = (Sales) sales1; 
            System.out.println("\nUpcasting dan Downcasting:");
            System.out.println("Nama Sales: " + salesEmployee.getNama());
            System.out.println("Total Penjualan: " + salesEmployee.getPenjualan());
            System.out.println("Besaran Komisi: Rp." + salesEmployee.getKomisi());
        }
    }
}
