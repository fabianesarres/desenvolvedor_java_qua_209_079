programa {
  funcao inicio() {
    //declaração de variáveis
    cadeia nomes[] = {"Fulano", "Cicrano", "Beltrano", "João", "Maria", "Fulano2", "Cicrano2", "Beltrano2", "João2", "Maria2"}
    inteiro idades[10]

    //entrada de dados:

      para(inteiro i = 0; i < 10; i++)
         {
        escreva("Informe o ", i+1, "º nome do usuário: \n")
        leia(nomes[i])
        escreva("Informe a idade do ", i+1, "º usuário: \n")
        leia(idades[i])
    } 

    //saída de dados?
      para(inteiro i = 0; i < 10; i++)
      {
        escreva("Nome do", i+1, "º usuário", nomes[i], ".")
        escreva("Idade: ", idades[i])
      }
  }
}
