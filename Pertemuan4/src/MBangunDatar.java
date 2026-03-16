public class MBangunDatar {
    public static void main(String[] args) {
        //Menggunakan konstruktor dengan parameter
        Persegi p1 = new Persegi(4, "Merah", "Putih");
        Lingkaran l1 = new Lingkaran(4, "Biru", "Hitam");

        //Menggunakan konstruktor tanpa parameter
        Persegi p2 = new Persegi();
        p2.setSisi(8);
        p2.setWarna("Pink");
        p2.setBorder("abu-abu");

        //Menampilkan data p1
        System.out.println("=== Persegi p1 === ");
        // System.out.println("Warna : " + p1.getWarna());
        // System.out.println("Border : " + p1.getBorder());
        // System.out.println("Jumlah Sisi : " + p1.getJmlSisi());
        p1.printInfo();
        System.out.println("Luas : " + p1.getLuas());
        System.out.println("Keliling : " + p1.getKeliling());
        System.out.println("Diagonal : " + p1.getDiagonal());
        Persegi.printCounterBangunDatar();

        //Menampilkan data p2
        System.out.println("\n=== Persegi p2 === ");
        System.out.println("Warna : " + p2.getWarna());
        System.out.println("Border : " + p2.getBorder());
        System.out.println("Jumlah Sisi : " + p2.getJmlSisi());
        System.out.println("Luas : " + p2.getLuas());
        System.out.println("Keliling : " + p2.getKeliling());
        System.out.println("Diagonal : " + p2.getDiagonal());


        //Menampilkan data l1
        System.out.println("\nLingkaran l1 : ");
        // System.out.println("Warna : " + l1.getWarna());
        // System.out.println("Border : " + l1.getBorder());
        // System.out.println("Jumlah Sisi : " + l1.getJmlSisi());
        l1.printInfo();
        System.out.println("Luas : " + l1.getLuas());
        System.out.println("Keliling : " + l1.getKeliling()); 
        
    }
}
