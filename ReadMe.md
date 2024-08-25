# Projeto de Gestão de Funcionários
Este projeto é um sistema simples de gestão de funcionários, fornecedores e administradores, desenvolvido em Java. Ele demonstra a utilização de herança, encapsulamento e polimorfismo.

## Estrutura do Projeto
O projeto está dividido em pacotes e classes conforme descrito abaixo:

### Pacotes e Classes


- **task1**
    - **Pessoa**: Classe base que representa uma pessoa com nome, endereço e telefone.
    - **Main**: Classe para testar a classe Pessoa.


- **task2**
    - **Fornecedor**: Extende Pessoa e adiciona atributos para valores de crédito e débito, além de métodos para calcular o saldo.
    - **Main**: Classe para testar a classe Fornecedor.


- **task3**
    - **Empregado**: Extende Pessoa e adiciona atributos para código do departamento, salário base e imposto, além de métodos para calcular o salário líquido.
    - **Main**: Classe para testar a classe Empregado.


- **task4**
    - **Administrador**: Extende Empregado e adiciona um atributo para ajuda de custo, além de métodos para calcular o salário total incluindo a ajuda de custo.
    - **Main**: Classe para testar a classe Administrador.


- **task5**
    - **Operario**: Extende Empregado e adiciona atributos para valor de produção e bônus, além de métodos para calcular o salário total incluindo o bônus.
    - **Main**: Classe para testar a classe Operario.


- **task6**
  - **Vendedor**: Extende Empregado e adiciona atributos para valor de vendas e comissão, além de métodos para calcular o salário total incluindo a comissão.
  - **Main**: Classe para testar a classe Vendedor.

## Estrutura de Diretórios
```
src/
├── task1/
│   ├── Pessoa.java
│   └── Main.java
├── task2/
│   ├── Fornecedor.java
│   └── Main.java
├── task3/
│   ├── Empregado.java
│   └── Main.java
├── task4/
│   ├── Administrador.java
│   └── Main.java
├── task5/
│   ├── Operario.java
│   └── Main.java
├── task6/
│   ├── Vendedor.java
│   └── Main.java
├── .gitignore
├── heranca-exercicios.iml
├── lista-heranca.iml
└── pom.xml
```

### Como Executar

- Clone o repositório para sua máquina local.
- Importe o projeto em sua IDE de preferência (Eclipse, IntelliJ, etc.).
- Compile e execute as classes Main de cada pacote para ver os resultados.