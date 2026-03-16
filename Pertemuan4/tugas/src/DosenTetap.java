/*  Nama File   : DosenTetap.java
 *  Deskripsi   : berisi atribut dan method dalam class Dosen Tetap
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 9 Maret 2026 */

import java.time.Period;
import java.time.LocalDate;

public class DosenTetap extends Dosen {
    //Atribut
    private String NIDN;

    //Konstruktor dengan parameter
    public DosenTetap(String NIP, String NIDN, String Nama, LocalDate tglLahir, LocalDate tmt, String fakultas, double gajiPokok) {
        super(NIP, Nama, tglLahir, tmt, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    //Method
    @Override
    public void printInfo() {
        System.out.println("=== Dosen Tetap ===");
        System.out.println("NIP : " + NIP);
        System.out.println("NIDN : " + NIDN); 
        System.out.println("Nama : " + Nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Jabatan : Dosen Tetap");
        System.out.println("Fakultas : " + fakultas);
        
        //Masa Kerja
        Period mk = Period.between(tmt, LocalDate.now());
        System.out.println("Masa Kerja : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");

        //Pensiun
        LocalDate pensiun = tglLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
        System.out.println("Tanggal Pensiun : " + pensiun);

        //Gaji Pokok
        System.out.println("Gaji Pokok : Rp." + gajiPokok);

        //Tunjangan
        double tunjangan = 0.02 * mk.getYears() * gajiPokok;
        System.out.println("Tunjangan : Rp." + tunjangan);
    }
}
