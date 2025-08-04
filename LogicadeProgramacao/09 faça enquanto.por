programa {
  funcao inicio() {
    //declaração de variáveis
    real x,y,result
    inteiro opcao


    //loop - faça enquanto
    faca
    {
      //TO DO
      // diferente:  ('!=')

      //menu
      escreva("Escolha uma opção:\n")
      escreva("1 - Soma\n")
      escreva("2 - Subtração\n")
      escreva("3 - Multiplicação\n")
      escreva("4 - Divisão\n")
      escreva("5 - Sair do Programa\n")
      leia(opcao)

      //verifica se o usuario deseja sair ou não
      se(opcao >= 1 e opcao <= 4)
      {
        escreva("Informe o valor de x: ")
        leia(x)
        escreva("Informe o valor de y:\n ")
        leia(y)
      }

      //verifica a opção escolhida
      escolha(opcao)
        {
          caso 1:
            result = x+y
            escreva("Resultado:\n ", result)
            pare
          caso 2:
            result = x-y
            escreva("Resultado:\n ", result)
            pare
          caso 3:
            result = x*y
            escreva("Resultado:\n ", result)
            pare
          caso 4:
            result = x/y
            escreva("Resultado:\n ", result)
            pare
          caso 5:
            escreva("Programa encerrado.\n")
            pare
          caso contrario:
            escreva("Opção inválida.\n")
        }

    } enquanto (opcao != 5)
  }
}
