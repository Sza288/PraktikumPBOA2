/* Nama File   : Data.java 
 * Deskripsi   : Kelas generik dengan atribut larik statik dan metode aksesnya
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 27 April 2026 */

public class Data<T> {
    // Atribut
    private Object[] ruang; 
    private int banyak;

    // Konstruktor
    public Data() {
        ruang = new Object[100]; 
        banyak = 0;
    }

    // Prosedur
    public void setIsi(int posisi, T objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null) {
                banyak++;
            } 
            ruang[posisi - 1] = objek;
        } else {
            System.out.println("Posisi  di luar batas");
        }
    }

    public T getIsi(int i) {
        return (T) ruang[i-1];
    }

    public int getSize() {
        return banyak;
    }
}
