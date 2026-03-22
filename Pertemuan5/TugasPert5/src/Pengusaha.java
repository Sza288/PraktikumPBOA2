/*  Nama File   : Pengusaha.java
 *  Deskripsi   : berisi atribut dan method dalam class anstrak Pengusaha
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 20 Maret 2026  */

import java.time.LocalDate;
public class Pengusaha extends Manusia implements IPajak {
    //Attribut
    private String npwp;
    private static int counterPengusaha = 0;

    //Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan,String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    //Mutator
    public void setNpwp(String npwp) { 
        this.npwp = npwp; 
    }

    //Selektor
    public String getNpwp() { 
        return npwp; 
    }

    public static int getCounterPengusaha() { 
        return counterPengusaha; 
    }

    @Override
    public int hitungMasaKerja() {
        int B = 1; 
        return (LocalDate.now().getYear() - tgl_mulai_kerja.getYear()) + B;
    }

    @Override
    public double hitungpajak() {
        return 0.15 * pendapatan; 
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Pengusaha ===");
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
    
}
