/*
* Nama : Khanza Qaila
* NIM : 24060124120011
* File : MapLambdaMahasiswa.java
* Deskripsi : Menggunakan lambda expression dengan Map.
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class MapLambdaMahasiswa {
    public static void main(String[] args) {
        // Membuat koleksi Map
        // Key bertipe String (untuk NIM) dan Value bertipe String (untuk Nama)
        Map<String, String> dataMahasiswa = new LinkedHashMap<>();

        // Menambahkan data (NIM sebagai Key, Nama sebagai Value)
        dataMahasiswa.put("2401001", "Khanza Qaila");
        dataMahasiswa.put("2401002", "Nayla Husna");
        dataMahasiswa.put("2401003", "Akamal Fazli");
        dataMahasiswa.put("2401004", "Gigi Hadid");
        dataMahasiswa.put("2401005", "Xie Lien");

        System.out.println("=== Daftar Data Mahasiswa ===");
        
        // Menampilkan Key dan Value menggunakan Ekspresi Lambda
        // Struktur lambda pada Map: (parameterKey, parameterValue) -> { statement; }
        dataMahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " \t| Nama: " + nama);
        });
    }
}