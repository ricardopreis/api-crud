# User CRUD API

API REST simples para gerenciamento de usuários, desenvolvida com **Java** e **Spring Boot**.
O projeto implementa operações básicas de **CRUD (Create, Read, Update, Delete)** para estudo de desenvolvimento backend.

## 🚀 Tecnologias utilizadas

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Maven
* MySQL (dependendo da configuração)

## 📌 Funcionalidades

* Criar um usuário
* Listar todos os usuários
* Buscar usuário por ID
* Atualizar dados de um usuário
* Deletar um usuário

## 📂 Estrutura do Projeto

```
src
 └── main
     ├── java
     │   └── controller
     │   └── service
     │   └── repository
     │   └── model
     └── resources
         └── application.properties
```

## 🔗 Endpoints da API

| Método | Endpoint    | Descrição               |
| ------ | ----------- | ----------------------- |
| GET    | /users      | Lista todos os usuários |
| GET    | /users/{id} | Busca usuário por ID    |
| POST   | /users      | Cria um novo usuário    |
| PUT    | /users/{id} | Atualiza um usuário     |
| DELETE | /users/{id} | Remove um usuário       |

## 📥 Exemplo de JSON

### Criar usuário

```json
{
  "name": "João Silva",
  "email": "joao@email.com"
}
```

## ▶️ Como executar o projeto

1. Clone o repositório

```
git clone https://github.com/seu-usuario/nome-do-repositorio.git
```

2. Entre na pasta do projeto

```
cd nome-do-repositorio
```

3. Execute o projeto

```
./mvnw spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:8080
```

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido para **praticar conceitos de API REST com Spring Boot**, incluindo:

* Arquitetura em camadas
* Persistência de dados com JPA
* Estrutura básica de backend

## 👨‍💻 Autor

Desenvolvido por um estudante de **Ciência da Computação**, focado em **Java e desenvolvimento backend**.
