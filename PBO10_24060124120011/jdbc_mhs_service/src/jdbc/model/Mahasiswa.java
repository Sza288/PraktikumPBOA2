package jdbc.model;
/*
* Nama : Khanza Qaila
* NIM : 24060124120011 
* File : Mahasiswa.java
*Deskripsi : Class Mahasiswa
*/
public class Mahasiswa {
    // atribut
    private int id;
    private String nama;

    // Constructor
    public Mahasiswa() {
    }

    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa(" + "id=" + id + ", nama=" + nama + ")";
    }
}