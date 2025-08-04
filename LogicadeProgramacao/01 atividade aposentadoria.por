programa {
  funcao inicio() {

    cadeia nome
    inteiro idade
    cadeia genero


    //entrada de dados:
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe seu gênero: ")
    leia(genero)
    escreva("Informe sua idade: ")
    leia(idade)

    se (idade < 0 e > 65 ) escreva(nome, "pode aposentar")
    {
        senao escreva ("Não pode se aposentar")
    
    }
  }
}
