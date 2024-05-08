public class SalariedEmployee extends Employee {
    private double weeklySalary; 

    public SalariedEmployee(String name, String noKTP, double salary, String tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings() {
        return getWeeklySalary() + getBirthdayBonus();
    }

    public String toString() {
        return String.format("Salaried employee: " +super.toString() +"\nWeekly salary: " + getWeeklySalary());
    }
}
