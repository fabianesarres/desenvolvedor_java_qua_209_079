package com.heranca.app;

import java.util.Scanner;

public class PessoaJuridica {
       public static void main(String[] args) throws Exception {
        //instancia a classe 
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

    //definindo valores dos atributos do usuário:
        System.out.println("Informe o nome do usuário: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF do usuário: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o e-mail do usuário: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o nome do usuário: ");
        usuario.nome = leia.nextLine();
        

    
       }

}
