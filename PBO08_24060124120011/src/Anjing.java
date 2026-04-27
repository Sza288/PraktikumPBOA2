/* Nama File    : Anjing.java 
 * Deskripsi    : Subclass untuk hewan peliharaan
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 27 April 2026 */

public class Anjing extends Anabul {
    // konstruktor
    public Anjing(String nama) {
        super(nama);
    }
    
    //Method Override
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan berlari.");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara woof woof");
    }
}