# Projeto Compilador

## Visão Geral  
O **Projeto Compilador** foi desenvolvido com o objetivo de aplicar os conceitos fundamentais de **teoria da compilação** e **construção de linguagens de programação**, utilizando **Java** e **ANTLR**.  
O projeto implementa um compilador simples capaz de realizar análise léxica, sintática e semântica, além de gerar código ou executar interpretações básicas.

---

## Tecnologias Utilizadas  
- **Java** — linguagem principal do projeto  
- **ANTLR 4** — para geração automática do analisador léxico e sintático  
- **Maven** ou **Gradle** — para build e gerenciamento de dependências  
- **Git/GitHub** — controle de versão e hospedagem do código  
- **IDE recomendada:** IntelliJ IDEA ou Eclipse  

---
## Funcionalidades  
- Definição da gramática no arquivo `.g4` (ANTLR)  
- Análise léxica e sintática automática  
- Construção de Árvore de Sintaxe Abstrata (AST)  
- Validação semântica (quando aplicável)  
- Interpretação ou geração de código  
- Estrutura modular e expansível para novas regras gramaticais  

## 💻 Como Executar  

### 1. Clonar o repositório  
```bash
git clone https://github.com/julianoacs/Projeto_compilador.git
cd Projeto_compilador/MeuCompilador
```

### 2. Gerar os arquivos do ANTLR  
Se estiver com o ANTLR instalado globalmente:
```bash
antlr4 Forca.g4 -o output
```

Ou, caso use plugin/integração com Maven ou IntelliJ, o processo pode ser automático.

### 3. Compilar o projeto  
```bash
mvn compile
```
ou
```bash
javac -d bin src/**/*.java
```

### 4. Executar o compilador  
```bash
java -cp target/classes com.seuprojeto.Main arquivo_teste.txt
```

> Ajuste o nome do pacote/classe principal conforme a estrutura do seu projeto.

🔹 Etapas internas:  
1. **Lexer:** divide o código em tokens  
2. **Parser:** gera a árvore sintática  
3. **Semântica:** verifica tipos e escopos  
4. **Interpretação:** executa as instruções e gera saída

# Linguagem

## Estrutura de um programa

Um programa em Forca segue a regra `programa`:

```
programa
  : (declaracao | comando)* Fim
```
##  Declarações de variáveis

### Sintaxe

```
declaracao
  : VAR ID ':' tipo ( '=' expressao )? ';'
```

* `VAR` — palavra reservada `var` que inicia a declaração.
* `ID` — identificador da variável (letras, underline e dígitos após a primeira posição).
* `':' tipo` — especifica o tipo da variável.
* `( '=' expressao )?` — inicialização opcional com uma expressão.
* `';'` — final da declaração.

### Exemplos

```
var contador: inteiro;
var pi: real = 3.14;
var saudacao: texto = "Olá, mundo";
```

### Observações

* Não há inferência de tipo: o tipo deve ser declarado explicitamente.
* A inicialização é opcional; se omitida, a variável fica sem valor (dependendo da semântica desejada, pode-se inicializar com valores padrão no analisador semântico: 0 para inteiro, 0.0 para real, "" para texto).

---

## Tipos disponíveis

Definidos pela regra `tipo`:

* `inteiro` — representado pelo token `TIPO_INTEIRO`.
* `real` — representado pelo token `TIPO_REAL`.
* `texto` — representado pelo token `TIPO_TEXTO`.

Esses correspondem aos literais `INT`, `REAL` e `TEXTO` para valores.

---

## Comandos

A regra `comando` aceita vários tipos de instrução:

```
comando
  : atribuicao ';'
  | seCmd
  | enquantoCmd
  | repitaCmd
  | ioCmd ';'
  | PARE ';'
  | CONTINUE ';'
  | bloco
```

### Atribuição

**Sintaxe**: `ID = expressao ;`

Atribui o valor da expressão à variável identificada por `ID`.

Exemplo:

```
contador = contador + 1;
nome = "Juliano";
```

Observação: a checagem de tipos deve ser feita em uma etapa semântica (o parser só verifica a forma). A atribuição entre tipos incompatíveis (por exemplo texto = inteiro) deve gerar erro semântico.

### Comando `se` (if)

**Sintaxe**:

```
seCmd
  : SE '(' expressao ')' bloco (SENAO bloco)?
```

Exemplo:

```
se (idade >= 18) {
  escreva("Maior de idade");
} senao {
  escreva("Menor de idade");
}
```

A expressão no `se` deve produzir um valor booleano (na gramática isso é representado por expressões relacionais e operações lógicas).

### `enquanto` (while)

**Sintaxe**:

```
enquantoCmd
  : ENQUANTO '(' expressao ')' bloco
```

Exemplo:

```
enquanto (contador < 10) {
  escreva(contador);
  contador = contador + 1;
}
```

### `repita ... ate` (do-while)

**Sintaxe**:

```
repitaCmd
  : REPITA bloco ATE '(' expressao ')' ';'
```

Observações:

* O bloco é executado pelo menos uma vez; o laço termina quando a expressão em `ATE` for verdadeira (dependendo da semântica desejada, `ATE` pode testar condição de continuação ou de término — na gramática o nome sugere que a execução se repete até a condição ser satisfeita).
* Note que o comando termina com `;` na gramática (atenção à implementação: fique consistente com a convenção de ponto e vírgula).

Exemplo:

```
repita {
  leia(x);
} ate (x == 0);
```

### Entrada/Saída — `leia` e `escreva`

**Sintaxe**:

```
ioCmd
  : LEIA '(' ID ')'
  | ESCREVA '(' listaArgs? ')'
```

