package com.objeto.app;

public class Pessoa {
/*Para definir os atributos - 1. Identar; 2. Colocar nome: modificador de acesso; Tipo de atributo e Nome do atributo seguido de ponto e vírgula; */
        
        //atributos:
    public String nome;
    public int idade;
    public Double altura;

        // método:
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura + " metros");
    }


}
