package com.atividade_01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
//instancia de objeto:
        Scanner leia = new Scanner (System.in);

//declaração de variáveis:
        String nome;
        int opcao;
        double peso, altura, result; 
//input - entrada de dados:
       do{
        System.out.println("1 - Registrar novo usuário.");
        System.out.println("2 - Sair do programa.");
        System.out.println("3 - Informe a opção desejada.");
        opcao = leia.nextInt();

        if (opcao == 1) {
                leia.nextLine();
                System.out.println("Informe o nome: ");
                nome = leia.nextLine();
                System.out.println("Informe seu peso: ");
                peso = leia.nextDouble();
                System.out.println("Informe a altura: ");
                altura = leia.nextDouble();

//calcular IMC:
result = peso / (altura * altura);

//verificar IMC:
                if (result <= 16) {
                        System.out.println("O seu IMC é de " + result + " você está com magreza severa.");
                }
                if (result <= 16 && result < 17) {
                        System.out.println("O seu IMC é de " + result + " você está com magreza moderada.");
                }
                if (result <= 17.1 && result < 18.5) {
                        System.out.println("O seu IMC é de " + result + " você está com magreza leve.");
                }
                if (result <= 18.5 && result < 25) {
                        System.out.println("O seu IMC é de " + result + " você está eutrófico.");
                }
                if (result <= 25.1 && result < 30) {
                        System.out.println("O seu IMC é de " + result + " você está com sobrepeso.");
                }
                if (result <= 30.1 && result < 35) {
                        System.out.println("O seu IMC é de " + result + " você está com obesidade grau I.");
                }
                if (result <= 16 && result < 17) {
                        System.out.println("O seu IMC é de " + result + " você está com magreza leve.");
                }
                
                
                nome = leia.nextLine();

        }
        
       }
        
        

//limpeza de buffer:
        leia.nextLine();


//output - saída de dados
        
//escolha caso:
        
//fecha objeto - leia
        leia.close();
    }
}




/* Crie um programa que receba o nome, peso e altura do usuário, e calcule o valor do seu IMC, cuja fórmula é peso/altura*altura, e informe o seu diagnóstico baseado na tabela do IMC. 
 O programa poderá calcular o IMC de vários usuários e deverá ter a opção de sair de programa.
 */
