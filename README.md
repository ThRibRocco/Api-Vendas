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
<2> Método: POST </h2>
URL: /user
<2> Campos: </h2>
name
email
password
is_active
cpf_cnpj
<h2> Exemplo de curl: </h2>

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
<h2> Método: PUT </h2>
URL: /user/{id}
<h2> Campos: </h2>
name
email
password
is_active
cpf_cnpj
<h2> Exemplo de curl: </h2>
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
<h2> Método: GET </h2>
URL: /user/{id}
<h2> Exemplo de curl: </h2>


curl --location 'http://localhost:8000/user/1'

## Inativar ou Ativar usuário pelo ID
<h2> Método: PUT </h2>
URL: /user/{id}/status/{status}
<h2> Campos: </h2>
is_active
<h2> Exemplo de curl: </h2>

curl --location --globoff --request POST 'http://localhost:8000/api/users/{id}/status/{is_active}'
