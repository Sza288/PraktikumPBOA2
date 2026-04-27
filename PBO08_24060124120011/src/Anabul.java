/* Nama File    : Anabul.java 
 * Deskripsi    : Superclass untuk hewan peliharaan
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 27 April 2026 */

public class Anabul {
    // Atribut
    protected String nama; 

    // Konstruktor
    public Anabul(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    // Method
    public void Gerak() {
        System.out.println(nama + " bergerak...");
    }

    public void Bersuara() {
        System.out.println(nama + " bersuara...");
    }
}