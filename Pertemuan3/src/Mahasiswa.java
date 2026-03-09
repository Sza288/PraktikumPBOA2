/*  Nama File   : Mahasiswa.java
 *  Deskripsi   : berisi atribut dan method dalam class Mahasiswa
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 2 Maret 2026 */

import java.util.ArrayList;
public class Mahasiswa {
    //Atribut
    private String nim,nama,prodi ; 
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //Method 
    //konstruktor tanpa parameter
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>() ; //Inisialisasi ArrayList kosong
    }

    //konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi, Dosen dosenWali, Kendaraan kendaraan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
        this.listMatKul = new ArrayList<>() ; //Inisialisasi ArrayList kosong
    }

    //Selektor 
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getprodi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    //Mutator 
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan (Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //Menambahkan sebuah matakuliah ke atribut listMatkul
    public void addMatKul (MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    //Mendapatkan jumlah sks 
    public int getJumlahSKS() {
        int sum = 0;
        for (MataKuliah mk : listMatKul) {
            sum = sum + mk.getSks(); 
        }
        return sum;
    }

    //Mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    //Menampilkan data dasar mahasiswa
    public void printMhs() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
    }

    //Menampilkan detail lengkap
    public void printDetailMhs() {
        System.out.println("=== DETAIL MAHASISWA ===");
        //nampilkan nama,nim,prodi mahasiswa
        printMhs();

        //nampilkan dosenwali
        System.out.print("Dosen Wali  : ");
        if (dosenWali != null) {
            System.out.println(dosenWali.getNama());
        } else {
            System.out.println("-");
        }

        //nampilkan kendaraan
        System.out.print("Kendaraan   : ");
        if (kendaraan != null) {
            System.out.println(kendaraan.getjenis()); 
        } else {
            System.out.println("-");
        }

        //nampilkan daftar matkul
        System.out.println("Daftar Mata Kuliah yang Diambil:");
        if (listMatKul.isEmpty()) {
            System.out.println(" Belum ada mata kuliah");
        } else {
            for (MataKuliah mk : listMatKul) {
                System.out.println("   - " + mk.getIdMatKul() + " : " + mk.getNama() + " (" + mk.getSks() + " SKS)");
            }
        }
    }
}
