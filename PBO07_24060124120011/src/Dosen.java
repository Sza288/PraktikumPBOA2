/* Nama File   : Dosen.java
 * Deskripsi   : Kelas turunan Civitasakademika untuk entitas Dosen
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 25 April 2026 */

public class Dosen extends Civitasakademika {
    // Atribut
    private String nip;

    // Konstruktor
    public Dosen(String nip, String nama) {
        super(nama);
        this.nip = nip;
    }

    // Method
    public String getNip() {
        return nip;
    }

    @Override
    public String getNomor() {
        return nip;
    }
}