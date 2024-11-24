# Sistema de Gerenciamento de Veículos

Este projeto em Java simula um sistema de gerenciamento de veículos utilizando os conceitos de **herança**, **classes abstratas** e **métodos de acesso (getters e setters)**. O sistema é composto por uma classe abstrata `Veiculo` e duas subclasses: `Carro` e `Moto`. O código permite criar objetos dessas subclasses e exibir as informações de cada veículo.

## Estrutura do Projeto

O sistema é dividido nas seguintes classes:

1. **Veiculo.java**: Classe abstrata que define os atributos comuns de todos os veículos (marca, modelo, ano) e um método abstrato para exibir as informações do veículo.
2. **Carro.java**: Classe que herda de `Veiculo` e implementa o método abstrato para exibir as informações do carro.
3. **Moto.java**: Classe que herda de `Veiculo` e implementa o método abstrato para exibir as informações da moto, com um atributo adicional: `cilindrada`.
4. **Main.java**: Classe principal que instancia objetos de `Carro` e `Moto`, define seus atributos e exibe as informações de cada veículo.

## Como Rodar o Projeto

### Pré-requisitos

- [Java JDK 8 ou superior](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado.

### Passos para Compilar e Executar

1. Clone o repositório ou baixe os arquivos `Veiculo.java`, `Carro.java`, `Moto.java` e `Main.java`.
   
2. Abra o terminal/linha de comando e navegue até o diretório onde os arquivos estão salvos.

3. Compile as classes:

    ```bash
    javac Veiculo.java Carro.java Moto.java Main.java
    ```

4. Execute o programa:

    ```bash
    java Main
    ```

### Exemplo de Saída

Ao executar o programa, você verá as informações dos veículos no console


## Explicação do Código

### 1. Classe `Veiculo` (Abstrata)

A classe `Veiculo` é uma classe abstrata que serve como base para as subclasses `Carro` e `Moto`. Ela contém:
- Atributos:
  - `marca` (público): A marca do veículo.
  - `modelo` (público): O modelo do veículo.
  - `ano` (privado): O ano de fabricação do veículo.
- Métodos:
  - `informacoesVeiculo()` (abstrato): Um método que deve ser implementado pelas subclasses para exibir as informações do veículo.
  - Métodos `getAno()` e `setAno(int ano)`: Para acessar e modificar o atributo `ano`.

### 2. Classe `Carro`

A classe `Carro` herda de `Veiculo` e implementa o método `informacoesVeiculo()` retornando as informações específicas do carro, incluindo o número de portas:
- Atributo:
  - `numeroPortas` (público): O número de portas do carro.
- Implementação do método `informacoesVeiculo()` para exibir as informações do carro.

### 3. Classe `Moto`

A classe `Moto` também herda de `Veiculo` e implementa o método `informacoesVeiculo()`. Além disso, a moto tem um atributo adicional, a `cilindrada`:
- Atributos:
  - `cilindrada` (privado): A cilindrada do motor da moto.
- Métodos:
  - `getCilindrada()` e `setCilindrada(int cilindrada)`: Métodos para acessar e modificar o valor da cilindrada.

### 4. Classe `Main`

A classe `Main` é onde o programa é executado:
- Instancia objetos das classes `Carro` e `Moto`.
- Define os valores para os atributos dos veículos usando os setters.
- Exibe as informações de cada veículo chamando o método `informacoesVeiculo()`.


