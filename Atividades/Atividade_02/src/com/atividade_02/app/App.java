package com.atividade_02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// instancia de objeto
        Scanner leia = new Scanner (System.in);
// declaração de variáveis
        String nome, operacao;
        int idade, opcao, n;

//input - entrada de dados:
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        System.out.println("Escolha o filme que deseja ver: ");
        opcao = leia.nextInt();
//faça...enquanto
        do{
//menu
                System.out.println("Filme 1 - F1.");
                System.out.println("Filme 2 - Branca de Neve.");
                System.out.println("Filme 3 - Jogos Mortais.");
                System.out.println("Filme 4 - Coringa 2 .");
                System.out.println("Filme 5 - Moana 2");
                opcao = leia.nextInt();
                    
// output
                if (idade >= 18 ) {
                    System.out.println(nome + " liberado(a) para assistir ao filme.");
                }
                else if(idade <= 18){
                    System.out.println(nome + " não está liberado(a) para assistir ao filme.");
                }
                else {
                    System.out.println(nome + " bom filme!");
                }
                }while (opcao != 2); // != significa "DIFERENTE"
// fecha objeto LEIA:
        leia.close();

            
    }
}



/* 1. Crie uma aplicação em Java em que o usuário informe o nome, idade e programa que exibe em 5 salas de cinema, cada uma exibindo um filme com uma classificação indicativa.
 * 2. O usuário deverá escolher a sala de acordo com o filme desejado e se o usuário tiver idade para ver o filme, o programa imprime o ingresso e encerra. 
 * 3. Caso o usuário não tenha a idade mínima, o programa proíbe a entrada e pede para escolher outro filme.
*/
