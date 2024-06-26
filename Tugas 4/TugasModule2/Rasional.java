public class Rasional {
    private int pembilang, penyebut;

    // NO 2
    // operator <
    public boolean kurangDari(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    // operator <=
    public boolean kurangDariSamaDengan(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    // operator >=
    public boolean lebihDariSamaDengan(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    // NO 4
    // operator unary += \
    public void tambah(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    // operator -
    public Rasional kurang(Rasional A) {
        int newPembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        int newPenyebut = penyebut * A.penyebut;
        Rasional result = new Rasional(newPembilang, newPenyebut);
        result.Sederhana(); // Simplify the result
        return result;
    }

    // operator *
    public Rasional perkalian(Rasional A) {
        int newPembilang = pembilang * A.pembilang;
        int newPenyebut = penyebut * A.penyebut;
        Rasional result = new Rasional(newPembilang, newPenyebut);
        result.Sederhana(); // Simplify the result
        return result;
    }

    // operator /
    public Rasional pembagian(Rasional A) {
        // Division by zero check
        if (A.pembilang == 0) {
            System.out.println("Cannot divide by zero!");
            return null;
        }
        int newPembilang = pembilang * A.penyebut;
        int newPenyebut = penyebut * A.pembilang;
        Rasional result = new Rasional(newPembilang, newPenyebut);
        result.Sederhana(); // Simplify the result
        return result;
    }

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    // mengecek suatu bilangan adalah rasional atau bukan
    public boolean isRasional() {
        return (penyebut != 0);
    }

    // NO 3
    // menyederhanakan bilangan rasional
    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        for (; B != 0; ) {
            temp = A % B;
            A = B;
            B = temp;
        }
    
        pembilang /= A;
        penyebut /= A;
    }    

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    // oprator >
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    // operator Unary- ---> A = -A
    public void negasi() {
        pembilang = -pembilang;
    }

    // operator unary += \
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
