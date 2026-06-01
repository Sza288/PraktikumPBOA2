/*
* Nama : Khanza Qaila
* NIM : 24060124120011
* File : DiskonLambda.java
* Deskripsi : Ekspresi lambda dasar, digunakan untuk menghitung diskon.
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        //dengan lambda dengan blok statement
        IDiskon diskonNatal = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka :" +diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran :" +diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Natal :" +diskonNatal.hitungDiskon(45000));
    }
}