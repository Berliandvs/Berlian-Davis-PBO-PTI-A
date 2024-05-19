public abstract class Employee implements Payable {
    private int registrationNumber;
    private String nama;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String nama, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.nama = nama;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public int getPayableAmount() {
        int totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee");
        System.out.println("{Nomor Registrasi = " + registrationNumber + " Nama = " + nama + " Gaji Per Bulan = " + salaryPerMonth + " Jumlah Hutang = " + getPayableAmount() + "}");
        System.out.println("Invoice Details:");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }

    public int calculateYearlySalary() {
        return salaryPerMonth * 12;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public static void staticMethod() {
        System.out.println("This is a static method in Employee class.");
    }

    public abstract void abstractMethod();
}
