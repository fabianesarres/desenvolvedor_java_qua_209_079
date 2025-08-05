package com.ifelse_04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//instancia objeto
        Scanner leia = new Scanner (System.in);
//declaração de variáveis
        String nome;
        int idade;
//input - entrada de dados
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
//TERNÁRIO:
        System.out.println(nome + ((idade >= 18) ? " é maior de idade." : " é menor de idade"));


//fecha objeto leia:
        leia.close();
    }
}
