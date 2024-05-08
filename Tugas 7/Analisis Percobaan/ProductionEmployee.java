//NO 5
public class ProductionEmployee extends Employee {
    private int productionPerWeek;
    private double wagePerItem;

    public ProductionEmployee(String name, String noKTP, int jumlahProduksi, double upahBarang, String tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        setProductionPerWeek(productionPerWeek);
        setWagePerItem(wagePerItem);
    }

    public void setProductionPerWeek (int piecesProduced) {
        this.productionPerWeek = piecesProduced;
    }

    public int getProductionPerWeek () {
        return productionPerWeek;
    }
    
    public void setWagePerItem (double wagePerItem) {
        this.wagePerItem = wagePerItem;
    }

    public double getUpahBarang () {
        return wagePerItem;
    }

    public double earnings() {
        return getProductionPerWeek() * getUpahBarang() + getBirthdayBonus();
    }

    
    public String toString() {
        return String.format("Pekerja: " + super.toString() +"\nJumlah Produksi: "+ getProductionPerWeek()+ "\nUpah Barang: " + getUpahBarang());
    }
}
