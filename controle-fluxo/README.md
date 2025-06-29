# 🧮 Contador com Tratamento de Exceção

Projeto desenvolvido em **Java** como exercício prático para fixação dos conceitos de **controle de fluxo** (`if`, `else`, `for`) e **tratamento de exceções personalizadas**.

---

## 💡 Visão Geral

O programa solicita dois números inteiros via terminal. Com base nesses valores:

- Se o **segundo número for maior que o primeiro**, o sistema imprime uma sequência de mensagens numeradas, de `1` até a diferença entre os dois valores.
- Se os números forem **iguais** ou o **primeiro número for maior**, é lançada uma **exceção customizada**, chamada `ParametrosInvalidosException`, exibindo uma mensagem de erro adequada.

---

## Exemplo de Execução

**Entrada:**
```text
    Digite o primeiro parâmetro: 5
    Digite o segundo parâmetro: 10
```

**Saída:**
```text
    Imprimindo o número 1  
    Imprimindo o número 2  
    Imprimindo o número 3  
    Imprimindo o número 4  
    Imprimindo o número 5
```

---

## ⚠️ Tratamento de Erros

- Quando os parâmetros são iguais:
```text
    Os parâmetros não podem ser iguais!
```

- Quando o segundo parâmetro é menor que o primeiro:
```text
    O segundo parâmetro deve ser maior que o primeiro!
```

---

## Tecnologias Utilizadas

- Java 21
- IDE IntelliJ
- Terminal para execução com entrada via `Scanner`

---

## Arquivos Principais

- `Contador.java`: Classe principal com o método `main` e a lógica de execução.
- `ParametrosInvalidosException.java`: Classe que define a exceção customizada.

---

## Como Executar

1. Compile os arquivos:
```bash
    javac Contador.java ParametrosInvalidosException.java
```

2. Execute o programa:
```bash
    java Contador
```

---

## 👤 Autora

Projeto para Estudo por **Sabrina Gama**  
👉 [GitHub - @SabrinaGamaa](https://github.com/SabrinaGamaa)

## 📚 Créditos

Projeto proposto durante a **trilha Java Básico** da **Digital Innovation One (DIO)** em parceria com o **Santander Bootcamp 2025**.
