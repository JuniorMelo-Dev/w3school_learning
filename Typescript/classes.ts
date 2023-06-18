/* Classes Abstratas

    As classes podem ser escritas de forma a permitir que sejam usadas como uma classe base para outras classes sem ter que implementar todos os membros. Isso é feito usando a palavra-chave 'abstract'. Os membros que não foram implementados também usam a palavra-chave 'abstract'.

*/

abstract class Poligono {
    public abstract getArea(): number;

    public toString(): string {
        return `Poligono[area=${this.getArea()}]`;
    }
}

class Retangulo extends Poligono {
    public constructor(protected readonly largura: number, protected readonly altura: number) {
        super();
    }

    public getArea(): number {
        return this.largura * this.altura;
    }
}

const meuRetangulo = new Retangulo(12,28);
console.log(meuRetangulo.getArea());

//Classes abstratas não podem ser instanciadas diretamente, pois não possuem todos os seus membros implementados.