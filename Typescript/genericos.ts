/* Genéricos

    Os genéricos permitem a criação de 'variáveis ​​de tipo' que podem ser usadas para criar classes, funções e aliases de tipo que não precisam definir explicitamente os tipos que usam.

    Os genéricos facilitam a escrita de código reutilizável.
*/

//Os genéricos podem receber valores padrão que se aplicam se nenhum outro valor for especificado ou inferido.

class NomeandoValor<T = string> {
    private _valor: T | undefined;

    constructor(private nome: string) {}

    public setValue(valor: T) {
        this._valor = valor;
    }

    public getValue(): T | undefined {
        return this._valor;
    }

    public toString(): string {
        return `${this.nome}: ${this._valor}`;
    }
}

let valor = new NomeandoValor('meuNumero');
valor.setValue('meuValor');
console.log(valor.toString()); //Saída = meuNumero: meuValor