package com.atividade_03.app;

public class App {
    private String titular;
    private String cpf;
    private String agencia;
    private String numeroConta;
    private Double saldo;


   public App(String titular, String cpf) {
//instancia a classe Pessoa (objeto)
            this.titular = titular;
            this.cpf = cpf;
            this.agencia = "0001";
            this.numeroConta = gerarNumeroConta();
            this.saldo = 0.0;
   }

   private String gerarNumeroConta(){
        return String.valueOf((int)(Match.random() * 90000) + 10000);

   }
//define os valores dos atributos
   public void exibirDados(){
        System.out.println("Dados da conta");
        System.out.println("Titular: " + titular);
        System.out.println("CPF: " + cpf);
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo:" + saldo); /* Saldo: R$ %.2f%n */
        
   }

//output:
    public void sacar(Double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }   

   
    public void  /* VOID = NÃO RETORNA NENHUM VALOR */
    
       

        
        


        
        usuario.exibirDados();

        leia.close();
    }
}


/* 
- public => significa que o método pode ser acessado de fora da classe.
- void => significa que esse método não retorna nenhum valor. Ele apenas executa uma ação (no - caso, imprimir dados). 
exibirDados() => é o nome do método.
*/
