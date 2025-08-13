package com.encapsulamento.app;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;



    public Pessoa() {
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}

/* ENCAPSULAMENTO:
 * - Trabalha com a visibilidade das classes 
 * - Os atributos acabam sendo mais indiretos, para evitar hacker. Encapsulamento não deixarão os atributos tão acessíveis;
 * - Por fim, faz-se o BLOQUEIO dos atributos (informações pessoais);
 * 
 * 
 * Generate Getters and Setter;
 * 
 */
