public class HeroIntel extends Hero {
// NO 1 kode extend digunakan untuk menurunkan kelas yang dituju dari class utama
    public String type; //NO 4

    public HeroIntel(String name, double health) {
        super(name, health);
        // NO 1 super digunakan untuk menurunkan konstruktor yang ada di dalam class utama
        this.type = "Intel";
    }

    public void display() {
        System.out.println(this.getName() + " is a " + this.type + " Hero.");
    }
}
