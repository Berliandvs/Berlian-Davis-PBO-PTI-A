// Class InternEmployee
public class InternEmployee extends Employee implements Contract {
    private String university;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String university) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void uniqueMethod1() {
        System.out.println("InternEmployee unique method 1.");
    }

    public void uniqueMethod2() {
        System.out.println("InternEmployee unique method 2.");
    }

    @Override
    public void abstractMethod() {
        System.out.println("Implementasi metode abstrak InternEmployee..");
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Karyawan Magang menghadiri sesi pelatihan.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Durasi kontrak pelacakan Karyawan Magang.");
    }
}
