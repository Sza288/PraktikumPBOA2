/* Nama File   : OperatorGenerik.java 
 * Deskripsi   : Kelas dengan prosedur dan fungsi generik
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 27 April 2026 */

public class OperatorGenerik {
    // Prosedur Tukar Generik
    public <T> void Tukar(T[] array) {
        if (array.length >= 2) {
            T temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }
    }

    // Fungsi Generik Bobot2
    public <T extends Kucing> double Bobot2(T kucing1, T kucing2) {
        return kucing1.getBobot() + kucing2.getBobot();
    }
}