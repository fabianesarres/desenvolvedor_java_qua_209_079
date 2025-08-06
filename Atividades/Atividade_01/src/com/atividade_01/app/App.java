package com.atividade_01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//instancia de objeto:
        Scanner leia = new Scanner (System.in);

//declaração de variáveis:
        String nome, operacao;
        double peso, altura, result; 
//input - entrada de dados:
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe seu peso: ");
        peso = leia.nextDouble();
        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();
        
        

//limpeza de buffer:
        leia.nextLine();


//output - saída de dados
        System.out.println("Nome: " + nome + ".");
        System.out.println("Nome: " + peso + ".");
        System.out.println("Nome: " + altura + ".");
        System.out.println("Resultado do IMC é: .");

//escolha caso:
        switch (operacao){
            case "1":
                result = peso/altura*altura;
                System.out.println("O resultado do IMC é: " + result);
                break;
        }

//fecha objeto - leia
        leia.close();
    }
}




/* Crie um programa que receba o nome, peso e altura do usuário, e calcule o valor do seu IMC, cuja fórmula é peso/altura*altura, e informe o seu diagnóstico baseado na tabela do IMC. 
 O programa poderá calcular o IMC de vários usuários e deverá ter a opção de sair de programa.
 */
