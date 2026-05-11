/* Nama File   : Piaraan.java 
 * Deskripsi   : Kelas koleksi piaraan
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 4 Mei 2026 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    //Atribut
    private int nbelm;
    private Queue<Anabul1> Lanabul;

    //konstruktur tanpa parameter
    public Piaraan() {
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0 ; 
    }

    //konstruktor dengan parameter
    public Piaraan(int nbelm, Queue<Anabul1> Lanabul) {
        this.Lanabul = new LinkedList<>();
        this.nbelm = nbelm;
    }

    //operator
    //mengembalikam jumlah elemen di dlm queue anabul
    public int getNbelm() {
        return this.Lanabul.size();
    }

    //tambah anabul baru ke dalam queue
    public void enqueueAnabul(Anabul1 anabul) {
        this.Lanabul.add(anabul);
        this.nbelm++;
    }

    //cek apakah anabul di dalam queue
    public boolean isMember(Anabul1 anabul) {
        return this.Lanabul.contains(anabul);
    }

    //mengambil anabul pertama dalam queue
    public Anabul1 getAnabul() {
        return this.Lanabul.peek();
    }

    //mengeluarkan anabul pertama dari queue
    public Anabul1 dequeueAnabul() { 
        if (!this.Lanabul.isEmpty()) {
            this.nbelm--;
            return this.Lanabul.poll();
        }
        return null;
    }

    //menampilkan anabul dalam queue
    public void showAnabul() {
        System.out.print("Anabul dalam antrean: ");
        for (Anabul1 ab : this.Lanabul) {
            System.out.print(ab.getNama() + " ");
        }
        System.out.println();
    }

    // menghitung jumlah kucing dalam queue anabul
    public int countKucing() {
        int count = 0;
        for (Anabul1 ab : this.Lanabul) {
            if (ab instanceof Kucing) count++;
        }
        return count;
    }

    // menghitung total bobot kucing
    public double bobotKucing() {
        double totalBobot = 0.0;
        for (Anabul1 ab : this.Lanabul) {
            if (ab instanceof Kucing){
                totalBobot += ((Kucing) ab).getBobot();
            }
        }
        return totalBobot;
    }

    //menampilkan jenis anabul
    public void showJenisAnabul() {
        System.out.println("Daftar Jenis Anabul:");
        for (Anabul1 ab : this.Lanabul) {
            if (ab != null) {
                String namaJenis = ab.getClass().getName();
                System.out.println("Nama: " + ab.getNama() + ", Jenis: " + namaJenis);
            }
        }
    }
}