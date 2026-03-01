/*  Nama File   : MGaris.java
 *  Deskripsi   : berisi atribut dan method dalam class Garis
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 25 Februari 2026 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Titik
        Titik T1 = new Titik(1, 0);
        Titik T2 = new Titik(2, -2);
        Titik T3 = new Titik(0, 5);
        Titik T4 = new Titik(3, 1);

        // Membuat objek Garis
        Garis L1 = new Garis(T1, T2); 
        Garis L2 = new Garis(T3, T4); 

        System.out.println("Jumlah Garis : " + Garis.getCounterGaris());
        System.out.println("\nGaris 1");
        L1.printGaris();
        System.out.println("Panjang : " + L1.getPanjang());
        System.out.println("Gradien : " + L1.getGradien());
        System.out.println("Titik Tengah : (" 
        + L1.getTitikTengah().getAbsis() + ", " + L1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis : ") ;
        L1.printPersamaanGaris();
        System.out.println("\nGaris 2 ");
        L2.printGaris();
        System.out.println("Panjang : " + L2.getPanjang());
        System.out.println("Gradien : " + L2.getGradien());
        System.out.println("Titik tengah : (" + L2.getTitikTengah().getAbsis() + ", " + L2.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis :" );
        L2.printPersamaanGaris();
      
        System.out.println("Apakah sejajar antar L1 dan L2 ? " + L1.isSejajar(L2));
        System.out.println("Apakah tegak lurus antar L1 dan L2 ? " +L1.isTegakLurus(L2));

    }
}
