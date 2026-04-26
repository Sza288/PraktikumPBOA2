/* Nama File   : Asersi2.java 
 * Deskripsi   : Program Asersil 1
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 26 Maret 2026 */

class Lingkaran1  {
    //Atribut
    private double jarijari;

    public Lingkaran1(double jarijari, String string, String string2){
        this.jarijari= jarijari ;
    }
    public double hitungKeliling(){
        double keliling = 2 *Math.PI*jarijari ;
        return keliling ;
    }
}
//class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0 ; 
        assert (jarijari>0) : "jari jari tidak boleh noll" ;
        Lingkaran1 l = new Lingkaran1(jarijari, "Biru", "Hitam");
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
