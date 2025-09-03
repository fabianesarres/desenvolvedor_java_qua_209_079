document.getElementById("formDesaparecido")?.addEventListener("submit", function(e) {
  e.preventDefault();

  const nome = document.getElementById("nome").value;
  const idade = document.getElementById("idade").value;
  const data = document.getElementById("data").value;
  const descricao = document.getElementById("descricao").value;
  const boletim = document.getElementById("boletim").files[0];

  if (!boletim) {
    alert("Você precisa anexar o boletim.");
    return;
  }

  // Simulação de envio (futuro: enviar para backend Java)
  console.log("Dados cadastrados:", { nome, idade, data, descricao, boletim });

  alert("Cadastro realizado com sucesso!");
  this.reset();
});
