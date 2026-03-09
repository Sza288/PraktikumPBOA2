/* Nama File   : MDosen.java
 * Deskripsi   : Main program untuk menguji class Dosen
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 2 Maret 2026 */

public class MDosen {
    public static void main(String[] args) {
        //Menggunakan konstruktor tanpa parameter
        Dosen D1 = new Dosen();
        D1.setNip("12345");
        D1.setNama("Dr. Sunarsih");
        D1.setProdi("Informatika");

        //Menggunakan konstruktor dengan parameter
        Dosen D2 = new Dosen("67891", "Dr. Khanza", "Sastra Mandarin");

        //Menampilkan data D1
        System.out.println("NIP   : " + D1.getNip());
        System.out.println("Nama  : " + D1.getNama());
        System.out.println("Prodi : " + D1.getProdi());

        // Menampilkan data D2
        System.out.println("\n");
        System.out.println("NIP   : " + D2.getNip());
        System.out.println("Nama  : " + D2.getNama());
        System.out.println("Prodi : " + D2.getProdi());
    }
}