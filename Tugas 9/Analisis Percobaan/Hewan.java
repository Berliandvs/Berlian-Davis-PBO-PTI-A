public class Hewan implements MakhlukHidup, Identitas {
    //NO 5 interface Identitas dihapus maka tidak masalah, karena
    //dalam class interface Identitas berisikan method tampilkanNama dan tampilkanUmur
    //yang belum dilakukan override dengan ditandai kode program @Override
    @Override
    public void makan() {
    System.out.println("Makan pakai tangan dan mulut");
    }
    @Override
    public void berjalan() {
    System.out.println("Jalan pakai 4 kaki");
    }
    @Override
    public void bersuara() {
    System.out.println("Suaranya nggak jelas");
    }

    public void tampilkanNama (){}
   
    public void tampilkanUmur () {}

    public void tampilkanJenisKelamin () {}
   } 
