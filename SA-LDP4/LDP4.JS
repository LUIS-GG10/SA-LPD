var numero;

while (true) {
    var input = prompt("Ingrese un número para la serie de Fibonacci:");

    if (!isNaN(input)) {
        numero = parseInt(input);
        break;
    } else {
        alert("Error: Ingrese un valor numérico válido.");
    }
}

function fibonacci(n) {
    var serie = [0, 1];

    for (var i = 2; i < n; i++) {
        serie[i] = serie[i - 1] + serie[i - 2];
    }

    return serie;
}

var resultadoFibonacci = fibonacci(numero);
console.log("Serie de Fibonacci:", resultadoFibonacci);
