function imprimirTabuada(numero){
    for(let i = 1; i <= 10; i++){
        let multi = i*numero;
        let tipo = "ímpar";
        if(i*numero % 2 === 0){
            tipo = "par";
        }
        mensagem = `${i} x ${numero} = ${multi} (${tipo})`;
        console.log(mensagem);
    }
}

let numero = prompt("Insira um número: ");
if(!isNaN(numero)){
    imprimirTabuada(numero);
} else {
    console.log("Insira um número válido.");
}
