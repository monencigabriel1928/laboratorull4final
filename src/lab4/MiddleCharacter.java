package lab4;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți un cuvânt: ");
        String cuvant = scanner.next();

        int lungime = cuvant.length();
        if (lungime % 2 == 0) {

            int mijloc1 = lungime / 2 - 1;
            int mijloc2 = lungime / 2;
            System.out.println("Cele două litere din mijloc: " + cuvant.charAt(mijloc1) + cuvant.charAt(mijloc2));
        } else {

            int mijloc = lungime / 2;
            System.out.println("Litera din mijloc: " + cuvant.charAt(mijloc));
        }
    }
}