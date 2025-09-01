// Para criar uma função (so submit - button no html):  event; listening:
        // var; let; const (valor fixo - constante; valor pré-definido)


// variável do formulário:
const form = document.querySelector('form');

// arrow funtion:
const msg = () => {
        // variáveis locais
        let nome = document.querySelector('#nome').value;
        let idade = document.querySelector('#idade').value;
        const result = (idade => 18) ? 'é maior de idade.':'é menor de idade.';

        // saída de dados
        document.querySelector('#result').innerHTML = `${nome} ${result}`;
}


//         // verifica a idade:
//         if(idade >= 18) {
//                 result = alert('${nome} é maior de idade.');
//         }
//         else{
//                 alert('${nome} é maior de idade.');
//         }
// }

// evento:
form.addEventListener('submit', function(event){
        // desativa o submit:
        event.preventDefault();

        // executa a função:
        msg();
});
