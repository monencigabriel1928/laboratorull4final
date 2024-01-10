package lab4;
import java.util.Scanner;

public class SumaCifrelor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți un număr: ");
        int numar = scanner.nextInt();

        int sumaCifrelor = 0;
        int numarCurent = numar;

        while (numarCurent != 0) {
            sumaCifrelor += numarCurent % 10;
            numarCurent /= 10;
        }

        System.out.println("Suma cifrelor numărului " + numar + " este: " + sumaCifrelor);
    }
}