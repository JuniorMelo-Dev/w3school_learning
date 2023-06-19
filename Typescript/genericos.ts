/* Genéricos

    Os genéricos permitem a criação de 'variáveis ​​de tipo' que podem ser usadas para criar classes, funções e aliases de tipo que não precisam definir explicitamente os tipos que usam.

    Os genéricos facilitam a escrita de código reutilizável.
*/

//Os genéricos com funções ajudam a criar métodos mais generalizados que representam com mais precisão os tipos usados ​​e retornados.

function criarPar<S, T>(v1: S, v2: T): [S, T] {
    return [v1, v2];
}
console.log(criarPar<string, number>('Hello', 33));