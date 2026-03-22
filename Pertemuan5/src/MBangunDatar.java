/*  Nama File   : MBangunDatar.java
 *  Deskripsi   : berisi Main untuk class BangunDatar
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 16 Maret 2026  */

public class MBangunDatar {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); //bangundatar abstract jadi ini error

        BangunDatar P1 = new Persegi(10, "Biru", "Hitam"); 
        Persegi P2 = new Persegi(5,"Merah", "Putih"); 
        BangunDatar L1 = new Lingkaran(7, "Hijau", "Hitam"); 
        Lingkaran L2 = new Lingkaran (14, "Kuning", "Hitam");

        //Menampilkan data P1
        System.out.println("=== Persegi P1 === ");
        // System.out.println("Warna : " + P1.getWarna());
        // System.out.println("Border : " + P1.getBorder());
        // System.out.println("Jumlah Sisi : " + P1.getJmlSisi());
        P1.printInfo();
        System.out.println("Luas : " + P1.getLuas());
        System.out.println("Keliling : " + P1.getKeliling());

        //Menampilkan data P2
        System.out.println("\n=== Persegi P2 === ");
        P2.printInfo();
        System.out.println("Luas : " + P2.getLuas());
        System.out.println("Keliling : " + P2.getKeliling());
        System.out.println("Sebelum zoomin:\n");
        System.out.println("Sisi : " + P2.Getsisi());
        P2.zoomIn();
        System.out.println("Setelah zoomin:");
        System.out.println("Sisi : " + P2.Getsisi());


        //Menampilkan data L1
        System.out.println("\nLingkaran L1 : ");
        L1.printInfo();
        System.out.println("Luas : " + L1.getLuas());
        System.out.println("Keliling : " + L1.getKeliling()); 

         //Menampilkan data L2
        System.out.println("\nLingkaran L2 : ");
        L2.printInfo();
        System.out.println("Luas : " + L2.getLuas());
        System.out.println("Keliling : " + L2.getKeliling()); 
        System.out.println("Sebelum zoom:\n");
        System.out.println("Sisi P2: " + L2.getjari());
        L2.zoom(150);
        System.out.println("Setelah zoom:");
        System.out.println("Sisi P2: " + L2.getjari());

        //IsEqual
        System.out.println("Apakah Luas P1 dan L1 sama? " + P1.isEqualLuas(L1));
        

        //Menampilkan counter
        BangunDatar.printCounterBangunDatar();

        
    }


}
