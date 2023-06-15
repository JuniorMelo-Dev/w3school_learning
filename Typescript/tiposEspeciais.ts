/* Tipos Especiais 
    "unknown (desconhecido)" é uma alternativa semelhante, mas mais segura ao tipo any

    O TypeScript impedirá que tipos sejam usados

    'unknown' é melhor usado quando você não sabe o tipo de dados que está sendo digitado. Para adicionar um tipo mais tarde, você precisará convertê-lo.

    Casting é quando usamos a palavra-chave "as" para dizer que a propriedade ou variável é do tipo casted.
*/

let j: unknown = 1;
j = "Junior";
j = {
    executarUmMetodoInexistente: () => {
        console.log("Acho que aqui eu existo");
    }
} as { executarUmMetodoInexistente: () => void }
//Como podemos evitar o erro para o código comentado abaixo quando não sabemos o tipo?
//j.executarUmMetodoInexistente(); //Erro: objeto é do tipo 'unknown'

if (typeof j === 'object' && j !== null) {
    (j as { executarUmMetodoInexistente: Function }).executarUmMetodoInexistente();
}
//Embora tenhamos que lançar várias vezes, podemos fazer uma verificação no se para garantir nosso tipo e ter um casting mais seguro