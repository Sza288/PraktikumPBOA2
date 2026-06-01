/*
* Nama : Khanza Qaila
* NIM : 24060124120011
* File : LambdaList.java
* Deskripsi : Menggunakan lambda expression dengan ArrayList.
 */
    
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswa = new ArrayList<>();
        mahasiswa.add("Khanza");
        mahasiswa.add("Nayla");
        mahasiswa.add("Husna");

        // Menggunakan Lambda Expression untuk mencetak isi List
        mahasiswa.forEach((nama) -> System.out.println(nama));
    }
}