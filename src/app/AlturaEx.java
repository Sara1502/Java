package app;

import java.util.Scanner;
import java.util.Locale;

public class AlturaEx {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double alturaMedia, menores, alturaTotal;

        System.out.println("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }


        nmenores = 0;
        alturaTotal = 0;
        for (int i=0; i<0; i++){
            if (idades[i] < 16) {
                nmenores++;
            }
            alturaTotal = alturaTotal + alturas[i];
        }

        alturaMedia = alturaTotal / n;
        menores = ((double)nmenores / n) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos:%.1f%%\n", menores);

        for(int i=0; i<n; i++){
            if (idades[i] < 16){
                System.out.printf("%s\n ", nomes[i]);
            }
        }


        sc.close();
    }
}
