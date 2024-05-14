public class Hero {
    private String name;
    private double health;

    Hero(String name, double health) {
        this.name = name;
        this.health = health;
        // NO 2 this digunakan untuk merujuk pada variabel instan
        // name dan health dari objek yang sedang dibuat.
        // Hal ini membantu membedakan antara parameter konstruktor (name dan health)
        // dan variabel instan kelas (this.name dan this.health) yang memiliki nama yang sama.
        // Ini memastikan bahwa nilai dari parameter konstruktor diatribusikan ke variabel instan kelas yang benar.
    }

    // getter
    // NO 2 Getter digunakan untuk mendapatkan nilai dari
    // suatu atribut dalam sebuah objek. Dalam getter,
    // this juga dapat digunakan untuk merujuk pada objek yang sedang diproses.
    public double getHealth() {
        return this.health;
        // NO 2 Keyword this dalam konteks constructor, setter, dan getter
        // digunakan untuk merujuk pada instance atau objek saat ini
        // yang sedang diproses dalam sebuah kelas. Penggunaan this membantu membedakan
        // antara variabel lokal dan variabel kelas yang memiliki nama yang sama
    }

    public String getName() {
        return this.name;
    }

    // setter
    // NO 2 setter digunakan untuk mengatur nilai dari
    // suatu atribut dalam sebuah objek.
    // Dalam setter, this digunakan untuk merujuk pada objek
    // yang sedang diproses. Ini membantu menghindari ambigu antara
    // parameter setter dan variabel kelas dengan nama yang sama.
    public void setName(String name) {
        this.name = name;
        // NO 2 
    }

    public void setHealth(double health) {
        this.health = health;
    }

    // method umum
    public void display() {
        System.out.println(this.name + " is a regular hero.");
    }
}
