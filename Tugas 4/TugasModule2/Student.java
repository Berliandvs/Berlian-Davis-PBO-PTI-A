public class Student {
    private String name; 
    private String address; 
    private int age;
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 

    // No. 1, dari awal nama main student() diubah menjadi Student()
    public Student(){
        name = ""; 
        address = ""; 
        age = 0;
        // No. 5
        jumlahObjek++;
    }
    public Student(String n, String a, int ag){ 
        name = n;
        address = a; 
        age = ag;
        // No. 5
        jumlahObjek++;
    }
    // No. 2 
    public Student(int math, int english, int science) {
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        // No. 5
        jumlahObjek++;
    }

    // No. 3
    public boolean statusAkhir() {
        if (this.getAverage() >= 61) {
            System.out.println("Keputusan : YEAYYY Selamat Kamu Menuntaskan Mata Pelajaran");
            return true;
        } else {
            System.out.println("Keputusan : Sayang sekali, kamu harus remidi");
            return false;
        }
    }

    // No. 5
    private static int jumlahObjek = 0;

    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){ 
        address = a;
    }
    public void setAge(int ag){ 
        age = ag;
    }
    public void setMath(int math){ 
        mathGrade = math;
    }
    public void setEnglish(int english){ 
        englishGrade = english;
    }
    public void setScience(int science){ 
        scienceGrade = science;
    }
    private double getAverage(){ 
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }

    // No. 5
    public static void jumlahObjek() {
        System.out.println("Anda memanggil objek sebanyak "+jumlahObjek);
    }
    
    public void displayMessage(){ 
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beralamat di "+address); 
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata-rata " + getAverage());
        // No. 3
        statusAkhir();
    }
}
