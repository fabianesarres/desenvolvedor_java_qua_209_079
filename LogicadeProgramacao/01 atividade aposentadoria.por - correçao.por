programa {
  funcao inicio() {
    //declaração de variáveis
    cadeia nome, genero
    inteiro idade


    // entrada de dados:
    escreva("Informe o nome:")
    leia(nome)
    escreva("Informe sua idade:")
    leia(idade)
    escreva("Informe seu gênero: ")
    leia(genero)

    //operador booleano + se senão se:
    // (== significa igualdade)
   
   se (idade >= 65 e genero == "masculino" ou idade >= 62 e genero == "feminino") escreva (nome, "Aposentadoria autorizada")
   senao escreva (nome, "Aposentadoria não autorizada")
  
  }
}
