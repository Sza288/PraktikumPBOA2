/* Nama File   : MKendaraan.java
 * Deskripsi   : Main program untuk menguji class Kendaraan
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 2 Maret 2026 */

public class MKendaraan {
    public MKendaraan(){
    }

     public static void main(String[] args) {
    //Buat Objek menggunakan konstruktor parameter
    Kendaraan K1 = new Kendaraan("AB1234XL" , "Motor") ;

    //Buat Objek menggunakan konstruktur tanpa parameter
    Kendaraan K2 = new Kendaraan();

     K2.setjenis("Motor");
     K2.setnoPlat("AG1236L");
     System.out.println(K2.getjenis());
     System.out.println(K2.getnoPlat());
     System.out.println("K1 : " + K1.getnoPlat() + "," + K1.getjenis());
     }

}
