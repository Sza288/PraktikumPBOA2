package jdbc.utilities;
/*
* Nama : Khanza Qaila
* NIM : 24060124120011 
* File : Program.java
*Deskripsi : Implementasi Mahasiswa untuk MySQL
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver"); 
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/pbo";
                String user = "root";
                String password = "";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
