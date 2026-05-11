/* Nama File    : Kucing.java 
 * Deskripsi    : Subclass untuk hewan peliharaan
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 4 Mei 2026 */

public class Kucing extends Anabul1 {
    // atribut 
    protected double bobot ;

    // konstruktor
    public Kucing(String nama,String panggilan, double bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }

    public void setBobot(double b) {
        this.bobot = b;
    }

    public double getBobot() {
        return this.bobot;
    }

    // Method Override
    @Override
    public void Gerak() {
        System.out.println(nama  + " bergerak dengan berjalan.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi meow meow.");
    }
}

class Anggora extends Kucing {
    // konstruktor
    public Anggora(String nama , String panggilan ,double bobot) {
        super(nama,panggilan, bobot);
    }

    // method override
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan berjalan.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Meow... ");
    }
}

class KembangTelon extends Kucing {
    // konstruktor
    public KembangTelon(String nama , String panggilan , double bobot) {
        super(nama, panggilan, bobot);
    }
    
    // method override
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan berjalan.");
    }

    @Override
    public void Bersuara() {
        System.out.println("Miow... ");
    }
}