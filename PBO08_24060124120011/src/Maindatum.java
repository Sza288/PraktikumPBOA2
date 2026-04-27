/* Nama File   : MainDatum.java 
 * Deskripsi   : Aplikasi Kelas Generik Datum dengan keluarga Anabul
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 27 April 2026 */

public class Maindatum {
    public static void main(String[] args) {
        // Membuat Objek
        Anggora kucingPutih = new Anggora("Salju", 4.5);
        KembangTelon kucingTigaWarna = new KembangTelon("Belang", 3.8);

        Datum<Anggora> dataAnggora = new Datum<Anggora>(); 
        dataAnggora.setIsi(kucingPutih);

        Datum<KembangTelon> dataKembang = new Datum<KembangTelon>();
        dataKembang.setIsi(kucingTigaWarna);
 
        System.out.println("=== Hasil Data Generik ===");
        System.out.println("Nama Anggora    : " + dataAnggora.getIsi().getNama());
        System.out.println("Bobot Anggora   : " + dataAnggora.getIsi().getBobot() + " kg");
        
        System.out.println("\nNama Kembang    : " + dataKembang.getIsi().getNama());
        System.out.println("Bobot Kembang   : " + dataKembang.getIsi().getBobot() + " kg");
    }
}