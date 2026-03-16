/*  Nama File   : Garis.java
 *  Deskripsi   : berisi atribut dan method dalam class Garis
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 25 Februari 2026 */

public class Garis {
    //Atribut
    private Titik tAwal;
    private Titik tAkhir;
    private static int counterGaris = 0;

    //Method
    //konstruktor tanpa parameter yang menginisialisasi titik awal dgn (0,0) dan titik akhir dgn (1,1)
    public Garis(){
        tAwal = new Titik(0,0);
        tAkhir = new Titik(1,1);
        counterGaris++;
    }

    //konstruktor dgn parameter masukan titik awal dan titik akhir
    public Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
        counterGaris++;

    }

    //Getter
    public Titik getTitikAwal(){
        return tAwal;
    }

    public Titik getTitikAkhir(){
        return tAkhir;
    }

    //Setter
    public void setTitikAwal(Titik tAwal){
        this.tAwal = tAwal;
    }

    public void setTitikAkhir(Titik tAkhir){
        this.tAkhir = tAkhir;
    }

    //Selektor Counter Garis
    public static int getCounterGaris(){
        return counterGaris;
    }

    //Panjang
    public double getPanjang(){
        return Math.sqrt(Math.pow(tAkhir.getAbsis() - tAwal.getAbsis(), 2) + 
        Math.pow(tAkhir.getOrdinat() - tAwal.getOrdinat(), 2));
    }

    //Gradien
    public double getGradien(){
        return (tAkhir.getOrdinat() - tAwal.getOrdinat()) / (tAkhir.getAbsis() - tAwal.getAbsis());
    }

    // Titik tengah
    public Titik getTitikTengah(){
        double xTengah= (tAwal.getAbsis() + tAkhir.getAbsis()) / 2;
        double yTengah = (tAwal.getOrdinat() + tAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    //garis sejajar
    public boolean isSejajar(Garis L){
        return this.getGradien() == L.getGradien();
    }

    // garis tegak lurus
    public boolean isTegakLurus(Garis L){
        return this.getGradien() * L.getGradien() == -1;
    }

    // tampil titik awal dan titik akhir
    public void printGaris(){
      System.out.print("Titik Awal: ");
        tAwal.printTitik();
        System.out.print("Titik Akhir: ");
        tAkhir.printTitik();
    }

    // tampil persamaan garis dalam bentuk string y = mx + c
    public void printPersamaanGaris(){
        double m = getGradien();
        double c = tAwal.getOrdinat() - m * tAwal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}