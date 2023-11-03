var numero;

while (true) {
    var input = prompt("Ingrese un número:");

    if (!isNaN(input)) {
        numero = parseInt(input);
        break;
    } else {
        alert("Error: Ingrese un valor numérico válido.");
    }
}

function calcularFactorial(n) {
    if (n === 0 || n === 1) {
        return 1;
    } else {
        return n * calcularFactorial(n - 1);
    }
}

var factorial = calcularFactorial(numero);
console.log("El factorial de " + numero + " es: " + factorial);
