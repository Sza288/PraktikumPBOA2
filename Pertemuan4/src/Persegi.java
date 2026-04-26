/*  Nama File   : Persegi.java
 *  Deskripsi   : berisi atribut dan method dalam class Persegi
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 9 Maret 2026 */

public class Persegi extends BangunDatar {
    //Atribut
    private double sisi ;
    
    //Method
    //Konstruktor tanpa parameter
    public Persegi(){
        setJmlSisi(4);
    }

    //Konstruktor dengan parameter guna super 
    // public Persegi(double sisi, String warna, String Border){
    //     super(4,warna,Border) ;
    //     this.sisi = sisi ;    
    // }

    public Persegi(double sisi, String warna, String Border){
        this.jmlsisi = 4 ;
        this.warna = warna ;
        this.Border = Border ;
        this.sisi = sisi ;    
    }

    //Selektor
    public double getsisi(){
        return sisi ;
    }

    //Mutator
    public void setSisi(double sisi) {
        this.sisi = sisi ;
    }

    public double getLuas(){
        return sisi * sisi ;
    }

    public double getKeliling(){
        return 4 * sisi ;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    //Override tanpa menggunakan super
    // @Override
    // public void printInfo(){
    //     System.out.println("Jmlah sisi :" + getJmlSisi());
    //     System.out.println("Warna" + getWarna());
    //     System.out.println("Border :" + getBorder()) ;
    //     System.out.println("Sisi :" + sisi);
    // }

    //Override dengan super
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi :" + sisi);
    }

}
