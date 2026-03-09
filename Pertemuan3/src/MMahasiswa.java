/* Nama File   : MMahasiswa.java
 * Deskripsi   : Main program untuk menguji class Mahasiswa
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 2 Maret 2026 */

public class MMahasiswa {
    public static void main(String[] args) {
        //buat objek Dosen
        Dosen dosen1 = new Dosen("12345", "Dr. Sunarsih", "Informatika");

        //buat objek Kendaraan
        Kendaraan k1 = new Kendaraan("H 1234 AB", "Motor");

        //buat objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("24060124", "Khanza Qaila", "Informatika", dosen1, k1);

        //buat objek Mata Kuliah
        MataKuliah mk1 = new MataKuliah("PBO123", "Pemrograman Berorientasi Objek", 3);
        MataKuliah mk2 = new MataKuliah("MBD456", "Manajemen Basis Data", 3);

        //Menambahkan matkul ke dalam daftar matkul
        mhs1.addMatKul(mk1);
        mhs1.addMatKul(mk2);

        //Menampilkan jumlah matkul
        System.out.println("Jumlah Mata Kuliah = " + mhs1.getJumlahMatKul());

        //Menampilkan jumlah sks
        System.out.println("Jumlah SKS Mata Kuliah = " + mhs1.getJumlahSKS());

        //Menampilkan data dasar mahasiswa
        mhs1.printMhs();

        //Menampilkan detail lengkap mahasiswa
        mhs1.printDetailMhs();
    }
}
