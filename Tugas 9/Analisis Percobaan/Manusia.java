public class Manusia implements MakhlukHidup, Identitas {
// NO 3, memungkinkan untuk melakukan implementasi dari jumlah class interface
// lebih dari satu, contohnya class manusia ini dengan alasan karena memberikan fleksibelitas
// dan pemisahan tanggung jawab dari suatu implementasi di class interface yang berbeda
    private String nama;
    private String umur;
    private String jenisKelamin;

    // Manusia manusia = new Manusia();
    // Identitas identitas = new Identitas();
    // NO 2 jika bukan interface class maka tetap bisa dijalankan,
    // tetapi jika class interface tidak bisa dijalankan karena interface
    // tidak memiliki implementasi
   
    public Manusia(String nama, String umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    } // NO 6

    @Override
    public void makan() {
    System.out.println("Makan pakai sendok garpu");}
    @Override
    public void berjalan() {
    System.out.println("Jalan pakai dua kaki");}
    @Override
    public void bersuara() {
    System.out.println("Suaranya merdu");}
    @Override
    public void tampilkanNama() {
    System.out.println("Nama saya: " + this.nama);}
    @Override
    public void tampilkanUmur() {
    System.out.println("Umur saya: " + this.umur);}
    @Override
    public void tampilkanJenisKelamin() {
    System.out.println("Jenis kelamin saya: " + this.jenisKelamin);}
   }
