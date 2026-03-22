/*  Nama File   : Lingkaran.java
 *  Deskripsi   : berisi atribut dan method dalam class Lingkaran
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 16 Maret 2026 */

public class Lingkaran extends BangunDatar implements IResize{
    //Atribut
    private double jari;


    //Method
    //Konstruktor tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
        jari = 0 ;
    }

    //Konstruktor dengan parameter
    public Lingkaran(double jari,String Warna , String Border){
        this.jari = jari;
        setWarna(Warna);
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

    @Override 
    public void zoomIn(){
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent){
        jari = jari * percent / 100;
    }

    
}
