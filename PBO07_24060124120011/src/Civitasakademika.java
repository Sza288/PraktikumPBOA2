/* Nama File   : Civitasakademika.java
 * Deskripsi   : Superclass untuk Civitas Akademika
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 25 April 2026 */

public abstract class Civitasakademika {
    // atribut
    protected String nama;

    // konstruktor
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    // method
    public String getNama() {
        return nama;
    }

    public abstract String getNomor();
}