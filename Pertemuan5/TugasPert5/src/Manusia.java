/*  Nama File   : Manusia.java
 *  Deskripsi   : berisi atribut dan method dalam class anstrak Manusia
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 20 Maret 2026  */

import java.time.LocalDate;

public abstract class Manusia {
    //Atribut
    protected String nama;
    protected LocalDate tgl_mulai_kerja; 
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    //Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    //Selektor
    public String getNama() { 
        return nama; 
    }public String getAlamat() { 
        return alamat; 
    }
     public LocalDate getTglMulaiKerja() { 
        return tgl_mulai_kerja; 
    }
     public double getPendapatan() { 
        return pendapatan; 
    }
    public static int getCounterMns() { 
        return counterMns; 
    } 

    //Mutator
    public void setNama(String nama) { 
        this.nama = nama; 
    }
     public void setTglmulaikerja(LocalDate tgl_mulai_kerja) { 
        this.tgl_mulai_kerja = tgl_mulai_kerja; 
    }
     public void setPendapatan(double pendapatan) { 
        this.pendapatan = pendapatan; 
    }
    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }

    //Method abstrak
    public abstract int hitungMasaKerja();

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }


}
