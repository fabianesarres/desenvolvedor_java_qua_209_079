package com.quatropilares.model;

final public class PessoaJuridica extends Pessoa {
    private String razaoSocial;
    private String nomeFantasia;
    private String endereco;


    public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj,  String email, String telefone,  String endereco) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
    }


    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



}
