/* Tipos Utilitários

    O TypeScript vem com um grande número de tipos que podem ajudar com algumas manipulações de tipos comuns, geralmente chamadas de tipos utilitários.

*/

//'Required' altera todas as propriedades em um objeto para serem necessárias.

interface Carro {
    marca: string;
    modelo: string;
    km?: number;
}

let meuCarro: Required<Carro> = {
    marca: 'Fiat',
    modelo: 'Siena',
    km: 110020 //força 'km' a ser definido
};