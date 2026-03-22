/*  Nama File   : PNS.java
 *  Deskripsi   : berisi atribut dan method dalam class anstrak PNS
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 20 Maret 2026  */

import java.time.LocalDate;
public class PNS extends Manusia implements IPajak {
    //Attribut
    private String nip;
    private static int counterPNS = 0;

    //Konstruktor dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan,String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    //Mutator
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    //Selektor
    public String getNip() { 
        return nip; 
    }

    public static int getCounterPNS() { return counterPNS; }

    @Override
    public int hitungMasaKerja() {
        int A = 1; 
        return (LocalDate.now().getYear() - tgl_mulai_kerja.getYear()) + A;
    }

    @Override
    public double hitungpajak() {
        return 0.10 * pendapatan; 
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== PNS ===");
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
    
}
