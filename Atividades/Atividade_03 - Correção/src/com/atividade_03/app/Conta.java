package com.atividade_03.app;

public class Conta {
//atributos
    public String titular;
    public String cpf;
    public String agencia;
    public String nConta;
    public double saldo;

//construtor
    public Conta(String titular, String cpf, String agencia, String nConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.nConta = nConta;
        this.saldo = saldo;
    }
// métodos
    public void exibirDados(){
        System.out.println("Nome do titular: " + this.titular + ".");
        System.out.println("CPF do titular: " + this.cpf + ".");
        System.out.println("Agência: " + this.agencia + ".");
        System.out.println("Número da conta: " + this.nConta + ".");
        System.out.println("Saldo da conta:R$ " + String.format("%.2f", this.saldo) + ".");
    }


// Fazer depósito:
    public double fazerDeposito(double valor){
        this.saldo += valor;
        return this.saldo;
    }

// Fazer Saldo:
    public double fazerSaque (double valor){
        this.saldo -= valor;
        return this.saldo;
    }

}

/* 
- public => significa que o método pode ser acessado de fora da classe.
- void => significa que esse método não retorna nenhum valor. Ele apenas executa uma ação (no - caso, imprimir dados). 
exibirDados() => é o nome do método.
*/
