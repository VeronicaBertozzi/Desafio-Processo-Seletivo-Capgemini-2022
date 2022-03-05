# Desafio-Programa-o-Capgemini-2022
Desafio de programação em processo seletivo da Capgemini

## Desafios:

**Desafio 01:** A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

**Exemplo:**

**Entrada:**
```
arr = [9, 2, 1, 4, 6]
```

**Saída:**
```
4
```

**Desafio 02:** Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

**Exemplo:**

**Entrada:**
```
n = [1, 5, 3, 4, 2]
```

**Saída:**
```
3
```

**Explicação:**

Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].
				
**Desafio 03:** Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

\sqrt{t}<=linha<=coluna<=\sqrt{t}

- Considere T, como o tamanho do texto.
- Se certifique de que linhas x colunas >= .
- Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.
- Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.
Exemplos:


**Exemplo 1)**

**Entrada:**
```
s = tenha um bom dia
```
**Saída:**
```
taoa eum nmd hbi
```

**Explicação:**

Depois de remover os espaços, a string tem 13 caracteres. \sqrt{13} está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:
```
tenh
aumb
omdi
a
```
        O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.


**Exemplo 2)**

**Entrada:**
```
s = ola mundo
```
**Saída:**
```
omd luo an
```
**Explicação:**

        Depois de remover os espaços a string tem 8 caracteres. \sqrt{8} está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:
```
ola
mun
do
```
		
---------------------------------------------------------------------------

## Tecnologias utilizadas
- [x] Java
Linguagem de programação para desenvolvimento da aplicação

-----------------------------------------------------------------------------

## Como utilizar
### Pré requisitos

* Instalar o Kit JDK 11 acesse o site: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR;

* Verificar se o JAVA_HOME está configurado em seu computador;

* Instalar uma IDE de sua preferencia, nesse projeto utilizei o Visual Studio Code (Link para download: https://code.visualstudio.com/download);

* Fazer clone do projeto
```
https://github.com/VeronicaBertozzi/Desafio-Programa-o-Capgemini-2022.git
```
* Entrando na pasta do projeto
```
cd Desafio-Processo-Seletivo-Capgemini-2022
```
* Execute as classes 
----------------------------------------------------------------------
## Estrutura de arquivos
```
 
    |-- Desafio-Processo-Seletivo-Capgemini-2022

    |  |-- .vscode

    |  |-- bin

    |  |-- src

    |  |  |-- QuestaoUm.java

    |  |  |-- QuestaoDois.java

    |  |  |-- QuestaoTres.java
    
    |  |-- Readme.md

```
## Testes Unitários

Segue link do gif feito com os testes unitários.

**Questão 01:**
Esse gif contém um teste unitário de sucesso e um de falha(caso o usuário digite um número par).
https://drive.google.com/file/d/17fQ1DtfxIIjAoluItUh5Kx_VohmTEzlA/view?usp=sharing

**Questão 02:**
Esse gif contém um teste unitário de sucesso.
https://drive.google.com/file/d/16wEj79d4Clkwqs25mZkf5_p2qDWs_QTz/view?usp=sharing

**Questão 03:**
Esse gif contém um teste unitário de sucesso
https://drive.google.com/file/d/1ZkAnni5QsUV114NmxI1BD_OBL08Y3jTh/view?usp=sharing