package com.while_contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
// instancia de objeto:
        Scanner leia = new Scanner (System.in);
// declaração de variáveis:
        int n;

// input - entrada de dados:
        System.out.println("Informe o valor de n: ");
        n = leia.nextInt();

// enquanto:
        while (n >= 0){
            System.out.println(n);
            n--;
        }
// output - saída de dados:

// fechar objeto => leia:
        leia.close();
    }
}
