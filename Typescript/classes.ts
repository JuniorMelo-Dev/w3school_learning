/* Classes em Typescript
    Existem três modificadores de visibilidade principais no TypeScript.

    public - (padrão) permite acesso ao membro da classe de qualquer lugar
    private - só permite acesso ao membro da classe de dentro da classe
    protected - permite acesso ao membro da classe de si mesmo e de quaisquer classes que o herdem

*/

class Pessoa {
    private nome: string;

    public constructor(nome: string) {
        this.nome = nome; //'this' é uma palavra-chave que geralmente se refere à instância da classe
    }

    public getNome(): string {
        return this.nome;
    }
}

const pessoa = new Pessoa("Junior-Dev");
console.log(pessoa.getNome());