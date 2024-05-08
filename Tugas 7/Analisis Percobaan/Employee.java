import java.util.Calendar;

public abstract class Employee {
    private String name;
    private String noKTP;
    private String birthDate;//menambahkan atribut tanggal lahir NO 4

    public Employee(String name, String noKTP, String birthDate) {
        this.name = name;
        this.noKTP = noKTP;
        this.birthDate = birthDate; //NO4
    }

    //menambahkan method accessor tanggal lahir NO 4
    public String getBirthDate () {
        return birthDate;
    }
    
    //menambahkan method mtator tanggal lahir
    public void setBirthDate (String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String toString() {
        return String.format("" + getName() + "\nNo. KTP: " + getNoKTP()) + "\nTanggal Lahir: " + getBirthDate();
    }

    public abstract double earnings();// pendapatan

    //NO 4
    protected double getBirthdayBonus() {
        Calendar now = Calendar.getInstance();
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int birthMonth = Integer.parseInt(getBirthDate().split("-")[1]);
        return currentMonth == birthMonth ? 100000 : 0;
    }
}
