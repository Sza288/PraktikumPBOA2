/* Nama file : MTeman.java
   Deskripsi : Aplikasi dari kelas teman
   Pembuat : Khanza Qaila/24060124120011
   Tanggal : 4 Mei 2026 */

public class MTeman {
    public static void main(String[] args) {
        // Buat Objek Teman
        Teman t = new Teman();
        //nambah teman baru
        t.addNama("Akmal");
        t.addNama("Fazli");
        t.addNama("Khanza Husna");

        //menampilkan jumlah teman
        System.out.println("Jumlah teman : " + t.getNbelm());

        //mengambil nama pada indeks ke-1
        System.out.println("Nama pada indeks 1: " + t.getNama(1));

        //hapus nama teman yang sudah ada pada list
        t.delNama("Fazli");
        t.isMember("Khanza Husna");

        //mengambil nama pada indeks ke-2
        System.out.println("Nama pada indeks 2: " + t.getNama(2));

        //mengubah nama pada indeks ke-1
        t.setNama(1, "Ameng");

        //ganti nama dlm list dgn nama yang baru
        t.gantiNama("Akmal" , "Nayla");

        //countNama
        System.out.println("Jumlah teman bernama Khanza: " + t.countNama("Khanza"));
        //showTeman
        t.showTeman();
    }
}