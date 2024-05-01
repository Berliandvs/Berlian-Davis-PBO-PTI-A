public class Manager extends Employee {
    //claas employe superclass melakukan pewarisan ke subclassnya yaitu manager
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day); //NO2
        // NO 4 (tambah variabel bonus eror, karena variabel bonus tidak dideklrasikan di konstruktor employee yang terdapat di superclass)
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
        //NO 5 this dihilangi
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

}
