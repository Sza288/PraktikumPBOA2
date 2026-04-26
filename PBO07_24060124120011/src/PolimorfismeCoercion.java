/* Nama File   : Polimorfisme.java 
 * Deskripsi   : Program Polimorfisme
 * Pembuat     : Khanza Qaila/24060124120011
 * Tanggal     : 20 April 2026 */

public class PolimorfismeCoercion {
    public static void main(String[] args) {
        
        // a. Konversi int ke char dan double
        int nilaiInt = 65;
        char NChar = (char) nilaiInt; 
        double NDouble = (double) nilaiInt; 

        System.out.println("=== Bagian a ===");
        System.out.println("Sebagai Integer: " + nilaiInt);
        System.out.println("Sebagai Karakter: " + NChar);
        System.out.println("Sebagai Real: " + NDouble);

        // b. double ke integer
        double nilaiDouble = 65.65;
        int NInt = (int) nilaiDouble;

        System.out.println("=== Bagian b ===");
        System.out.println("Sebagai Double: " + nilaiDouble);
        System.out.println("Sebagai Integer: " + NInt);

        // c. String X dan Y konkat 
        String X = "1234";
        String Y = "5678";
        String S = X + Y; 
        int Z = Integer.parseInt(X) + Integer.parseInt(Y); 

        System.out.println("=== Bagian c ===");
        System.out.println("Konkatenasi S: " + S);
        System.out.println("Penjumlahan Z: " + Z);

        // d. String P dan Q (double) 
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q; 
        double D = Double.parseDouble(P) + Double.parseDouble(Q); // Penjumlahan numerik

        System.out.println("=== Bagian d ===");
        System.out.println("Konkatenasi R: " + R);
        System.out.println("Penjumlahan D: " + D);
        System.out.println();
    
        // e. Konversi S (String) menjadi objek Integer A
        Integer A = Integer.parseInt(S);
        System.out.println("=== Bagian e ===");
        System.out.println("Nilai A (Integer): " + A);

        // f. Konversi A (Integer) menjadi objek String T
        String T = A.toString();
        System.out.println("=== Bagian f ===");
        System.out.println("Nilai T (String): " + T);
    
    }
}
    