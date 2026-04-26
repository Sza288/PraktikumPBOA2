/* Nama File   : Seminar.java
 * Deskripsi   : Kelas untuk mengelola data peserta seminar 
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 25 April 2026 */

public class Seminar {
    // Atribut
    private Civitasakademika[] pesertas;
    private int banyakpeserta;

    // Konstruktor
    public Seminar() {
        this.pesertas = new Civitasakademika[100];
        this.banyakpeserta = 0;
    }

    // Method
    public void registrasi(Civitasakademika peserta) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = peserta;
            banyakpeserta++;
        } else {
            System.out.println("Kapasitas seminar sudah penuh!");
        }
    }

    public int countPeserta() {
        return banyakpeserta;
    }

    public int countMahasiswa() {
        int total = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mhs) {
                total++;
            }
        }
        return total;
    }

    public void tampilPeserta() {
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println(pesertas[i].getNomor() + " - " + pesertas[i].getNama());
        }
    }
}