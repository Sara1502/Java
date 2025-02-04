package app;

import java.util.Scanner;
import entities.Conta;
import java.util.Locale;    

public class BancoApp {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o numero da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Digite o nome do titular: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Gostaria de fazer um deposito inicial (s/n)? ");
        char response = sc.next().charAt(0);        
        if (response == 's') {
            System.out.println("Digite o deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numConta, name, depositoInicial);
        } 
        else {
            conta = new Conta(numConta, name);
        }

        System.out.println("Dados da conta:");
        System.out.println(conta);
        sc.nextLine();
        System.out.println("Digite o deposito: ");
        double quantidade = sc.nextDouble();
        conta.deposito(quantidade);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);
        System.out.println("Digite o saque: ");
        quantidade = sc.nextDouble();
        conta.saque(quantidade);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);

        sc.close();
    }
}

