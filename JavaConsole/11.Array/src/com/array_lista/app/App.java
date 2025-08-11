package com.array_lista.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //instancia de objeto   
        Scanner leia = new Scanner(System.in);


    //declaração de variáveis 
        /*Para armazenar várias String = String [] */
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Informe o " + (i + 1) + "º nome: ");
            nomes[i] = leia.nextLine();
        }

       /* Uso dos : => interação */
        for (String nome : nomes) {
            System.out.println(nome);
        }

    // fecha objeto - leia
        leia.close();
    }
}
