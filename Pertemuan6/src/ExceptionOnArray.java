/* Nama File   : ExceptionOnArray.java 
 * Deskripsi   : Program Asersil 1
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 26 Maret 2026 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; 
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
