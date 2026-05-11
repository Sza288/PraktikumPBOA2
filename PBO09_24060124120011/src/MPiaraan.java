/* Nama File   : MPiaraan.java 
 * Deskripsi   : Aplikasi untuk menguji kelas Piaraan 
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 4 Mei 2026 */

public class MPiaraan {
    public static void main(String[] args) {
        Piaraan pi = new Piaraan();

        // Buat objek Anabul kucinh\g
        Anggora k1 = new Anggora("Mubarok", "adek" , 4.0);
        Anggora k2 = new Anggora("Wiwi", "kiwi" , 3.0);
        KembangTelon k3 = new KembangTelon("Kitcat", "gendut" , 5.5);
        KembangTelon k4 = new KembangTelon("Kiki" , "abang" , 5.0);

        //Menambah ke antrean
        System.out.println("--- Menambah Anabul ke Antrean ---");
        pi.enqueueAnabul(k1);
        pi.enqueueAnabul(k2);
        pi.enqueueAnabul(k3);
        pi.enqueueAnabul(k4);

        // getNbelm
        System.out.println("Jumlah anabul dalam antrean: " + pi.getNbelm());

        //showAnabul
        pi.showAnabul();

        // isMember
        System.out.println("Apakah ada di antrean? " + pi.isMember(k1));

        //countKucing dan bobotKucing
        System.out.println("Banyaknya kucing: " + pi.countKucing());
        System.out.println("Total bobot kucing: " + pi.bobotKucing() + " kg");

        //showJenisAnabul 
        System.out.println("\n--- Detail Jenis Anabul ---");
        pi.showJenisAnabul();

        //getAnabul
        System.out.println("\nAnabul pertama: " + pi.getAnabul().getNama());

        //dequeueAnabul 
        System.out.println("Dequeue Anabul: " + pi.dequeueAnabul().getNama() + "...");
        System.out.println("Sisa antrean| anabul: " + pi.getNbelm());

        pi.showAnabul();
    }
}

//Kesimpulan : Koleksi adalah cara kita mengorganisir banyak objek ke satu tempat 
// agar lebih mudah dimanipulasi, dicari, dan dihitung tanpa t tanpa pusing mikirin batasan tempatnya.