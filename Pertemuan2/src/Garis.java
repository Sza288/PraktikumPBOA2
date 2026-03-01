/*  Nama File   : Garis.java
 *  Deskripsi   : berisi atribut dan method dalam class Garis
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 25 Februari 2026 */

public class Garis {
    //Atribut
    Titik tAwal;
    Titik tAkhir;
    static int counterGaris = 0;

    //Method
    //konstruktor tanpa parameter yang menginisialisasi titik awal dgn (0,0) dan titik akhir dgn (1,1)
    Garis(){
        tAwal = new Titik(0,0);
        tAkhir = new Titik(1,1);
        counterGaris++;
    }

    //konstruktor dgn parameter masukan titik awal dan titik akhir
    Garis(Titik tAwal, Titik tAkhir){
        this.tAwal = tAwal;
        this.tAkhir = tAkhir;
        counterGaris++;

    }

    //Getter
    Titik getTitikAwal(){
        return tAwal;
    }

    Titik getTitikAkhir(){
        return tAkhir;
    }

    //Setter
    void setTitikAwal(Titik tAwal){
        this.tAwal = tAwal;
    }

    void setTitikAkhir(Titik tAkhir){
        this.tAkhir = tAkhir;
    }

    //Selektor Counter Garis
    static int getCounterGaris(){
        return counterGaris;
    }

    //Panjang
    double getPanjang(){
        return Math.sqrt(Math.pow(tAkhir.getAbsis() - tAwal.getAbsis(), 2) + 
        Math.pow(tAkhir.getOrdinat() - tAwal.getOrdinat(), 2));
    }

    //Gradien
    double getGradien(){
        return (tAkhir.getOrdinat() - tAwal.getOrdinat()) / (tAkhir.getAbsis() - tAwal.getAbsis());
    }

    // Titik tengah
    Titik getTitikTengah(){
        double xTengah= (tAwal.getAbsis() + tAkhir.getAbsis()) / 2;
        double yTengah = (tAwal.getOrdinat() + tAkhir.getOrdinat()) / 2;
        return new Titik(xTengah, yTengah);
    }

    //garis sejajar
    boolean isSejajar(Garis L){
        return this.getGradien() == L.getGradien();
    }

    // garis tegak lurus
    boolean isTegakLurus(Garis L){
        return this.getGradien() * L.getGradien() == -1;
    }

    // tampil titik awal dan titik akhir
    void printGaris(){
      System.out.print("Titik Awal: ");
        tAwal.printTitik();
        System.out.print("Titik Akhir: ");
        tAkhir.printTitik();
    }

    // tampil persamaan garis dalam bentuk string y = mx + c
    void printPersamaanGaris(){
        double m = getGradien();
        double c = tAwal.getOrdinat() - m * tAwal.getAbsis();
        System.out.println("y = " + m + "x + " + c);
    }
}