public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

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

    public double earnings() {
        return getCommissionRate() * getGrossSales() + getBirthdayBonus();
    }

    public String toString() {
        return String.format("Commision employee: " + super.toString() + "\nGross sales: " + getGrossSales()+ "\nCommission rate: " + getCommissionRate());
    }
}
