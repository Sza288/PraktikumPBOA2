/* Nama File   : MOperator.java 
 * Deskripsi   : Aplikasi untuk prosedur Tukar dan fungsi Bobot2
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 27 April 2026 */

public class MOperator {
    public static void main(String[] args) {
        OperatorGenerik op = new OperatorGenerik();

        // Sesama Integer
        Integer[] num = {3, 6};
        System.out.println("Sebelum Tukar : " + num[0] + ", " + num[1]);
        op.Tukar(num);
        System.out.println("Sesudah Tukar : " + num[0] + ", " + num[1]);

        // Sesama String
        String[] s = {"Khanza", "Gigi"};
        System.out.println("\nSebelum Tukar: " + s[0] + ", " + s[1]);
        op.Tukar(s);
        System.out.println("Sesudah Tukar: " + s[0] + ", " + s[1]);

        // Sesama Keluarga Anabul
        Anggora a = new Anggora("Wiwi", 3.5);
        KembangTelon k = new KembangTelon("Kibom", 4.0);
        Kucing[] kucingArray = {a, k};

        System.out.println("\nSebelum Tukar: " + kucingArray[0].getNama() + ", " + kucingArray[1].getNama());
        op.Tukar(kucingArray);
        System.out.println("Sesudah Tukar: " + kucingArray[0].getNama() + ", " + kucingArray[1].getNama());

        // Fungsi Bobot2
        double totalBobot = op.Bobot2(a, k);
        System.out.println("\n--- Hasil Fungsi Bobot2 ---");
        System.out.println("Total bobot " + a.getNama() + " dan " + k.getNama() + " adalah: " + totalBobot);
    }
}