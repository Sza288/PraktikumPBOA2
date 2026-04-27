/* Nama File   : Datum.java 
 * Deskripsi   : Kelas Generik Datum 
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 27 April 2026 */

class Datum<T> {
    // Atribut
    private T isi;

    //Method
    public void setIsi(T isibaru) { 
        this.isi = isibaru; 
    }
    public T getIsi() { 
        return this.isi; 
    }
}