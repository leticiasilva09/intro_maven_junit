# Atividade - Maven + JUnit (Java)

Esse repositório contém a resolução de três exercícios usando Java, com gerenciamento de dependências através do Maven e testes
automatizados com JUnit.

---

## Configuração do Projeto

Inicialmente, configurei o ambiente instalando o Maven e integrando-o ao VS Code. Em seguida, criei um projeto Maven usando o archetype `maven-archetype-quickstart`, o que já gerou a estrutura padrão:

-   src/main/java/com/exercicios: código principal
-   src/test/java/com/exercicios: testes

Depois disso, organizei os exercícios em pacotes separados:

com.exercicios.exercicio1
com.exercicios.exercicio2
com.exercicios.exercicio3

Também criei a mesma estrutura dentro da pasta de testes.

---

## Exercício 1 - CalendarDay

### Objetivo:

Criar um método que recebe dia, mês e ano, e retorna o dia da semana correspondente.

### Implementação:

Usei a classe `LocalDate` do Java, que já tem alguns métodos prontos para a manipulação de datas. Além disso, tratei exceções para evitar erros quando a data for inválida (por exemplo, 30 de fevereiro).

### Testes realizados:

-   Data válida
-   Data inválida
-   Ano bissexto (29/02 válido)
-   Ano não bissexto (29/02 inválido)

---

## Exercício 2 - CompareSubstrings

### Objetivo:

Dada uma string e um tamanho `k`, encontrar: - A menor substring (ordem lexicográfica) - A maior substring

### Implementação:

Percorri a string usando um loop e extraí todas as substrings de tamanho `k`. Comparei cada uma usando `compareTo()` para identificar
a menor e a maior.

### Teste realizado:

-   Entrada: `welcometojava`, `k = 3`
-   Saída esperada: `ava`, `wel`

---

## Exercício 3 - ValidateIP

### Objetivo:

Validar se uma string representa um endereço IPv4 válido.

### Implementação:

Usei uma expressão regular (Regex) para validar o formato do IP, garantindo que: - Existem 4 números separados por ponto - Cada número
está entre 0 e 255. Isso tornou o código mais simples.

### Testes realizados:

-   IPs válidos (ex: `192.168.0.1`)
-   IPs inválidos (ex: `256.1.1.1`, strings inválidas, formatos
    incompletos)

---

## Testes com JUnit

Todos os exercícios foram testados usando JUnit. Criei múltiplos testes para cada classe, cobrindo diferentes cenários.

Os testes foram executados com o comando:

```bash
mvn test
```

---

Desenvolvido como atividade acadêmica da disciplia de Teste e Qualidade de Software.
