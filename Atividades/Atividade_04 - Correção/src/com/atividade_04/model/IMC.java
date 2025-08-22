package com.atividade_04.model;

public class IMC {
    private double peso;
    private double altura;


// construtor:
    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

// definir > Generate Getters and Setters /* */

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularIMC(){
        return this.peso / (this.altura * this.altura);
    }

    public String diagnostico(double imc){
        /*pode fazer com if e else ou ternário*/

        return (imc <= 18.5) ? "Você está abaixo do peso."
        : (imc < 25) ? "Você está no peso ideal."
        : (imc < 30) ? "Você está com sobrepeso."
        : (imc < 35) ? "Você está com Obesidade Grau I."
        : (imc < 40) ? "Você está com Obesidade Grau II."
        : "Você está com Obesidade Grau III.";
    }


}
