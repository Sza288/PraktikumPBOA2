/*  Nama File   : Pegawai.java
 *  Deskripsi   : berisi atribut dan method dalam class Pegawai
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 9 Maret 2026 */

import java.time.LocalDate;

public class Pegawai {
    //Atribut
    protected String NIP ;
    protected String Nama ;
    protected LocalDate tglLahir, tmt;
    protected double gajiPokok;

    //Konstruktor dengan parameter
    public Pegawai(String NIP, String Nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    //Method
    public void printInfo() {
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Gaji Pokok : Rp." + gajiPokok);
    }
}