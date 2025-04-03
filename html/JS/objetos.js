const produto = {
    id: 1,
    nome: "camiseta",
    preco: 29.90,
    emEstoque: true,
    mostrarDetalhes: function (){
        console.log(`Produto: ${this.nome}, Preço ${this.preco}`);
    }
};

console.log(produto.nome);
console.log(produto["preco"]);
produto.mostrarDetalhes();

produto.categoria = "Vestário";

produto.preco = 24.90;

delete produto.emEstoque;