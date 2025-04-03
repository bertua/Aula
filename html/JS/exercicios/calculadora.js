
const display = document.getElementById("display");

let a = '';
let b = '';
let operacao = '';

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
        }
    });
});



function calcular(){
    let r;
    switch(operacao){
        case "+":
            r=a+b;
        case "-":
            r=a-b;
        case "x":
            r=a*b;
        case "/":
            if(b == 0){
                r="ERROR";
            } else {
                r=a/b;
            }
    }

    display.value = r;
    a, b, operacao = '';
}
