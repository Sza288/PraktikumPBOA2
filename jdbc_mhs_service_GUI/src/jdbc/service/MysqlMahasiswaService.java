package jdbc.service;

/*
* Nama : Khanza Qaila
* NIM : 24060124120011 
* File : Program.java
*Deskripsi : Implementasi Mahasiswa untuk MySQL
*/

import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }

    // Membuat objek mahasiswa 
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    // Menambahkan data mahasiswa 
    public void add(Mahasiswa mhs) {
        int id = mhs.getId();
        String nama = mhs.getNama();
        String query = "INSERT INTO mahasiswa (id, nama) VALUES(" + id + ", '" + nama + "')";
        try {
            System.out.println(query);
            Statement s = koneksi.createStatement();
            int result = s.executeUpdate(query);
            if (result > 0) {
                System.out.println("Berhasil insert");
            }
        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }

    // Update data mahasiswa
    public void update(Mahasiswa mhs) {
        int id = mhs.getId();
        String nama = mhs.getNama();
        String query = "UPDATE mahasiswa SET nama='" + nama + "' WHERE id=" + id;
        try {
            System.out.println(query);
            Statement s = koneksi.createStatement();
            int result = s.executeUpdate(query);
            if (result > 0) {
                System.out.println("Berhasil update");
            }
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }

    // Delete data mahasiswa sesuai id
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id=" + id;
        try {
            System.out.println(query);
            Statement s = koneksi.createStatement();
            int result = s.executeUpdate(query);
            if (result > 0) {
                System.out.println("Berhasil delete");
            }
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }

    // Ambil mahasiswa sesuai id
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String query = "SELECT * FROM mahasiswa WHERE id=" + id;
        try {
            System.out.println(query);
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            System.out.println("Gagal ambil data: " + e.getMessage());
        }
        return mhs;
    }

    // Ambil semua isi tabel mahasiswa ...5 lines
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                listMhs.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal ambil semua data: " + e.getMessage());
        }
        return listMhs;
    }
    /**
     *
     */
    public void indexReset() {
        try {
            // Menggunakan koneksi yang sudah ada di class ini
            Statement s = koneksi.createStatement();
            String query = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            s.executeUpdate(query);
            System.out.println("Indeks berhasil di-reset");
        } catch (SQLException e) {
            System.out.println("Gagal reset indeks: " + e.getMessage());
        }
    }
}