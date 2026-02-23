/* Nama File   : Titik.java 
Deskripsi   : berisi atribut dan method dalam class titik
Pembuat     : Khanza Qaila/24060124120011
Tanggal     : 23 Februari 2026*/


public class Titik {
    //**ATRIBUT**
    double absis;
    double ordinat;
    static int counterTitik = 0;

    //**METHOD**
    //konstruktor untuk membuat titik (0,0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    // konstruktor overloading
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
        counterTitik++;
    }

    // //konstruktor untuk membuat dengan nilai absis dan ordinat tertentu
    // Titik(double absis , double ordinat){
    //     this.absis = absis;
    //     this.ordinat = ordinat;
    //     counterTitik++;
    // }

    //konstruktur untuk membuat titik (0,0)
    // Titik(){
    //     this(0,0) ;
    // }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

    //mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //mencetak koordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    //getKuadran
    int getKuadran(){
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    //getJarakPusat
    double getJarakPusat() {
        return Math.sqrt(this.absis * this.absis + this.ordinat * this.ordinat);
    }

    //getJarak
    double getJarak(Titik T) {
        double selisihX = this.absis - T.getAbsis();
        double selisihY = this.ordinat - T.getOrdinat();

        return Math.sqrt(selisihX * selisihX + selisihY * selisihY);
    }

    //refleksiX
    void refleksiX() {
        ordinat = ordinat * -1 ;
    }

    //refleksiY
    void refleksiY() {
        absis = absis * -1 ;
    }

    //getRefleksiX
    Titik getRefleksiX() {
        return new Titik(absis, ordinat * -1) ;
    }

    //getRefleksiY
    Titik getRefleksiY() {
        return new Titik(absis * -1, ordinat) ;
    }

} //end class Titik