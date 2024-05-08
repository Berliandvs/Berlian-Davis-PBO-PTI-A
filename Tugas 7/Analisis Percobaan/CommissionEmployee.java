public class CommissionEmployee extends Employee {
    private double grossSales;// penjualan per minggu
    private double commissionRate;// komisi

    public CommissionEmployee(String name, String noKTP, double sales, double rate, String tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    //Method awal
    // public double earnings() {
    //     return getCommissionRate() * getGrossSales();
    // }

    //modisikasi method awal
    public double earnings() {
        return getCommissionRate() * getGrossSales() + getBirthdayBonus();
    }

    public String toString() {
        return String.format("Commision employee: " + super.toString() + "\nGross sales: " + getGrossSales()+ "\nCommission rate: " + getCommissionRate());
    }
}
