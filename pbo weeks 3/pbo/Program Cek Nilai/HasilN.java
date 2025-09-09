import java.util.Scanner;

public class HasilN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        while (true) {
            System.out.print("Masukkan nilai (0-100): ");
            nilai = input.nextInt();
            
            if (nilai >= 0 && nilai <= 100) {
                break; 
            } else {
                System.out.println("❌ Input tidak valid! Harap masukkan angka antara 0 sampai 100.");
            }
        }
        
        CekNilai evaluator = new CekNilai(nilai);
        
        System.out.println(evaluator.cekLulus());
        System.out.println(evaluator.cekGrade());
        
        input.close();
    }
}