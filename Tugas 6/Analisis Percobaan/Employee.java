import java.util.*;

public class Employee {
    private String name;
    private double salary;
    private Date hireday;
    //NO 7 akses modifier protected digunakan untuk menghindari modifikasi lain, tapi masih bisa dipanggil di subclassnya walaupun beda package yang sesuai dengan pengimplementasian enheritance penggunaan superclass subclass
    //jika modifier diubah ke privat maka tidak bisa dikases oleh kelas lain dengan menggunakan konsep enkapsulasi maupun enheritance
    //jika modifier diubah ke public maka bisa diakses oleh kelas lain
    //NO 8 ubah ke private dan protected
    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireday = calendar.getTime();
        //NO 5 hapus this maka nilanya null, karena nilai yang ada di main employe tidak dipanggil, yang sebenarnya fungsi dari this menginisialisasi nilai yang ada pada objek
    }

    public Date getHireDay() {
        return hireday;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    //NO 3
    //tidak ada pengaruh ke class manager atau sub classnya, karena yang diwariskan ke subclass manager adalah konstruktor employee yang atas sehingga tidak terjadi pemanggilan
    public Employee(String name) {
        this.name = name;
    }
    // NO 6
    // public Employee(String name) {
    //     this.name = name;
    // }
}
