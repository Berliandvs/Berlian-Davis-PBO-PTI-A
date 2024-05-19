public class Main {
    public static void main(String[] args) {
        Invoice[] invoices1 = new Invoice[]{
                new Invoice("Bolpoin", 10, 5000),
                new Invoice("Buku", 5, 10000)
        };

        PermanentEmployee permanentEmployee = new PermanentEmployee(12345, "Davis", 7000000, invoices1, "Rencana Pensiun");
        System.out.println("=== Permanent Employee Details ===");
        permanentEmployee.printEmployeeDetails();
        permanentEmployee.uniqueMethod1();
        permanentEmployee.uniqueMethod2();
        permanentEmployee.abstractMethod();
        Employee.staticMethod();
        System.out.println("----------------------------------");

        Invoice[] invoices2 = new Invoice[]{
                new Invoice("Laptop", 1, 10000000),
                new Invoice("Mouse", 2, 300000)
        };

        InternEmployee internEmployee = new InternEmployee(54321, "Diva", 5000000, invoices2, "Universitas Brawijaya");
        System.out.println("=== Intern Employee Details ===");
        internEmployee.printEmployeeDetails();
        internEmployee.uniqueMethod1();
        internEmployee.uniqueMethod2();
        internEmployee.abstractMethod();
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
        Employee.staticMethod();
        System.out.println("----------------------------------");
    }
}
