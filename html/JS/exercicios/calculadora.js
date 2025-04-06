
const display = document.getElementById("display");

let a = '';
let b = '';
let operacao = '';
let ultimaResposta = '';

function atualizarDisplay() {
    display.value = a + ' ' + operacao + ' ' + b;
}


const buttons = document.querySelectorAll('input[type="button"]');
buttons.forEach(button => {
    button.addEventListener('click', () => {
        if (button.value >= '0' && button.value <= '9') {
            if (operacao === '') {
                a += button.value;
            } else {
                b += button.value;
            }
            atualizarDisplay();
        } else if (button.value === '+' || button.value === '-' || button.value === 'x' || button.value === '/') {
            operacao = button.value;
            atualizarDisplay();
        } else if (button.value === '=') {
            calcular();
        } else if (button.value === 'C') {
            a = '';
            b = '';
            operacao = '';
            atualizarDisplay();
        } else if (button.value === 'Er') {
            if (b !== '') {
                b = b.slice(0, -1);
            } else if (operacao !== '') {
                operacao = '';
            } else {
                a = a.slice(0, -1);
            }
            atualizarDisplay();
        } else if (button.value === 'Ans') {
            if (ultimaResposta !== '') {
                a = ultimaResposta;
                b = ''; 
                operacao = '';
                atualizarDisplay();
            }
        }
    });
});



function calcular() {
    let r;
    const numA = parseFloat(a);
    const numB = parseFloat(b);

    switch(operacao) {
        case "+":
            r = numA + numB;
            break;
        case "-":
            r = numA - numB;
            break;
        case "x":
            r = numA * numB;
            break;
        case "/":
            if (numB === 0) {
                r = "ERROR";
            } else {
                r = numA / numB;
            }
            break;
        default:
            r = "ERROR";
    }

    display.value = r;
    ultimaResposta = r.toString();
    a = ultimaResposta;
    b = '';
    operacao = '';
}
