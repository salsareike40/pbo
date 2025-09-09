package pbo.Perulangan;

public class PerulanganSederhana {
    public static void main(String[] args) {

        System.out.println("Perulangan for:");
        for (int penghitung = 1; penghitung <= 5; penghitung++) {
            System.out.println("Putaran ke-" + penghitung);
        }

        System.out.println("\nPerulangan while:");
        int bilangan = 1;
        while (bilangan <= 5) {
            System.out.println("Putaran ke-" + bilangan);
            bilangan++;
        }

        System.out.println("\nPerulangan do-while:");
        int counter = 1;
        do {
            System.out.println("Putaran ke-" + counter);
            counter++;
        } while (counter <= 5);
    }
}
