package jdbc.program;

/*
* Nama : Khanza Qaila
* NIM : 24060124120011 
* File : Program.java
*Deskripsi : Main program untuk akses Mahasiswa
*/

import java.util.List;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {

    public static void main(String[] args) {
        MysqlMahasiswaService service = new MysqlMahasiswaService();

        // Insert Khanza , Nayla , Akmal
        service.add(new Mahasiswa(1, "Khanza"));
        // Insert Nayla and Akmal
        service.add(new Mahasiswa(2, "Nayla"));
        service.add(new Mahasiswa(3, "Akmal"));

        // Display all mahasiswa
        System.out.println("Data Mahasiswa:");
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }

        // Update data dengan ID 2 menjadi Husna
        Mahasiswa mhsUpdate = service.getById(2);
        if (mhsUpdate != null) {
            mhsUpdate.setNama("Husna");
            service.update(mhsUpdate);
        }

        // Delete data dengan ID 3
        service.delete(3);

        // Display final data setelah Update dan Delete
        System.out.println("\nSetelah Update dan Delete:");
        listMhs = service.getAll();
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}