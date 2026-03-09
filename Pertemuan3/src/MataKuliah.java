/*  Nama File   : MataKuliah.java
 *  Deskripsi   : berisi atribut dan method dalam class MataKuliah
 *  Pembuat     : Khanza Qaila/24060124120011
 *  Tanggal     : 2 Maret 2026 */

public class MataKuliah {
    private String idMatKul;
    private String nama;
    private int sks;

    // Konstruktor tanpa parameter
    public MataKuliah() {
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    //Konstruktor dgn paramaeter
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    //Selektor
    public String getIdMatKul() { 
        return idMatKul; 
    }

    public int getSks() {
        return sks;
    }
    
    public String getNama() {
        return nama;
    }

    //Mutator
        public void setidMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
