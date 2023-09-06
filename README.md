### Bootcamp Santander - DIO Java backened - 2023

# 🪢Projeto - Desafio Controle de Fluxo

É um projeto que visa por em prática, os conceitos que aprendemos sobre controle de fluxo, tratamento de exceções, estruturas condicionais e de repetição.

## 📌 Temas Abordados:

- [x] Estruturas condicionais;
- [x] Estruturas de repetição;
- [x] Estruturas de exceções;
- [x] Exceções customizadas.

## 🤔 Idealizador do projeto
* [Gleyson Sampaio](https://www.linkedin.com/in/glysns/)

## 📚 Sintaxe do desafio Desafio
link: https://github.com/digitalinnovationone/trilha-java-basico/blob/main/desafios/controle-fluxo/README.md

## Projeto

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações, utilizamos o `for` e realizar a impressão no console através do `System.out.println` dos números incrementados.

## 🧱 Estrutura do Projeto

* Criei o projeto `DesafioControleFluxo`.

* Dentro do projeto, criei a classe `Counter.java` para realizar toda a codificação do programa.

* Ainda no projeto, criei a classe `InvalidParametersException`, que representará a exceção de negócio no sistema.


### Estrutura Classe de Exceção

```Java
//Criando a classe de exceção
public class InvalidParametersException extends Exception {
}
```

```Java 
//disparando nossa classe de exceção
if (parameterOne > parameterTwo) {
    throw new InvalidParametersException();
}
```

## 👩🏽‍💻Pessoas Autoras:

<img style='width:130px'  src='https://avatars.githubusercontent.com/u/114631584?v=4' alt='pessoa desenvolvedora'>

<h4>Flávia Santos</h4>

Linkedin: https://www.linkedin.com/in/flavia-santos-dev/
