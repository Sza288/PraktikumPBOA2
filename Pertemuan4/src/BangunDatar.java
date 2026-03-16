/*  Nama File   : BangunDatar.java
 *  Deskripsi   : berisi atribut dan method dalam class BangunDatar
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 9 Maret 2026 */

public class BangunDatar {
    //Atribut
    protected int jmlsisi;
    protected String warna ;
    protected String Border ;
    protected static int counterBangunDatar = 0 ;

    //Method
    //Konstruktor tanpa parameter
    public BangunDatar(){
        counterBangunDatar++;
    }

    //Konstruktor dengan parameter
    public BangunDatar(int jmlsisi,String warna, String Border){
        this.jmlsisi = jmlsisi ;
        this.warna = warna ;
        this.Border = Border ;
        counterBangunDatar++;
    }

    //Selektor
    //Mengembalikan jumlah sisi
    public int getJmlSisi(){
        return jmlsisi ;
    }

    //Mutator
    //Mengubah jumlah sisi
    public void setJmlSisi(int jmlsisi){
        this.jmlsisi = jmlsisi ;
    }

    public String getWarna(){
        return warna ;
    }
    public void setWarna(String warna){
        this.warna = warna ;
    }

        public String getBorder(){
        return Border ;
    }
    public void setBorder(String Border){
        this.Border = Border ;
    }

    public void printInfo(){
        System.out.println("Jumlah Sisi :" + jmlsisi);
        System.out.println("Warna :" + warna);
        System.out.println("Border :" + Border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun datar :" + counterBangunDatar);
    }






}
