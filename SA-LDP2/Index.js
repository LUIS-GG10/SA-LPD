var temperaturaCelsius;

while (true) {
    var input = prompt("Ingrese la temperatura en grados Celsius:");

    if (!isNaN(input)) {
        temperaturaCelsius = parseFloat(input);
        break;
    } else {
        alert("Error: Ingrese un valor numérico válido.");
    }
}

var temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
var temperaturaKelvin = temperaturaCelsius + 273.15;

console.log("Temperatura en grados Fahrenheit:", temperaturaFahrenheit);
console.log("Temperatura en Kelvin:", temperaturaKelvin);
