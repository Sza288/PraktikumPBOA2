/*  Nama File   : Petani.java
 *  Deskripsi   : berisi atribut dan method dalam class anstrak Petani
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 20 Maret 2026  */

import java.time.LocalDate;
public class Petani extends Manusia implements IPajak {
    //Attribut
    private String asal_kota;
    private static int counterPetani = 0;

    //Konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan,String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    //Mutator
    public void setAsalkota(String asal_kota) { 
        this.asal_kota = asal_kota; 
    }

    //Selektor
    public String getAsalkota() { 
        return asal_kota; 
    }

    public static int getCounterPetani() { 
        return counterPetani; 
    }

    @Override
    public int hitungMasaKerja() {
        int C = 0; 
        return (LocalDate.now().getYear() - tgl_mulai_kerja.getYear()) + C;
    }

    @Override
    public double hitungpajak() {
        return 0; 
    }

    @Override
    public void cetakInfo() {
        System.out.println("=== Petani===");
        super.cetakInfo();
        System.out.println("Asal: " + asal_kota);
    }
    
}
