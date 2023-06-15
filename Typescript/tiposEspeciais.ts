/* Tipos Especiais 
    "any" é um tipo que desabilita a verificação de tipos e permite efetivamente que todos os tipos sejam usados.

    "any" pode ser uma maneira útil de superar erros, uma vez que desabilita a verificação de tipos, mas O TypeScript não será capaz de fornecer segurança de tipo e ferramentas que dependem em dados de tipo, como preenchimento automático, não funcionarão. Lembre-se, deve ser evitado a "qualquer" custo...
*/

// Sem usar o tipo 'any'
let u = true; 
u = "string"; //lançara um erro pois a variavel está assinada com o tipo 'boolean'

Math.round(u); //lançara um erro, pois o argumento é do tipo 'boolean' e não está assinado como um tipo 'number'

// Usando o tipo especial 'any'
let v: any = true;
v = "string"; //não lançara erro, pois o tipo any desabilita a verificação

Math.round(v);

