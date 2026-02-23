/*  Nama File   : MTitik.java
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 23 Februari 2026
 */

public class MTitik {

    public static void main(String[] args) {
        // Membuat objek titik 
        Titik T1 = new Titik(); //(0,0)
        Titik T2 = T1;
        Titik T3 = new Titik(1,7);
        T3.printTitik();

        //Object Reference
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        //Static
        System.out.println("Jumlah objek: " + Titik.getCounterTitik());
        System.out.println("Jumlah objek: " + T3.getCounterTitik());

        //TestGetKuadran
        System.out.println("Kuadran T1: " + T1.getKuadran());
        System.out.println("Kuadran T3: " + T3.getKuadran());

        //TestgetJarakPusat
        System.out.println("T3 ke pusat : " + T3.getJarakPusat());

        //TestgetJarak
        System.out.println("Jarak T1 ke T3: " + T1.getJarak(T3));

        //TestrefleksiX
        T3.refleksiX();
        System.out.print("Refleksi X : ");
        T3.printTitik();

        //TestrefleksiY
        T3.refleksiY();
        System.out.print("Refleksi Y : ");
        T3.printTitik();
        //TestgetRefleksiX
        Titik T4 = T3.getRefleksiX();
        System.out.print(" Hasil Refleksi: ");
        T4.printTitik();

        //TestgetRefleksiY
        Titik T5 = T3.getRefleksiY();
        System.out.print(" Hasil Refleksi: ");
        T5.printTitik();;

        T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T1.geser(3,4); // menggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser

     }
}