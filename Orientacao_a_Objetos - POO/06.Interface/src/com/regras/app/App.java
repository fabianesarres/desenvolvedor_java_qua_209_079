package com.regras.app;

import java.util.Scanner;
import com.regras.model.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta("", "", "", "",);

        Scanner leia = new Scanner(System.in);

        //TODO -  

        //declaração das variáveis 
        int opcao;
        double valor;

        System.out.println("Informações do usuário:\n ");
        System.out.println("Nome " + usuario.getTitular);
        System.out.println("CPF " + usuario.getCpf);
        System.out.println("Número da conta " + usuario.getNConta);
        System.out.println("Número da Agência:  " + usuario.getAgencia);
        System.out.println("Saldo: R$ " + usuario.getSaldo);
    }
}
