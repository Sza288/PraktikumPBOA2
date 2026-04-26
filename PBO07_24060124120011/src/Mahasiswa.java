/* Nama File   : Mahasiswa.java 
 * Deskripsi   : Program kelas Mahasiswa dengan Overloading Method dan Konstruktor
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 20 April 2026 */

public class Mahasiswa {
    // Atribut
    private String NIM;
    private String Nama;
    private String Programstudi;

    // Method 
    public String getNIM() {
        return this.NIM;
    }

    public String getNama() {
        return this.Nama;
    }

    public String getProgramStudi() {
        return this.Programstudi;
    }

    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    public void setProgramStudi(String prodi) {
        this.Programstudi = prodi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.Programstudi = m.Programstudi;
    } 

    // c. Konstruktor Tanpa Parameter 
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    // d. Konstruktor dengan 3 Parameter
    public Mahasiswa(String NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // e. Konstruktor dengan Parameter Objek Mahasiswa
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }
    
    public void printInfo() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Prodi: " + Programstudi);
    }

   
}