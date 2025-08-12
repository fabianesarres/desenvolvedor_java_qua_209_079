package com.heranca.app;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia a classe Pessoa Fisica
        
        PessoaFisica usuario = new PessoaFisica();


        // definindo valores dos atributos
        usuario.nome = "Fabiane Sarres";
        usuario.cpf = "000.000.000-00";
        usuario.email = "usuario@gmail.com";
        usuario.telefone = "(61) 99999-9999";
        usuario.endereco = "Campo da Esperança";


        usuario.cumprimentar();

        System.out.println("Nome: " + usuario.nome);
        System.out.println("CPF: " + usuario.cpf);
        System.out.println("E-mail: " + usuario.email);
        System.out.println("Telefone: " + usuario.telefone);
        System.out.println("Endereço: " + usuario.endereco);
    }
}
