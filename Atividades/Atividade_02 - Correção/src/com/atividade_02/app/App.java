package com.atividade_02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// instancia de objeto
        Scanner leia = new Scanner (System.in);

// declaração de variáveis
        String nome, sala;
        int idade, idadeMinima = 0;


// input - entrada de dados:
        System.out.println("Informe o nome: ");
        nome = leia.nextLine();
        System.out.println("Informe a idade: ");
        idade = leia.nextInt();

    
// limpeza de buffer:
        leia.nextLine();

            do {
                // salas de cinema:
                System.out.println("☕ Cine Java ☕\n");
                System.out.println("Sala 1 - A Roda Quadrada - Livre");
                System.out.println("Sala 2 - A Volta dos Que Não Foram - 12 anos");
                System.out.println("Sala 3 - As Tranças do Rei Careca - 14 anos");
                System.out.println("Sala 4 - Poeira em Alto Mar - 16 anos");
                System.out.println("Sala 5 - A Vingança do Frango Assado - 18 anos");
                System.out.println("Qual sala deseja entrar?");
                sala = leia.nextLine();


                    switch (sala) {
                        case "1":
                            break;
                        case "2":
                            idadeMinima = 12;
                            break;
                        case "3":
                            idadeMinima = 14;
                            break;
                        case "4":
                            idadeMinima = 16;
                            break;                
                        case "5":
                            idadeMinima = 18;
                            break;                
                        default:
                            idadeMinima = idade + 1;
                            System.out.println("Sala inexistente.");
                    }
                
                if (idade >= idadeMinima){
                    System.out.println("Entrada permitida para " + nome + ".");
                    System.out.println("Tenha um bom filme!🎬");
                }
                else{
                    System.out.println("Favor, escolher outro filme!");
                }
            }while(idade >= idadeMinima);

// fecha objeto LEIA:
        leia.close();

            
    }
}



/* 1. Crie uma aplicação em Java em que o usuário informe o nome, idade e programa que exibe em 5 salas de cinema, cada uma exibindo um filme com uma classificação indicativa.
 * 2. O usuário deverá escolher a sala de acordo com o filme desejado e se o usuário tiver idade para ver o filme, o programa imprime o ingresso e encerra. 
 * 3. Caso o usuário não tenha a idade mínima, o programa proíbe a entrada e pede para escolher outro filme.
*/
