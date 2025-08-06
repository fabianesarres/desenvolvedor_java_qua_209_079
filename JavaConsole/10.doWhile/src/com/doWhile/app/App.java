package com.doWhile.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// instancia de objeto
        Scanner leia = new Scanner (System.in);
// declaração de variáveis
        String nome;
        int idade, opcao;
        double altura;

//faça...enquanto
        do{
//menu
                System.out.println("1 - Registrar nova entrada.");
                System.out.println("2 - Sair do programa.");
                System.out.println("3 - Informe a opção desejada: .");
                opcao = leia.nextInt();

                        
                if (opcao == 1){
                    leia.nextLine();  // para limpeza de buffer
                    System.out.println("Informe o nome: ");
                    nome = leia.nextLine();
                    System.out.println("Informe a idade: ");
                    idade = leia.nextInt();
                    System.out.println("Informe a altura: ");
                    altura = leia.nextDouble();

// verifica idade e altura:
                if (idade >= 12 && altura >= 1.15){
                    System.out.println(nome + " está autorizado(a).");
                }
                else{
                    System.out.println(nome + " não está autorizado(a).");
                }



                }
                else if (opcao != 2){  // != siginfica "DIFERENTE"
                    System.out.println("Opção inválida");
                }                           
        }while (opcao != 2); // != significa "DIFERENTE"
// fecha objeto LEIA:
        leia.close();
    }
}
