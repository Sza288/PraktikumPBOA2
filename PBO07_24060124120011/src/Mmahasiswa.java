/* Nama File    : Mmahasiswa.java 
 * Deskripsi    : Aplikasi untuk menguji kelas Mahasiswa 
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 20 April 2026 */

public class Mmahasiswa {
    public static void main(String[] args) {
        System.out.println("--- 1. Konstruktor Tanpa Parameter ---");
        Mahasiswa m1 = new Mahasiswa();
        m1.printInfo();

        System.out.println("\n--- 2. Konstruktor dengan 3 Parameter ---");
        Mahasiswa m2 = new Mahasiswa("24060124120011", "Khanza Qaila", "Informatika");
        m2.printInfo();

        System.out.println("\n--- 3. Konstruktor Kloning ---");
        Mahasiswa m3 = new Mahasiswa(m2);
        m3.printInfo();

        System.out.println("\n--- 4. Uji Overloading setProgramStudi ---");
        
        // Varian 1: Tanpa parameter
        m1.setProgramStudi();
        System.out.println("Setelah setProgramStudi():");
        System.out.println("Prodi baru: " + m1.getProgramStudi());

        // Varian 2: Satu parameter string
        m1.setProgramStudi("Sistem Komputer");
        System.out.println("Setelah setProgramStudi):");
        System.out.println("Prodi baru: " + m1.getProgramStudi());

        // Varian 3: Satu parameter objek Mahasiswa lain
        m1.setProgramStudi(m2);
        System.out.println("Setelah setProgramStudi(m2):");
        System.out.println("Prodi baru: " + m1.getProgramStudi());
    }
}