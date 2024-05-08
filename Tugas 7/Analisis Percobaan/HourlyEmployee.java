public class HourlyEmployee extends Employee {
    private double wage; 
    private double hours;

    public HourlyEmployee(String name, String noKTP, double hourlyWage, double hoursWorked, String tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage) {
        wage = hourlyWage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public double getHours() {
        return hours;
    }
    
    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours() + getBirthdayBonus();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5 + getBirthdayBonus();
    }

    public String toString() {
        return String.format("Hourly employee: " + super.toString() + "\nHourly wage: " + getWage() + "\nHours worked: " + getHours());
    }
}
