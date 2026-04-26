/* Nama File    : Anabul.java 
 * Deskripsi    : Superclass untuk hewan peliharaan
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 25 April 2026 */

public class Anabul {
    // Atribut
    protected String nama; 

    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Method
    public void Gerak() {
        System.out.println(nama + " bergerak...");
    }

    public void Bersuara() {
        System.out.println(nama + " bersuara...");
    }
}