package app;

import java.util.Scanner;
import entities.Retangulo;
import java.util.Locale;

public class RetanguloApp {

    public static void main(String[] args) {

      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      Retangulo retangulo = new Retangulo();
      System.out.println("Digite a largura e altura do retangulo: ");
      retangulo.Width = sc.nextDouble();
      retangulo.Height = sc.nextDouble();

      System.out.printf("Area: %.2f%n", retangulo.Area());
      System.out.printf("Perimetro: %.2f%n", retangulo.Perimetro());
      System.out.printf("Diagonal: %.2f%n", retangulo.Diagonal());

      sc.close();
	}
    
}
