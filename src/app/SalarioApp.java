package app;

import java.util.Scanner;


import entities.Salario;
import java.util.Locale;


public class SalarioApp {
     public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salario salario = new Salario();
		System.out.println("Nome: ");
		salario.name = sc.nextLine();
		System.out.println("Salario base: ");
		salario.grossSalary = sc.nextDouble();
		System.out.println("Taxa: ");
		salario.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado: " + salario);
        System.out.println();
        System.out.print("Porcentagem de aumento? ");
        double percentage = sc.nextDouble();
        salario.increaseSalary(percentage);
       
        System.out.println();
        System.out.println("Updated data: " + salario);

        sc.close();
	}
}
