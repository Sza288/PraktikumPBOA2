/*  Nama File   : Lingkaran.java
 *  Deskripsi   : berisi atribut dan method dalam class Lingkaran
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 9 Maret 2026 */

public class Lingkaran extends BangunDatar {
    //Atribut
    private double jari;


    //Method
    //Konstruktor tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
        jari = 0 ;
    }

    //Konstruktor dengan parameter
    public Lingkaran(double jari,String warna , String Border){
        this.jari = jari;
        setWarna(warna);
        setBorder(Border);
        setJmlSisi(1);
    }

    //Selektor 
    public double getjari(){
        return jari ;
    }

    //Mutator 
    public void setjari(double jari) {
        this.jari = jari ;
    }

    public double getKeliling(){
        return 2 *  Math.PI * jari;
    }

    public double getLuas(){
        return Math.PI * jari * jari ;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari :" + jari);
    }

    
}
