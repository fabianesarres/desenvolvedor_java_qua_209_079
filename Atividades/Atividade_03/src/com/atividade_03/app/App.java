package com.atividade_03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
          //instancia a classe Pessoa (objeto)
        Pessoa usuario = new Pessoa();
        Scanner leia = new Scanner (System.in);

        //define os valores dos atributos
        System.out.println("Informe o nome do titular da conta: ");
        usuario.nome = leia.nextLine();
        System.out.println("CPF do titular: ");
        usuario.cpf = leia.nextInt();
        System.out.println("Informe o número da conta: ");
        usuario.numeroConta = leia.nextDouble();
        


        //output:
        usuario.exibirDados();

        leia.close();

    }
}


/* Crie um programa com uma classe chamada Conta, com os seguintes atributos:
 *  - Titular da conta;
 *  - CPF do titular;
 *  - Agência;
 *  - Número da conta;
 *  - Saldo;
 * O usuário deverá informar o nome do titular e o cpf, e o programa exibe um menu com as seguintes operações:
 *  -Exibir dados da conta;
 *  - Fazer saque;
 *  - Fazer depósito;
 *  - Sair do programa;
 */
