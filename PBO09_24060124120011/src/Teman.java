/* Nama File   : Teman.java 
 * Deskripsi   : Kelas koleksi teman
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 4 Mei 2026 */

import java.util.ArrayList ;
import java.util.List ;

public class Teman {
    // atribut 
    private int nbelm ;
    private List<String> Lnama;

    //konstruktor tanpa parameter
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0 ;
    }

    // konstruktor dengan parameter
    public Teman(int nbelm, List<String> Lnama) {
        this.Lnama = Lnama;
        this.nbelm = 0;
    }

    //Operator
    //mengembalikan jumlah elemen dalam list
    public int getNbelm() {
        return this.Lnama.size();
    }

    //mengembalikan nama pada posisi indeks tertentu
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < Lnama.size()) {
        return this.Lnama.get(indeks);
    } else {
        System.out.println("Indeks tidak valid!"); 
        return null;
        }
    }
    //mengubah nama pada posisi indeks tertentu dengan nama baru
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < Lnama.size()) {
        this.Lnama.set(indeks, nama);
    } else {
        System.out.println("Gagal mengubah: Indeks " + indeks + " di luar jangkauan.");
        }
    }

    //menambahkan nama baru ke dalam list
    public void addNama(String nama){
        this.Lnama.add(nama);
        this.nbelm++;
    }

    //menghapus nama dari list
    public void delNama(String nama){
        this.Lnama.remove(nama);
    }

    //cek apakah nama terdapat dalam list
    public boolean isMember(String nama) { 
        return this.Lnama.contains(nama);
    }

    //menggantikan suatu nama dalam list dengan nama baru
    public void gantiNama(String nama, String namabaru){
        int idx = this.Lnama.indexOf(nama);
        if (idx != -1){
            this.Lnama.set(idx, namabaru);
        }
    }

    //menghitung kemunculan pertama nama dalam list
    public int countNama(String nama){
        int count = 0 ;
        for ( int i = 0 ; i < getNbelm() ; i++){
            if (this.Lnama.get(i).equals(nama)) count ++ ;
        }
        return count;
    } 

    //menampilkan semua nama teman dalam list
    public void showTeman() {
        System.out.println("Daftar Teman: " + Lnama);
    }
}
