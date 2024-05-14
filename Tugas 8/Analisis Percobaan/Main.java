public class Main {
    public static void main(String[] args) {
        // casting
        // double angka = 5.4;
        // int angka_int = (int)angka;
        // System.out.println(angka_int);
        // Object dengan class HeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();

        HeroMagic magicHero = new HeroMagic("Davis", 100.0, "Magic"); //membuat objek
        Hero hero = magicHero; //upcasting implisit
        hero.display();

        if (hero instanceof HeroMagic) {
            HeroMagic magicHeroLagi = (HeroMagic) hero;
            System.out.println("Power : " + magicHeroLagi.getPower());
        } else {
            System.out.println("Hero tidak instance of HeroMagic");
        }

        // // NO 4
        // HeroAgility hero4 = new HeroAgility("Davis", 200);
        // System.out.println(hero4.type);

        // upcasting
        Hero heroUp = (Hero) hero1;
        heroUp.display(); // NO 3 upcasting dari hero1
        // System.out.println(heroUp.getType()); //ini error
        // Object dgn class Hero
        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();
        // downcasting
        // HeroAgility heroDown = (HeroAgility) heroReg; //ini error
        // heroDown.display();
        // heroUp dikembalikan ke hero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display(); // ini berhasil downcasting
        //NO 3
        // HeroAgility hero3 = (HeroAgility) heroUp;
        // hero3.display();
        // Tipe Data Tidak Cocok : karena dalam downcasting objek dari tipe HeroIntel (yang ditunjuk oleh heroUp) menjadi tipe HeroAgility.
        // Namun, ini tidak mungkin dilakukan karena HeroIntel dan HeroAgility adalah subkelas yang berbeda dari kelas Hero.
        // Tidak ada hubungan turunan antara kelas HeroIntel dan HeroAgility.
    }
}
