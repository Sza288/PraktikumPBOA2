/* Nama File   : MainSeminar.java
 * Deskripsi   : Program utama untuk simulasi Seminar dengan kelas Mhs
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 25 April 2026 */

public class MainSeminar {
    public static void main(String[] args) {
        // Membuat 2 objek Dosen
        Dosen d1 = new Dosen("12345", "Dr. Agus");
        Dosen d2 = new Dosen("67890", "Prof. Khanza");

        // Membuat 5 objek Mahasiswa
        Mhs m1 = new Mhs("24001", "Nayla");
        Mhs m2 = new Mhs("24002", "Vela");
        Mhs m3 = new Mhs("24003", "Olive");
        Mhs m4 = new Mhs("24004", "Jura");
        Mhs m5 = new Mhs("24005", "Galang");

        // setWali 
        m1.setWali(d1);
        m2.setWali(d1);
        m3.setWali(d2);

        // Buat Objek Seminar
        Seminar seminarPBO = new Seminar();

        // Registrasi semua peserta
        seminarPBO.registrasi(d1);
        seminarPBO.registrasi(d2);
        seminarPBO.registrasi(m1);
        seminarPBO.registrasi(m2);
        seminarPBO.registrasi(m3);
        seminarPBO.registrasi(m4);
        seminarPBO.registrasi(m5);

        // Menampilkan jumlah peserta dan jumlah mahasiswa 
        System.out.println("Total Peserta   : " + seminarPBO.countPeserta());
        System.out.println("Total Mahasiswa : " + seminarPBO.countMahasiswa());

        // Menampilkan daftar nomor dan nama peserta)
        System.out.println("\n=== Daftar Peserta Seminar ===");
        seminarPBO.tampilPeserta();

        // Menampilkan detail data mahasiswa
        System.out.println("\n=== Detail Data Mahasiswa ===");
        m1.tampilDataMahasiswa();
        m2.tampilDataMahasiswa();
        m3.tampilDataMahasiswa();
    }
}