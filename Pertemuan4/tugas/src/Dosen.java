/*  Nama File   : Dosen.java
 *  Deskripsi   : berisi atribut dan method dalam class Dosen
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 9 Maret 2026 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    //Atribut
    protected String fakultas;

    //Method
    public Dosen(String NIP, String Nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(NIP, Nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
}
