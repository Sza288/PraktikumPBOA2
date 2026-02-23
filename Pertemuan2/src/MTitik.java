/*  Nama File   : MTitik.java
 *  Deskripsi   : berisi atribut dan method dalam class Titik
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 23 Februari 2026
 */

public class MTitik {

    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        Titik T2 = new Titik(1,7);
        T2.printTitik();

        System.out.println("Jumlah objek: " + Titik.getCounterTitik());
        System.out.println("Jumlah objek: " + T2.getCounterTitik());
        System.out.println("Kuadran T2: " + T2.getKuadran());

        T1.setAbsis(3); // Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // mencetak koordinat T1 ke layar
        T1.geser(3,4); // menggeser T1 sejauh (3,4)
        T1.printTitik(); // menampilkan koordinat T1 setelah digeser



    //     T2.printTitik();
    //     T1.setAbsis(10);
    //     T1.setOrdinat(10);
    //     T2.printTitik();
     }
}