var numero1 = parseFloat(prompt("Ingrese el primer número:"));
var numero2 = parseFloat(prompt("Ingrese el segundo número:"));
var numero3 = parseFloat(prompt("Ingrese el tercer número:"));

var numerosOrdenadosAscendente = [numero1, numero2, numero3].sort(function (a, b) {
    return a - b;
});

var numerosOrdenadosDescendente = [numero1, numero2, numero3].sort(function (a, b) {
    return b - a;
});

console.log("Números de mayor a menor:", numerosOrdenadosDescendente);
console.log("Números de menor a mayor:", numerosOrdenadosAscendente);

if (numero1 === numero2 && numero2 === numero3) {
    console.log("Los números son iguales.");
} else {
    console.log("Los números no son iguales.");
}
