/* Tipos de Objetos
    Tipos de objeto como esse também podem ser escritos separadamente e, até mesmo, serem reutilizados
*/

const carro: { tipo: string, modelo: string, ano: number } = {
    tipo: "Fiat",
    modelo: "Siena",
    ano: 2013
};
console.log(carro);

//Inferencia de Tipo
//TypeScript pode inferir os tipos de propriedades com base em seus valores.
const carro2 = {
    tipo: "Fiat",
};
carro2.tipo = "Ford";
console.log(carro2);

//Propriedade Opcional
//Propriedades opcionais(?) são propriedades que não precisam ser definidas na definição do objeto.
const carro3: { tipo: string, km?: number } = {
    tipo: "Toyota"
};
carro3.km = 100200;
console.log(carro3);

