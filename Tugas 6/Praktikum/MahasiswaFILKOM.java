class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

        public double getBeasiswa() {
        if (ipk >= 3 && ipk <= 3.5) {
            return 50;
        } else if (ipk > 3.5 && ipk <= 4) {
            return 75;
        } else {
            return 0;
        }
    }

    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        String prodi = getProdi(nim.charAt(6));

        return prodi + ", " + angkatan;
    }

    private String getProdi(char prodiCode) {
        switch (prodiCode) {
            case '2':
                return "Teknik Informatika";
            case '3':
                return "Teknik Komputer";
            case '4':
                return "Sistem Informasi";
            case '6':
                return "Pendidikan Teknologi Informasi";
            case '7':
                return "Teknologi Informasi";
            default:
                return "Unknown Prodi";
        }
    }
    @Override
    public String toString() {
        return super.toString() + "\nNIM\t\t: " + nim + "\nIPK\t\t: " + ipk + "\nStatus\t\t: " + getStatus() + "\nBeasiswa\t: " + getBeasiswa();
    }
}
