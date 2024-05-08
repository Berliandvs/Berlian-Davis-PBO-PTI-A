public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;// gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary, String tanggalLahir) {
        super(name, noKTP, sales, rate, tanggalLahir);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    //modifikasi method awal
    public double earnings() {
        return getBaseSalary() + super.earnings() + getBirthdayBonus(); //ditambah untuk bonus
    }

    public String toString() {
        return String.format("Base-Salaried: " + super.toString() + "\nBase salary: " + getBaseSalary());
    }
}
