public class PermanentEmployee extends Employee {
    private String retirementPlan;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String retirementPlan) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.retirementPlan = retirementPlan;
    }

    public String getRetirementPlan() {
        return retirementPlan;
    }

    public void setRetirementPlan(String retirementPlan) {
        this.retirementPlan = retirementPlan;
    }

    public void uniqueMethod1() {
        System.out.println("PermanentEmployee unique method 1.");
    }

    public void uniqueMethod2() {
        System.out.println("PermanentEmployee unique method 2.");
    }

    @Override
    public void abstractMethod() {
        System.out.println("PermanentEmployee implementation of abstract method.");
    }
}
