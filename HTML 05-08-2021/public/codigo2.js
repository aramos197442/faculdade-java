/**
 * 
 */
var num = 7
var num2 = 9

if (num == 7) {
    console.log('num é 7!!')
} else if (num % 2 != 0) {
    console.log('num é ímpar!!')
} else {
    console.log('num é par!!')
}

if (num % 2 != 0 && num2 % 2 != 0) {
    console.log('ambos são ímpares!!')
} else if (num % 2 == 0 || num2 % 2 == 0) {
    console.log('um dos dois é par')
}
// operadores de comparação para o if

/* 
    == igual
    === identico (mesmo valor e mesmo tipo como string ou float etc)
    < menor
    > maior
    <= menor ou ig
*/