/* Nama File   : Mhs.java
 * Deskripsi   : Kelas turunan Civitasakademika untuk entitas Mahasiswa
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 25 April 2026 */

public class Mhs extends Civitasakademika {
    // Atribut
    private String nim;
    private Dosen dosenwali;

    // Konstruktor
    public Mhs(String nim, String nama) {
        super(nama);
        this.nim = nim;
    }

    // Method
    public void setWali(Dosen dosenwali) {
        this.dosenwali = dosenwali;
    }

    @Override
    public String getNomor() {
        return nim;
    }

    public void tampilDataMahasiswa() {
        String namaWali = (dosenwali != null) ? dosenwali.getNama() : "Belum ada dosen wali";
        System.out.println("NIM: " + nim ); 
        System.out.println("Nama : " + nama );
        System.out.println("Dosenwali: " + namaWali);
    }
}