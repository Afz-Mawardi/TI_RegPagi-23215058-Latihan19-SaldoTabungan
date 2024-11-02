package Tugas_Latihan;
/**
 *
 * @author user
 * NAMA     : Afsani Wahyu Mawardi
 * KELAS    : TI RegPagi
 * NIM      : 23215058
 * Dekskipsi 
 * Progam   : Progam ini untuk menampilkan Operator, For
 *          Saldo Tabungan
 */
public class Latihan_19 {
    public static void main(String[] args) {
        
        double sukuBunga = 0.15; // 15%
        double saldoAwal = 2500000;

        for (int bulan = 1; bulan <= 6; bulan++) {
            double saldoAkhir = saldoAwal * (1 + sukuBunga);
            saldoAwal = saldoAkhir;
            System.out.printf("Saldo di bulan ke-%d Rp%,.2f\n", bulan, saldoAkhir);
        }
    }
}