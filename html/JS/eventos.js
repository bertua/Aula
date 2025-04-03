const botao = document.getElementById("botao");
botao.addEventListener("click",() => {
    //alert("Botão foi clicado!");
    const campoNome = document.getElementById("nome");
    const campoEmail = document.getElementById("email");
    const div = document.getElementById("alterar");
    const nome = campoEmail.value;
    const email = campoEmail.value;
    
    if(nome.trim() === "" || email.trim() === ""){
        alert("Por favor, preencha todos os campos.");
    }
    
    const texto = `Nome ${nome} <br>E-mail ${email}`;
    div.innerHTML=texto;
});

/*const campoTexto = document.getElementById("nome");
campoTexto.addEventListener("input", (event) => {
    console.log("Valor atual: ", event.target.value);
});*/
