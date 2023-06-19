/* Tipos Utilitários

    O TypeScript vem com um grande número de tipos que podem ajudar com algumas manipulações de tipos comuns, geralmente chamadas de tipos utilitários.

*/

//'Partial' altera todas as propriedades em um objeto para serem opcionais.

interface Point {
    x: number;
    y: number;
}

let pointPart: Partial<Point> = {}; //permite que x e y sejam opcionais
pointPart.x = 33;