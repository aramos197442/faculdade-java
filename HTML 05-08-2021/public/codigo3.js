/**
 * 
 */
var x = 1
var y = 1

function funcaoWhile () {
    while (x <= 10) {
        console.log(x)

        x = x + 1
    }
}

/* do while, mesma coisa porém sempre executa a função pelo menos uma vez */
function funcaoDoWhile () {
    do {
        console.log(x)

        x = x + 1
    } while (x <= 10)
}

/* for, ele espera uma variavel, uma condicao e um controle */
function funcaoFor() {
    for (y; y<=10; y++) { /* vai executar o 'controle' sempre que fizer o código */
        console.log(y)
    }
}
