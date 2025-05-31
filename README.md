# PrimeiraJPA

Projeto simples de persistência com Jakarta Persistence (JPA) e Hibernate ORM 6, utilizando Java 17+ e banco de dados em memória (HSQLDB). O objetivo é demonstrar o funcionamento do EntityManager, mapeamento de entidades e transações JPA, com configuração manual via Maven.

---

## Tecnologias utilizadas

- Java 17
- Jakarta Persistence API 3.1
- Hibernate ORM 6.4.4.Final
- HSQLDB (HyperSQL Database)
- Maven

---

## Objetivo

O projeto simula a criação de entidades Java e sua persistência em um banco de dados em memória. Serve como exemplo de configuração mínima do JPA com Jakarta, ideal para estudos e validação de ambiente com versões recentes do JDK.

---

## Estrutura do projeto

src
└── main
├── java
│ └── maventeste
│ ├── Person.java
│ └── Test
---

## Funcionalidades

- Mapeamento de entidade com `@Entity` e `@Id`
- Criação de instâncias Java e persistência com `EntityManager`
- Execução de transações com `begin`, `persist` e `commit`
- Geração automática do schema no banco HSQLDB (modo memória)
- Integração com Maven para build e execução

---

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/PrimeiraJPA.git
e.java
└── resources
└── META-INF
└── persistence.xml

## Resultado esperado

Hibernate: insert into Person (age, city, name, salary, code) values (?, ?, ?, ?, ?)

## Observações

Este projeto foi migrado do javax.persistence para jakarta.persistence para garantir compatibilidade com o JDK 17 e superiores. Caso utilize JDK 21 ou 24, é necessário manter Jakarta e Hibernate atualizados como neste projeto.
