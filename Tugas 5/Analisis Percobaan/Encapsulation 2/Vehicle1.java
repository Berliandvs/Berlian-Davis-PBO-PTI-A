public class Vehicle1 {
// NO 3 (ubah modifier menjadi public, tidak terjadi kesalahan karena kalau public masih bisa diakses di kelas lain)
// NO 4 (ubah modifier menjadi protect, tidak terjadi kesalahan karena masih bisa diakses di kelas lain)
// NO 5 (ubah modifier menjadi default/tidak ada modifier, maka tidak akan eror karena default dari suatu modifier sebenarnya ada public jadi tidak masalah)
double load, maxLoad;

    public Vehicle1(double max) {
        this.maxLoad = max;
    }

    // NO 1
    public double getLoad() {
        return this.load;
    }
    // NO 1
    public double getMaxLoad() {
        return this.maxLoad;
    }

    public boolean addBox(double weight) {
        double temp = 0.0D;
        temp = this.load + weight;
        if (temp <= maxLoad) {
            this.load = this.load + weight;
            return true;
        } else {
            return false;
        }
    }
}
