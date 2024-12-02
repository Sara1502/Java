package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Notas;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notas nota = new Notas();
        System.err.println("Nome: ");
        nota.name = sc.nextLine();
        System.err.println("Nota 1: ");
        nota.grade1 = sc.nextDouble();
        System.err.println("Nota 2: ");
        nota.grade2 = sc.nextDouble();
        System.err.println("Nota 3: ");
        nota.grade3 = sc.nextDouble();
        System.out.printf("FINAL GRADE: %.2f%n", nota.finalGrade());

        if (nota.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", nota.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}