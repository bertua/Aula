const numeros = [10, 20, 30, 40, 50];
console.log(numeros[0]);
console.log(numeros[2]);

numeros.forEach(numero => {
    console.log("Número: ",numero);
});

let frutas = ["maçã","banana","cereja","kiwi"];
console.log("Array original: ", frutas);

frutas.push("laranja");
console.log("Array após push: ",frutas);

let frutaRemovida = frutas.shift();
console.log("Fruta removida: ", frutaRemovida);
console.log("Array após shift: ",frutas);

let ultimaFruta = frutas.pop();
console.log("Fruta removida: ", ultimaFruta);
console.log("Array após pop:",frutas);

frutas.unshift("morango");
console.log("Após unshift: ",frutas);

let removidos = frutas.splice(1,1);
console.log("Após splice (remove 1 elemento no índice 1): ",frutas);
console.log("Elemento removido: ",removidos);

frutas.splice(1,0,"abacaxi", "uva");
console.log("Após splice, adiciona abacaxi e uva no índice 1: ",frutas);

frutas.sort();
console.log("Array após sort",frutas);

const numerosDobrados = numeros.map(numero => numero * 2)
console.log(numerosDobrados);

const numerosAleatorios = [5,8,20,18,9,45];
const numeroPares = numerosAleatorios.filter(numero => numero % 2 === 0);
console.log(numeroPares);

function maiorQue(valor){
    return valor>10;
}

const maiores = numerosAleatorios.filter(maiorQue);
console.log(maiores);

const frutasComA = frutas.filter(fruta => fruta.includes("a"));
console.log(frutasComA);