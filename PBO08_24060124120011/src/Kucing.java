/* Nama File    : Kucing.java 
 * Deskripsi    : Subclass untuk hewan peliharaan
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 25 April 2026 */

public class Kucing extends Anabul {
    // atribut 
    protected double bobot ;

    // konstruktor
    public Kucing(String nama, double bobot) {
        super(nama);
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
    public Anggora(String nama ,double bobot) {
        super(nama, bobot);
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
    public KembangTelon(String nama ,double bobot) {
        super(nama, bobot);
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