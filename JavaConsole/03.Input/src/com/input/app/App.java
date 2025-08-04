package com.input.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO 
        //Instância do objeto de entrada de dados:
        Scanner leia = new Scanner(System.in);


            // >>>> Fazer: nome + idade + email
        //Declaração de variáveis
        String nome;
        String email;
        int idade;

        //Entrada de dados = INPUT:
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade:");
        idade = leia.nextInt();
        //Fazer limpeza de buffer, com o seguinte comando:
        leia.nextLine();
    
        
        System.out.println("Informe seu email:");
        email = leia.nextLine();


        //SAÍDA DE DADOS = OUTPUT
        System.out.println("Nome: " + nome + ".");
        System.out.println("Nome: " + idade + ".");
        System.out.println("Nome: " + email + ".");

        //FECHAR O OBJETO:
        leia.close();

    }
}
