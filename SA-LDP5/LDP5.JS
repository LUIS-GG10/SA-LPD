var numeroSecreto = Math.floor(Math.random() * 100) + 1;
var intentos = [];
var intentoUsuario;

while (true) {
    var input = prompt("Intenta adivinar el número secreto (entre 1 y 100):");

    if (!isNaN(input)) {
        intentoUsuario = parseInt(input);
        intentos.push(intentoUsuario);

        if (intentoUsuario === numeroSecreto) {
            console.log("Felicidades, adivinaste el número secreto.");
            console.log("Lista de números introducidos:", intentos);
            break;
        } else {
            console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
        }
    } else {
        alert("Error: Ingrese un valor numérico válido.");
    }
}
