/* Nama File    : Anabul1.java 
 * Deskripsi    : Superclass untuk hewan peliharaan
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 4 Mei 2026 */

public class Anabul1 {
    // Atribut
    protected String nama; 
    // atribut tambahan
    protected String panggilan ;

    // Konstruktor
    public Anabul1(String nama, String panggilan) {
        this.nama = nama;
        this.panggilan = panggilan ;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

     public void setPanggilan(String panggilan) {
        this.panggilan = panggilan ;
    }

    public String getPanggilan() {
        return this.panggilan;
    }


    // Method
    public void Gerak() {
        System.out.println(nama + " bergerak...");
    }

    public void Bersuara() {
        System.out.println(nama + " bersuara...");
    }
}