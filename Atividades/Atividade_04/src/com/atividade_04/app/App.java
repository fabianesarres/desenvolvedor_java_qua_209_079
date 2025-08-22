package com.atividade_04.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        int peso, saida = 0;
        double peso, altura, imc;
        nome = JOptionPane.showInputDialog("Informe seu nome:");
        peso = Integer.parseInt(JOptionPane.showInputDialog("Informe seu peso:"));
        JOptionPane.showMessageDialog(null, "O nome do usuário: " + nome + "\npeso: " + peso, nome, 0);
        imc = Integer.parseInt(double);


            
//loop
        do{
                System.out.println("1- Calcular IMC");
                System.out.println("2 - Sair do programa");
                System.out.println("Escolha a opção:");
                opcao = leia.nextLine();

                switch (opcao) {
                        case "1":
                                System.out.println("Informe seu nome: ");
                                nome = leia.nextLine();
                                System.out.println("Informe seu peso(kg): ");
                                peso = leia.nextDouble();
                                System.out.println("Informe sua altura(m): ");
                                altura = leia.nextDouble();

                                imc = peso / (altura * altura);

                                System.out.println("O IMC de " + "é " + String.format("%.2f", imc) + ".");

                        // ternário:
                                diagnostico = (imc < 18.5) ? nome + "está abaixo do peso."
                                : (imc < 25) ? nome + "está no peso ideal."
                                : (imc < 30) ? nome + "está com sobrepeso"
                                : (imc < 35) ? nome + "está com obesidade grau I"
                                : (imc < 40) ? nome + "está com obesidade grau II"
                                : nome + "está com obesidade grau III";
                                System.out.println(diagnostico);
                                break;
                        case "2":
                                saida = Integer.parseInt(opcao);
                                System.out.println("Programa encerrado");                                
                                break;                
                        default:
                                System.out.println("Opção inválida.");
                                break;
                }
        }while (saida != 2);
    }
}







/* Recrie o app do IMC usando JOptionPane e os conceitos de classe e encapsulamento. */