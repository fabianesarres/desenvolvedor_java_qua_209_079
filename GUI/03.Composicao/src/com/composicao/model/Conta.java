package com.composicao.model;

import com.composicao.interfaces.IConta;

public class Conta implements IConta {
    private String agencia;
    private String nConta;
    private String saldo;
    private Pessoa titular;




    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public String getSaldo() {
        return this.saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }





    @Override
    public String exibirDados() {
        return "Agência: " + this.agencia + "\nNúmero da conta: " + this.nConta + "\nSaldo da conta: R$ " + String.format("%.2f", this.saldo) + "\nNome do titular da conta: " + this.titular.getNome() + "\nCPF do titular da conta : " + this.titular.getCpf() + "\nE-mail do titular da conta: " + this.titular.getEmail() + "\nTelefone do titular da conta " + this.titular.getTelefone() + "\nEndereço do titular: " + this.titular.getEndereco();
    }




    @Override
    public double fazerDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;

    }

    @Override
    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;

    }

}

/*Composição: 
 *  - Quando cria-se 2 classes, em 1 dessas classes, o atributo, é um OBJETO da 1a classe;
*/
