/*  Nama File   : Tendik.java
 *  Deskripsi   : berisi atribut dan method dalam class Tendik
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 9 Maret 2026 */

import java.time.Period;
import java.time.LocalDate;

public class Tendik extends Pegawai {
    //Atribut
    private String bidang;

    //konstruktor dengan parameter
    public Tendik(String NIP, String Nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(NIP, Nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }
    //Method
    @Override
    public void printInfo() {
        System.out.println("=== Tendik ===");
        super.printInfo();
        System.out.println("Jabatan : Tenaga Kependidikan");
        System.out.println("Bidang : " + bidang);
        
        Period mk = Period.between(tmt, LocalDate.now());
        System.out.println("Masa Kerja : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");

        //Tgl pensiun
        LocalDate pensiun = tglLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
        System.out.println("Tanggal Pensiun : " + pensiun);

        //Tunjangan 
        double tunjangan = 0.01 * mk.getYears() * gajiPokok;
        System.out.println("Tunjangan : Rp." + tunjangan);
    }
}