package entities;

public class Conta {
    
    private int numConta;
    private String name;
    private double saldo;

    public Conta(int numConta, String name){ 
        this.numConta = numConta;
        this.name = name;
    }

    public Conta(int numConta, String name, double depositoInicial){
        this.numConta = numConta;
        this.name = name;
        deposito(depositoInicial);
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public int getNumConta(){
        return numConta;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double quantidade){
        saldo += quantidade;
    }

    public void saque(double quantidade){
        saldo -= quantidade + 5.0;
    }

    public String toString(){
        return "Conta " + numConta + ", Nome Titular: " + name + ", Saldo: $" + saldo;
    }
}
