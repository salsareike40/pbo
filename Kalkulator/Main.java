public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        int hasilPenjumlahan = kalkulator.jumlahkan(2, 3);
        int hasilPerkalian = kalkulator.kalikan(4, 6);

        System.out.println("Hasil penjumlahan 2 + 3 = " + hasilPenjumlahan);
        System.out.println("Hasil perkalian 4 * 6 = " + hasilPerkalian);
    }
}