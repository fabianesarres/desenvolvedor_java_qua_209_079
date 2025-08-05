package com.ifelse_02.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    // instancia a classe Scanner:
        Scanner leia = new Scanner(System.in);

    // declaração de variáveis:
        String nome;
        int idade;
        double altura;

    //input - entrada de dados:
        System.out.println("Informe o seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();

        
    // estrutura de decisão:
    // && = e, concateca as informações
        if (idade >= 12 && altura >= 1.15){
            System.out.println(nome + " está autorizado (a).");
        }
        else{
            System.out.println(nome + " não está autorizado(a).");
        }



    //fecha objeto leia:
        leia.close();
    }
}
