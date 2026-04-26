/* Nama File    : MainAnabul.java 
 * Deskripsi    : Main program untuk menguji kelas Anabul dan subclassnya dengan konsep Polimorfisme
 * Pembuat      : Khanza Qaila/24060124120011
 * Tanggal      : 25 April 2026 */

public class MainAnabul {
    public static void main(String[] args) {
        Anabul myKucing = new Kucing("Mubarok");
        Anabul myAnjing = new Anjing("Happy");
        Anabul myBurung = new Burung("Cici");
        
        myKucing.Gerak();
        myKucing.Bersuara();
        System.out.println("\n");

        myAnjing.Gerak();
        myAnjing.Bersuara();
        System.out.println("\n");

        myBurung.Gerak();
        myBurung.Bersuara();
    }
}