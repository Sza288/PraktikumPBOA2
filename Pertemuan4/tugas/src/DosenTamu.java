/* Nama File   : DosenTamu.java 
 *  Deskripsi   : berisi atribut dan method dalam class Pegawai
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 9 Maret 2026 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    //Atribut
    private String NIDK;
    private LocalDate tglBerakhirKontrak;

    //Konstruktor dengan parameter
    public DosenTamu(String NIP, String NIDK, String Nama, LocalDate tglLahir, LocalDate tmt, String fakultas, double gajiPokok, LocalDate tglBerakhirKontrak) {
        super(NIP, Nama, tglLahir, tmt, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    //Method
    @Override
    public void printInfo() {
        System.out.println("=== Dosen Tamu ===");
        super.printInfo();
        System.out.println("NIDK : " + NIDK);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Akhir Kontrak : " + tglBerakhirKontrak);
        //Tunjangan
        double tunjangan = 0.025 * gajiPokok;
        System.out.println("Tunjangan : Rp." + tunjangan);
    }
}