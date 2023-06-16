/* Enums
    Um 'enum' é uma "classe" especial que representa um grupo de constantes (variáveis imutáveis).

    Ex01 - Enums Numéricos Inicializados
    Você pode definir o valor do primeiro enum numérico e fazer com que ele seja incrementado automaticamente a partir disso

    Ex02 - Enums Numéricos Totalmente Inicializados
    Você pode atribuir valores numéricos exclusivos para cada valor de enum. Em seguida, os valores não serão incrementados automaticamente

*/

//Ex01
enum DirecaoCardinal {
    Norte = 1,
    Leste,
    Sul,
    Oeste
}
//log 1
console.log(DirecaoCardinal.Norte);
//log 4
console.log(DirecaoCardinal.Oeste);

//Ex02
enum StatusCodes {
    NotFound = 404,
    Success = 200,
    Acceptes = 202,
    BadRequest = 400
}
//log 404
console.log(StatusCodes.NotFound);
//log 200
console.log(StatusCodes.Success);

//Ex03
enum DirecaoCardinal2 {
    Norte = 'Norte',
    Leste = 'Leste',
    Sul = 'Sul',
    Oeste = 'Oeste'
};
//log "Norte"
console.log(DirecaoCardinal.Norte);
//log "Leste"
console.log(DirecaoCardinal.Leste);

//Tecnicamente, você pode misturar e combinar valores de enum numérico e de cadeia de caracteres, mas é recomendável não fazê-lo.