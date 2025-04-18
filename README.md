# API VENDAS

### DOCUMENTAÇÃO

## Resumo do Serviço
 Este é um progama de vendas onde criamos os usuários que seriam os funcionários que realizam as vendas dos produtos, criamos também os produtos com seu preço e quantidade. Para realizar a venda, o usuário adicionará no sistema a quantidade de cada produto que o cliente comprou e o valor que obtiveram de lucro.

## Design de Software
 - SOLID

## Framework
 - SPRING FRAMEWORK

## ORM
 - HIBERNATE

## Tipo de Banco de Dados
- H2 com Spring Boot

## Como usar a aplicação
  Através do Postman, você adicionará os links necessários para realizar o cadastro, a consulta e alteração dos dados do usuário, além de digitar os dados do produto e da compra efetuada pelo cliente. Abaixo, estão alguns exemplos para que você sabia mais sobre as funções da aplicação e como executá-las da melhor maneira.

## Criar Usuário
### Método: POST
URL: /user
### Campos:
name
email
password
is_active
cpf_cnpj
### Exemplo de curl:

curl --location 'http://localhost:8000/api/users' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "password123",
    "is_active": true,
    "cpf_cnpj": "12345678901"
}'

## Atualizar Usuário
### Método: PUT
URL: /user/{id}
### Campos:
name
email
password
is_active
cpf_cnpj
### Exemplo de curl:
curl --location --request PUT 'http://localhost:8000/api/users/1' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "password": "password123",
    "is_active": true,
    "cpf_cnpj": "12345678901"
}'

## Encontrar Usuário pelo ID
### Método: GET 
URL: /user/{id}
### Exemplo de curl:


curl --location 'http://localhost:8000/user/1'

## Inativar ou Ativar usuário pelo ID
### Método: PUT
URL: /user/{id}/status/{status}
### Campos:
is_active
### Exemplo de curl:

curl --location --globoff --request POST 'http://localhost:8000/api/users/{id}/status/{is_active}'
