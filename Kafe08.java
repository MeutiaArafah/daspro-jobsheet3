import java.util.Scanner;
/**
 * Kafe08
 */
public class Kafe08 {

    public static void main(String[] args) {
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double totalHarga, nominalBayar, hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        // hitung total harga semua
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

        // hitung pembayaran/nominal bayar
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + jmlRoti + " roti" );
        System.out.println("Nominal bayar Rp " + nominalBayar);
    }
}