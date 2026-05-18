package Pertemuan10;
import java.sql.*;
/*
* Nama : Khanza Qaila
* NIM : 24060124120011 
* File : MySQLPersonDAO.java
* Deskripsi : implementasi PersonDAO untuk MySQL
*/
public class MySQLPersonDAO implements PersonDAO{
    @Override
    public void savePerson(Person person)throws Exception{
        String name = person.getName();
        //membuat koneksi, name db, user, password menyesuaikan
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con;
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost/pbo", "root", "");
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}
