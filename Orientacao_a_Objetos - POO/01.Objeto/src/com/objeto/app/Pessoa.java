package com.objeto.app;

public class Pessoa {
/*Para definir os atributos - 1. Identar; 2. Colocar nome: modificador de acesso; Tipo de atributo e Nome do atributo seguido de ponto e vírgula; */
        
        //atributos:
    public String nome;
    public int idade;
    public Double altura;



    // construtores
    public Pessoa() {
    }


/*Selecionar botão direito > "CODE GENERATE FOR JAVA" > "Genrate Constructor Using All Fields"  */
/* Função do THIS:  */
        // construtor
    public Pessoa(String nome, int idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

        // método:
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura + " metros");
    }

    public String cumprimentar() {
        return "Olá, meu nome é " + this.nome + ", tenho" + this.idade + " anos, e meço " + this.altura + " metros de altura.";
    }
}


