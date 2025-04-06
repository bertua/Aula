
const numeroAleatorio = Math.floor(Math.random() * 100) + 1;
const input = document.getElementById("numero");
const button = document.getElementById("adivinhar");
const frase = document.getElementById("frase");
let texto = "";
const tentativas = document.getElementById("tentativas");
let cont = 0;

button.addEventListener('click', () => {
    const valorInput = Number(input.value);

    if (valorInput === numeroAleatorio) {
        texto = "Você acertou.";
    } else if (input.value.trim() === '') {
        texto = "";
    } else if (valorInput < 1 || valorInput > 100) {
        texto = "Número fora do limite.";
    } else if (valorInput < numeroAleatorio){
        texto = "Mais alto.";
    } else if (valorInput > numeroAleatorio ) {
        texto = "Mais baixo.";
    }
    frase.innerHTML = texto;

    if(input.value.trim() !== ''){
        cont++;
        tentativas.innerHTML = cont;
    }
});

