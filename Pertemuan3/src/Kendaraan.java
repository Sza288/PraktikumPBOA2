/*  Nama File   : Kendaraan.java
 *  Deskripsi   : berisi atribut dan method dalam class Kendaraan
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 2 Maret 2026 */

public class Kendaraan {
    //Atribut
    private String noPlat ;
    private String jenis ;

    //Method
    //Konstruktor tanpa parameter
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    //konstruktor dgn parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis ;
    }

    //Selektor 
    public String getnoPlat(){
        return noPlat ;
    }

    public String getjenis(){
        return jenis;
    }


    //Mutator

    public void setnoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }
}
