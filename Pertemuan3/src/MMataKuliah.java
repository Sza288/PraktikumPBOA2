/* Nama File   : MMataKuliah.java
 * Deskripsi   : Main program untuk menguji class MataKuliah
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 2 Maret 2026 */

public class MMataKuliah {
    public static void main(String[] args) {
        // buat objek MK2 menggunakan konstruktor dengan parameter
        MataKuliah mk1 = new MataKuliah("SD5678", "Struktur Data", 4);

        // buat objek menggunakan konstruktor tanpa parameter
        MataKuliah mk2 = new MataKuliah();
        mk2.setidMatKul("SASMA123");
        mk2.setNama("Sastra Mandarin");
        mk2.setSks(3);

        //Menampilkan data mk1
        System.out.println("id MatKul : " + mk1.getIdMatKul());
        System.out.println("Nama : " + mk1.getNama());
        System.out.println("SKS : " + mk1.getSks());

        //Menampilkan data mk2
        System.out.println("\n");
        System.out.println("id MatKul : " + mk2.getIdMatKul());
        System.out.println("Nama : " + mk2.getNama());
        System.out.println("SKS : " + mk2.getSks());   
    }
}
