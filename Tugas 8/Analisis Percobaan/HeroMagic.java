public class HeroMagic extends Hero {
    private String power;

    public HeroMagic(String name, double health, String power) {
        super(name, health);
        this.power = power;
    }

    public String getPower() {
        return this.power;
    }
    
    @Override
    public void display() {
        System.out.println(this.getName() + " Magic");
    }
}
