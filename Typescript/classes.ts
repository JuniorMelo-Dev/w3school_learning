/* Herança em Typescript
    As interfaces podem ser usadas para definir o tipo que uma classe deve seguir por meio da palavra-chave 'implements'

*/

interface Forma {
    getArea: () => number;
}

class Retangulo implements Forma {
    //'readonly' é uma palavra-chave para impedir que os membros da classe sejam alterados
    public constructor(protected readonly largura: number, protected readonly altura: number) {}

    public getArea(): number {
        return this.largura * this.altura;
    }
}

//Extendendo Herança
class Quadrado extends Retangulo {
    public constructor(largura: number) {
        super(largura, largura);
    }
    //Quadrado é herdado de Retangulo
}

 const meuQuadadro = new Quadrado(35);
 console.log(meuQuadadro.getArea());