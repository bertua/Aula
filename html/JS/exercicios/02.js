let tipo = prompt("Escolha a categoria: ");

let produtos = [{
        id: 1,
        nome: "camiseta",
        preco: 48.57,
        categoria: "Vestuário",
    },
    {
        id: 2,
        nome: "bermuda",
        preco: 49.68,
        categoria: "Vestuário",
    },
    {
        id: 3,
        nome: "boné",
        preco: 27.80,
        categoria: "Vestuário",
    },
    {
        id: 4,
        nome: "tênis",
        preco: 254.80,
        categoria: "Vestuário",
    },
    {
        id: 5,
        nome: "Anel",
        preco: 127.52,
        categoria: "Jóia",
    },
    {
        id: 6,
        nome: "Brinco",
        preco: 136.31,
        categoria: "Jóia",
    }
];

function filtro(produto){
    return tipo === produto.categoria;
}

let filtrar = produtos.filter(filtro);
console.log(filtrar);


let ordenar = filtrar.sort((a, b) => b.preco - a.preco);
console.log(ordenar);
