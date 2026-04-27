/* Nama File   : MData.java 
 * Deskripsi   : Main Program 
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 27 April 2026 */

public class MData {
    public static void main(String[] args) {
        Data<Anabul> d = new Data<>();

        Anggora k1 = new Anggora("KitCat", 4.5);
        KembangTelon k2 = new KembangTelon("Wiwi", 3.2); 
        Anggora k3 = new Anggora("Mubarok", 5.0);
        KembangTelon k4 = new KembangTelon("Kiki", 4.0);

        System.out.println("\n--- setIsi ---");
        d.setIsi(1, k1); 
        d.setIsi(2, k2); 
        d.setIsi(5, k3); 
        d.setIsi(101, k4);
        System.out.println("Nama :" + k4.getNama());

        System.out.println("\n--- getIsi  ---");
        
        // Posisi 1
        Anabul ku1 = d.getIsi(1);
        if (ku1 != null) {
            System.out.println("\n Data Posisi 1: Nama " + ku1.getNama() + " | Bobot: " + ((Kucing)ku1).getBobot());
        }

        // Posisi 2
        Anabul ku2 = d.getIsi(2);
        if (ku2 != null) {
            System.out.print("\n Data Posisi 2: Nama " + ku2.getNama() + " | Bobot: " + ((Kucing)ku2).getBobot());
        }

        // Posisi 5
        Anabul ku5 = d.getIsi(5);
        if (ku5 != null) {
            System.out.print("\n Data Posisi 5: Nama " + ku5.getNama() + " | Bobot: " + ((Kucing)ku5).getBobot());
        }

        System.out.println("\n--- getSize ---");
        System.out.println("Banyak elemen dalam wadah: " + d.getSize());
    }
}