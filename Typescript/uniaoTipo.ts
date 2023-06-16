/* União de Tipo
    Os tipos de união são usados quando um valor pode ser mais do que um único tipo.
*/

//Uniao | OU
function mostrarStatusCode(code: string | number) {
    console.log(`Meu status code é ${code}.`);
}
mostrarStatusCode(404);
mostrarStatusCode('404');