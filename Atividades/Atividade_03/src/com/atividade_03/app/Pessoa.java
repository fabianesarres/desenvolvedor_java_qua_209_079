package com.atividade_03.app;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia a classe Pessoa (objeto)
        Pessoa usuario = new Pessoa();
        Scanner leia = new Scanner (System.in);

        //define os valores dos atributos
        System.out.println("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe CPF do titular: ");
        usuario.cpf = leia.nextInt();
        System.out.println("Informe o número da conta: ");
        usuario.numeroConta = leia.nextDouble();


        //output:
        usuario.exibirDados();

        leia.close();
    }
}
