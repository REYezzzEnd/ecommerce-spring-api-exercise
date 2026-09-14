# ecommerce-spring-api-exercise
# 🛒 E-commerce API

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de clientes, produtos e pedidos.

O projeto tem como objetivo praticar o desenvolvimento de APIs REST, organização em camadas, persistência de dados com JPA/Hibernate, relacionamento entre entidades e git/github.

![Java](https://img.shields.io/badge/Java-21-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=for-the-badge\&logo=springboot\&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge\&logo=spring\&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-8.x-4479A1?style=for-the-badge\&logo=mysql\&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge\&logo=apachemaven\&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge\&logo=postman\&logoColor=white)

---

##  Sobre o projeto

O **E-commerce API** é um projeto desenvolvido para praticar conceitos fundamentais do desenvolvimento backend utilizando Java e Spring Boot.

A aplicação utiliza uma arquitetura organizada em camadas, separando responsabilidades entre **Controllers, Services, Repositories, DTOs e Entities**.

### Objetivos

* Desenvolver uma API REST.
* Praticar operações CRUD.
* Utilizar Spring Data JPA.
* Trabalhar com Hibernate.
* Criar relacionamentos entre entidades.
* Utilizar DTOs para entrada e saída de dados.
* Trabalhar com validação de dados.
* Praticar organização de código.
* Testar endpoints utilizando Postman.
* Aplicar princípios de orientação a objetos e SOLID.

---

Cada camada possui uma responsabilidade específica:

| Camada     | Responsabilidade                     |
| ---------- | ------------------------------------ |
| Controller | Receber e responder requisições HTTP |
| Service    | Concentrar as regras de negócio      |
| Repository | Comunicação com o banco de dados     |
| Entity     | Representar as tabelas do banco      |
| DTO        | Transportar dados entre as camadas   |

---

# Clientes

Atualmente a API possui operações para gerenciamento de clientes.

## Endpoints

|  Método  | Endpoint         | Descrição             |
| :------: | ---------------- | --------------------- |
|  `POST`  | `/clientes`      | Cadastrar cliente     |
|   `GET`  | `/clientes`      | Listar clientes       |
|   `GET`  | `/clientes/{id}` | Buscar cliente por ID |
|   `PUT`  | `/clientes/{id}` | Atualizar cliente     |
| `DELETE` | `/clientes/{id}` | Excluir cliente       |

---

### Endpoints planejados para Produtos

|  Método  | Endpoint         | Descrição         |
| :------: | ---------------- | ----------------- |
|  `POST`  | `/produtos`      | Cadastrar produto |
|   `GET`  | `/produtos`      | Listar produtos   |
|   `GET`  | `/produtos/{id}` | Buscar produto    |
|   `PUT`  | `/produtos/{id}` | Atualizar produto |
| `DELETE` | `/produtos/{id}` | Excluir produto   |


# Tecnologias e conceitos utilizados

### Linguagem

* Java 21

### Framework

* Spring Boot

### Persistência

* Spring Data JPA
* Hibernate
* MySQL

### Ferramentas

* Maven
* IntelliJ IDEA
* Postman
* Git
* GitHub

### Conceitos

* API REST
* CRUD
* DTO
* Repository Pattern
* Service Layer
* Injeção de Dependência
* JPA
* Hibernate
* Relacionamentos entre entidades
* Validação
* HTTP
* SOLID

---


#  Testando com Postman

As requisições da API podem ser testadas utilizando o **Postman**.

Exemplo:

```text
POST http://localhost:8080/clientes
```

Body:

```json
{
    "nome": "Gabriel Reyes",
    "rua": "Rua das Flores",
    "bairro": "Centro",
    "cep": "00000-000",
    "dataNascimento": "2000-05-15"
}
```

---

# O que estou praticando

Este projeto está sendo desenvolvido como forma de aprendizado prático em desenvolvimento backend.

Durante o desenvolvimento estão sendo praticados:

* [x] Java
* [x] Spring Boot
* [x] APIs REST
* [x] CRUD
* [x] Spring Data JPA
* [x] Hibernate
* [x] DTOs
* [x] Relacionamentos JPA
* [x] MySQL
* [x] Postman
* [x] Git/GitHub
* [ ] Tratamento global de exceções
* [ ] Testes automatizados
* [ ] Docker
* [ ] Documentação com Swagger/OpenAPI

---

#  Status do projeto

🟡 **Em desenvolvimento**

Novas funcionalidades, melhorias na arquitetura, validações e testes serão adicionados conforme o projeto evolui.

---

## 👨‍💻 Autor

<p align="center">
  <img src="https://github.com/REYezzzEnd.png" width="120px" style="border-radius: 50%;" alt="Gabriel Reyes Boanova">
</p>

<h3 align="center">Gabriel Reyes Boanova</h3>

<p align="center">
  Estudante de Tecnologia em Sistemas para Internet, com foco em desenvolvimento backend utilizando Java e Spring Boot.
</p>

<p align="center">
  <a href="https://www.linkedin.com/in/gabriel-reyes-boanova-a32a19331/">
    <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn">
  </a>
</p>