* `leia(ID)` — lê um valor da entrada e atribui a `ID` (presumidamente faz coerção de tipo apropriada).
* `escreva(...)` — imprime um ou mais argumentos separados por vírgula; argumentos são expressões.

Exemplos:

```
leia(nome);
escreva("Valor: ", contador);
```

### `PARE` e `CONTINUE`

* `PARE;` — interrompe o loop mais interno (equivalente a `break`).
* `CONTINUE;` — pula para a próxima iteração do loop (equivalente a `continue`).

Ambos são tokens reservados e terminados com ponto e vírgula.

### Blocos

**Sintaxe**:

```
bloco
  : '{' (comando)* '}'
```

Um bloco contém zero ou mais comandos e delimita um escopo sintático. A semântica pode considerar escopo léxico (variáveis locais) se implementada.

---

## Expressões e precedência

As regras de expressão definem a precedência e associatividade dos operadores.

Ordem (do mais baixo ao mais alto — avaliado por `expressao -> exprOu -> exprE -> exprIgual -> exprRel -> exprAdd -> exprMul -> exprUn -> prim`):

1. **OU** (`ou`) — operador lógico de menor precedência.
2. **E** (`e`) — operador lógico AND.
3. **Igualdade** (`==`, `!=`).
4. **Relacionais** (`<`, `<=`, `>`, `>=`).
5. **Adição / Subtração** (`+`, `-`).
6. **Multiplicação / Divisão / Resto** (`*`, `/`, `%`).
7. **Unários** (`+`, `-`, `!`).
8. **Primários**: parênteses, literais (INT, REAL, TEXTO) e identificadores.

### Exemplos

```
(a + b) * -c
x > 0 e x < 10
!flag ou (a == b)
```

Observação: a gramática usa palavras reservadas `OU` e `E` (tokens) ao invés de `||` e `&&` — a semântica lógica deve tratar `ou` como operador booleano.

---

## Literais

Definidos por `literal`:

* `INT` — sequência de dígitos: `[0-9]+`.
* `REAL` — forma com ponto decimal: `[0-9]+ '.' [0-9]+`.
* `TEXTO` — string entre aspas `"..."`, com suporte a escapes `\`.

Exemplos válidos:

```
123
3.1415
"Olá, \"mundo\""
```

---

## Regras léxicas (tokens)

Lista de tokens reservados e seus lexemas:

* `VAR` : `var`
* `SE` : `se`
* `SENAO` : `senao`
* `ENQUANTO` : `enquanto`
* `REPITA` : `repita`
* `ATE` : `ate`
* `LEIA` : `leia`
* `ESCREVA` : `escreva`
* `PARE` : `pare`
* `CONTINUE` : `continue`
* `TIPO_INTEIRO` : `inteiro`
* `TIPO_REAL` : `real`
* `TIPO_TEXTO` : `texto`
* `OU` : `ou`
* `E` : `e`

Identificador e literais:

* `ID` : `[a-zA-Z_] [a-zA-Z_0-9]*`.
* `REAL` : `[0-9]+ '.' [0-9]+`.
* `INT` : `[0-9]+`.
* `TEXTO` : `"` (conteúdo com escapes) `"`.

Regras de espaço e comentários (ignoradas):

* `ESPACO` : espaços, tabs e quebras de linha são descartados.
* `COMLIN` : comentário de linha `// ...` até o fim da linha.
* `COMBLO` : comentário em bloco `/* ... */` (modo `.*?` não guloso para corresponder).

> Atenção: a regra `REAL` aparece duas vezes — como token léxico e também como nome de regra de parser. No lexer, `REAL` define números de ponto flutuante; na sintaxe de tipos o token `TIPO_REAL` representa a palavra reservada `real`. Evite colisão de nomes na implementação prática (ANTLR diferencia regras maiúsculas como tokens, mas mantenha consistência).

---

## Exemplo de programa completo

```forca
var x: inteiro = 0;
var soma: inteiro = 0;
var linha: texto;

repita {
  leia(linha);
  se (linha == "") {
    pare;
  }
  soma = soma + 1;
} ate (linha == "") ;

escreva("Total de linhas lidas: ", soma);
```

Este exemplo mostra leitura em loop até linha vazia (`""`), contagem e saída.

---

## Pontos de implementação / semântica

* **Verificação de tipo:** o analisador semântico precisa garantir compatibilidade em atribuições, operadores e chamadas de I/O. Por exemplo, `leia(id)` deve validar o tipo de `id` e fazer a conversão apropriada.
* **Operadores booleanos:** `ou` e `e` são palavras reservadas; o analisador deve traduzir para operações booleanas com curto-circuito se desejar.
* **Escopo:** a gramática define blocos; decida se blocos criam escopo léxico (variables locais) e implemente tabela de símbolos aninhada se necessário.
* **Tratamento de `Fim`:** a gramática refere `Fim` como terminador do programa. Em ANTLR normalmente usa-se `EOF`. Garanta que seu parser aceite o final do arquivo.
* **Mensagens de erro:** erros de análise sintática e semântica devem ser claros (linha, coluna, mensagem).

---

## Boas práticas de escrita de código

* Sempre declare variáveis antes de usar.
* Use nomes de variáveis descritivos (p.ex. `contador`, `somaTotal`).
* Evite funções/métodos complexos: a linguagem é minimalista e pensada para aprendizado/propósito específico.
* Comentários: use `//` para comentários de linha e `/* ... */` para blocos.

---

## Extensões sugeridas

* Adicionar tipos compostos (vetores, registros).
* Implementar funções/procedimentos com passagem de parâmetros.
* Suporte a comentários de documentação (docstrings) e anotações de tipo mais ricas.
* Melhorar a semântica de conversão de tipos entre `inteiro`, `real` e `texto`.
