package com.polimorfismo.app;

abstract public class Pessoa {
    //atributos
    public String email;
    public String telefone;
    public String endereco;

    // método = CONSTRUTOR:
    public Pessoa(String email, String telefone, String endereco) {
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // método = COMPLEMENTAR - chamar os elementos da classe PessoaFisica para cá:
    public String cumprimentar() {
        return null;
    }   
}
    


/* mesma classe, métodos diferentes = polimorfismo */