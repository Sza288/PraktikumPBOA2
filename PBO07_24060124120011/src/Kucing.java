/* Nama File    : Kucing.java 
 * Deskripsi    : Subclass untuk hewan peliharaan
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 25 April 2026 */

public class Kucing extends Anabul {
    // konstruktor
    public Kucing(String nama) {
        super(nama);
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