/* Nama File    : Burung.java 
 * Deskripsi    : Subclass untuk hewan peliharaan
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 25 April 2026 */

public class Burung extends Anabul {
    // konstruktor
    public Burung(String nama) {
        super(nama);
    }
    
    // Method override
    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " berbunyi cuit cuit ");
    }
}
