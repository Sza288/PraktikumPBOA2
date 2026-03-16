/* Nama File   : Main.java
 * Deskripsi   : Berisi implementasi pembuatan objek DosenTetap, DosenTamu, dan Tendik
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 14/03/2026 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        // Objek Dosen Tetap
        DosenTetap d1 = new DosenTetap(
            "9545647548",              
            "78647324",               
            "Andi", 
            //Tgl lahir                  
            LocalDate.of(1990, 5, 5), 
            //tmt 
            LocalDate.of(2015, 1, 1),  
            "Fakultas Sains dan Matematika", 
            5000000                  
        );

        // Objek Dosen Tamu
        DosenTamu dtamu1 = new DosenTamu(
            "4444123567",               
            "DK12345",               
            "Khanza",
            //Tgl Lahir                
            LocalDate.of(1994, 1, 14),  
            //tmt
            LocalDate.of(2025, 2, 2),  
            "Fakultas Sains dan Matematika",
            4400000,  
            //Akhir Kontrak     
            LocalDate.of(2027, 12, 31)  
        );

        // Objek Tendik
        Tendik t1 = new Tendik(
            "1122334455",               
            "Nayla",                   
            LocalDate.of(1994, 4, 12),
            LocalDate.of(2024, 6, 7),   
            4000000,            
            "Akademik"               
        );

        // menampilkan info
        System.out.println("======= DATA PEGAWAI =======");
        System.out.println();
        
        //Dosen Tetap
        d1.printInfo();
        System.out.println();
        
        //Dosen Tamu
        dtamu1.printInfo();
        System.out.println();
        
        //Tendik
        t1.printInfo();
    }
}