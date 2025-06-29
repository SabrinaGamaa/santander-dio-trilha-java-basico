# 🏦 Simulador de Conta Bancária - DIO / Santander

Projeto simples em Java desenvolvido como parte da **trilha de Java Básico** da [DIO](https://web.dio.me) em parceria com o **Santander**.  
Ele simula a criação de uma conta bancária via terminal, utilizando conceitos básicos da linguagem e boas práticas de programação orientada a objetos.

---

## Funcionalidades

- Solicita dados do cliente via terminal:
    - Número da conta
    - Agência
    - Nome do cliente
    - Valor do depósito inicial
- Cria um objeto do tipo `Conta` com os dados informados
- Exibe uma mensagem de confirmação personalizada com os dados da conta
- Lida com exceções de entrada inválida (por exemplo, strings em vez de números)

---

## 📦 Estrutura do Projeto

```bash
    conta-banco/
    ├── ContaTerminal.java         # Classe principal com a lógica de interação no terminal
    └── entities/
        └── Conta.java             # Classe Conta com atributos, getters/setters e toString()
```

---

## Exemplo de Execução

```text
==== Agencia Bancaria ====
Conta: 1234
Agencia: 0001
Nome Cliente: Sabrina Gama
Digite o valor do seu deposito: 1500.00
```

**Saída:**
```text
Olá Sabrina Gama
Obrigado por criar uma conta em nosso banco! 
Sua agência é 0001
Conta: 1234
Saldo atual: 1500.00
E já está disponível para saque.
```

---

## Tratamento de Erros

- Entrada de tipo errado (ex: letras no lugar de números) gera mensagem de erro amigável:
```text
ERRO: Digitou dados inválidos
Reinicie.
```

- Exceções inesperadas são capturadas com mensagem genérica.

---

## Tecnologias Utilizadas

- Java 21
- IDE IntelliJ
- Terminal ou console integrado da IDE
- Scanner para entrada de dados

---

## Como Executar

1. Clone o repositório:
```bash
    git clone https://github.com/SabrinaGamaa/santander-dio-trilha-java-basico.git
    cd santander-dio-trilha-java-basico/conta-banco
```

2. Compile os arquivos:
```bash
    javac ContaTerminal.java entities/Conta.java
```

3. Execute o programa:
```bash
    java ContaTerminal
```

---

## 👤 Autora

Projeto para Estudo por **Sabrina Gama**  
🔗 [GitHub - @SabrinaGamaa](https://github.com/SabrinaGamaa)

---

## 📚 Créditos

Projeto proposto durante a **trilha Java Básico** da **Digital Innovation One (DIO)** em parceria com o **Santander Bootcamp 2025**.
