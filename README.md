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

