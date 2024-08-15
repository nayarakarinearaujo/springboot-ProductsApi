# **Products API RESTful**

## **Visão Geral do Projeto**

O projeto "Products API RESTful" foi desenvolvido como uma aplicação prática para consolidar conhecimentos em Spring Boot 3 e no ecossistema Spring. A API é responsável por gerenciar produtos, fornecendo funcionalidades completas de CRUD (Create, Read, Update, Delete) e implementando o conceito de HATEOAS para enriquecer as respostas com hipermídias.

## **Objetivo do Projeto**

O objetivo principal deste projeto é aprimorar habilidades em desenvolvimento de APIs RESTful com Spring Boot, incluindo o uso de boas práticas de programação, integração com banco de dados relacional (MySQL), e a implementação de funcionalidades avançadas como HATEOAS.

## **Componentes Principais**

### **1. Modelagem de Dados**
- **Entidade Product**: Representa o produto, contendo atributos como ID, nome, descrição, preço e quantidade.
- **JPA**: Utilizado para mapeamento objeto-relacional (ORM), simplificando a interação com o banco de dados MySQL.

### **2. Repositório**
- **JpaRepository**: Interface que facilita a implementação de operações CRUD no banco de dados, como salvar, buscar, atualizar e deletar produtos.

### **3. Controller**
- **ProductController**: Responsável por lidar com as requisições HTTP, mapeando os endpoints para as operações CRUD e retornando as respostas apropriadas.

### **4. DTO (Data Transfer Object)**
- **ProductRecordDto**: Utilizado para transferir dados de forma segura e estruturada entre as camadas da aplicação, aproveitando os recursos dos Records do Java.

### **5. HATEOAS**
- Implementado para adicionar links dinâmicos nas respostas da API, permitindo uma navegação mais intuitiva entre os recursos disponíveis.

## **Funcionalidades Implementadas**

- **Criação de Produto (POST /products)**: Permite a criação de novos produtos na base de dados.
- **Listagem de Produtos (GET /products)**: Retorna todos os produtos cadastrados.
- **Busca de Produto por ID (GET /products/{id})**: Recupera um produto específico pelo seu ID.
- **Atualização de Produto (PUT /products/{id})**: Atualiza as informações de um produto existente.
- **Deleção de Produto (DELETE /products/{id})**: Remove um produto da base de dados.

## **Ferramentas Utilizadas**

- **Java 17**: Versão do JDK utilizada para o desenvolvimento da aplicação.
- **Spring Boot 3**: Framework principal para a construção da API.
- **Maven**: Gerenciador de dependências e build da aplicação.
- **MySQL**: Banco de dados relacional utilizado para persistir os dados.
- **PgAdmin**: Ferramenta de administração para gerenciar o banco de dados.
- **Postman**: Utilizado para testes de requisições HTTP.
- **IDE: IntelliJ**: Ambiente de desenvolvimento integrado utilizado para codificação.


