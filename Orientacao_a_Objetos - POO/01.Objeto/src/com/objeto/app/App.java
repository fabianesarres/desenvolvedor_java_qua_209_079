package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia a classe Pessoa (objeto)
        Pessoa usuario = new Pessoa();
        Scanner leia = new Scanner (System.in);

        //define os valores dos atributos
        System.out.println("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o idade: ");
        usuario.idade = leia.nextInt();
        System.out.println("Informe o altura: ");
        usuario.altura = leia.nextDouble();


        //output:
        usuario.exibirDados();

        leia.close();
    }
}
