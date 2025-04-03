function verificarParidade(numero){
    let mensagem;
    if(numero % 2 === 0){
        mensagem = "O número é par.";
    } else {
        mensagem = "O número é impar.";
    }
    return mensagem;
}

console.log(verificarParidade(7));