Projeto Back-End -- Kotlin --- UNINASSAU


# Wdenberg Ramos - MT: 01559841
# David Jorge -- MT: 01527162
# João Vichtor -- MT: 01528233
# Eduardo Estevão -- MT: 01566933


Aplicação Back-End do B7Burguer - Kotlin, Spring Boot, Mysql, JPA and Hibernate


# LEVANTAMENTO DE REQUISITOS DA APLICAÇÃO MOBLIE E BACK-END.

Sistema Loja Delivery.
Documento de Requisitos: requisitos solicitados pelo cliente, Daivid Leal.

# Requisitos funcionais

1. Realizar cadastro.
```
A funcionalidade da tela de cadastro é permitir que novos usuários se registrem na aplicação, fornecendo seu nome completo, 
endereço de e-mail e senha.
```
2. Registrar endereço.
```
A funcionalidade da tela de registro é permitir que o usuário registre na aplicação informações da sua localização residente.
```
3. Realizar login.
```
A funcionalidade da tela de login é permitir que um usuário acesse a aplicação, por meio da autenticação de suas credenciais, 
como Email de usuário e senha. A tela de login vai incluir campos para inserir essas informações, também como botões para enviar 
as informações de login. 
```
4. Listagem do Produto.
```
Essa funcionalidade vai inclui um carrinho de compras onde os clientes podem adicionar os produtos que desejam comprar

```
5. Realizar vendas do Produto.
```


```


# UML do Mobile

<div align="center">
<img src="https://user-images.githubusercontent.com/88355939/230667826-f4cd8581-431a-4c5a-9ac7-80a43a5389a8.jpeg" 
width="700px"/>
</div>

# UML do BackEnd

<div align="center">
<img src="https://user-images.githubusercontent.com/88355939/230667728-da6492c6-1418-4266-b39d-3ce3fc6142f1.jpeg" 
width="700px"/>
</div>

# LINK DO FIGMA
<a href= "https://www.figma.com/file/6M8Pq62vm6QYPqTsYJBCmf/Ui---B7Delivery?node-id=403-14&t=oVCsS6KFDeuCEaFc-0"> 
click here</a>

# TELA DE LOGIN

<div>
<img src="https://user-images.githubusercontent.com/88355939/230685298-2cae573d-c681-4019-9655-ee8a76df6c65.png">
</div>

# TELA DE CARDAPIO

<div>
<img src="https://user-images.githubusercontent.com/88355939/230685354-d5b60efe-62b1-411c-8b4a-a661d9b0e50f.png">
</div>


# Api / Contrato JSON
## EndPoints
## EndPoint User
### Post/ Authentication
Esse endpoint é responsável por autenticação do usuário.
#### Parâmetros:
email: Email do usuário existente.
password: senha do usuário existente e referente ao e-mail
#### Respostas:
Ok! 200

Exemplo de resposta:
```
{ 

  token: “153584135@48748$4828%5486”  

} 
```
### Get / Users
Esse endpoint é responsável por retornar todos os usuários que têm no sistema

### Parâmetros:
name: name do usuário para procurar ele no banco de dados.

### Resposta:
200! Ok

Exemplo de resposta:

```
[ 
  { 
    Id: 1, 
    name: “felipe da silva filho”, 
    email: ”felipe48@gmail.com”, 
  }, 
  { 
    Id: 2, 
    name: “lucas da silva filho”, 
    email: ”lucas779@gmail.com”, 
  } 
] 
```
### Get / User
Esse endpoint é responsável por retornar os dados do usuário a partir do id.

### Parâmetros:
id: id do usuário para procurar ele no banco de dados.

### Resposta:
200! Ok

Exemplo de resposta:

```
{ 
    Id: 1, 
    name: “felipe da silva filho”, 
    email: ”felipe48@gmail.com”,
 
} 
```

### Get / Produtos
Esse endpoint é responsável por retornar todos os Produtos que têm no sistema

### Parâmetros:
id: do Produto para procurar ele no banco de dados.
name: name do Produto para procurar ele no banco de dados.

### Resposta:
200! Ok

### Post / Produto
Esse endpoint é responsável por criar um Produto no sistema.

### Parâmetros:

Exemplo de resposta:

```
  {
    name: nome do Produto
    id: indetificação do Produto
    img: imagem do Produto
    descrição: e a descrição do produto
  } 

```
### Resposta:
Created! 201

Exemplo de resposta:

```
{ 

  response: “user successfully saved” 

} 
```

### Put/ User
Esse endpoint é responsável por atualizar os dados do usuário no sistema de banco de dados.

### Parâmetros:
Id: identificado do usuário a ser atualizado. name: nome do usuário.

### Resposta:
No content! 204


### Put/ Produto
Esse endpoint é responsável por atualizar os dados do Produto no sistema de banco de dados.

Parâmetros:

Exemplo de resposta:

```
{
  Id: identificado do Produto a ser atualizado.
  name: nome do Produto.
  img: imagem do Produto
  descrição: e a descrição do Produto
}
```

### Resposta:
No content! 204

### Delete / User
Esse endpoint é responsável por deletar um user do sistema de banco de dados.

### Parâmetros:

Exemplo de resposta:

```
{
  Id: para identificar o usuário que será removido.
}
```

### Resposta:
Ok! 200

Exemplo de resposta:

```
{ 
  response: “Sucessfully deleted user” 
}  
```
### Delete / Produto
Esse endpoint é responsável por deletar um user do sistema de banco de dados.

### Parâmetros:

```
{
  
  Id: para identificar o Produto que será removido.

}
```

### Resposta:
Ok! 200

Exemplo de resposta:

```
{ 
  response: “Sucessfully deleted user” 
} 
```
### Get / Location/:id
Esse endpoint é responsável retorna os dados da localização do Usuario com base no ID fornecido.

### Parâmetros:
user_id: refere-se ao usuário que deseja usar essas informações de localização para si mesmo.

### Resposta:
Ok! 200

Exemplo de resposta:

```
{ 

  Id: 1, 
  city: “cidade do cabo”, 
  state: Stade, 
  country: “Brasil”, 
  user_id: 1 
} 
```

### Post/ Location
Esse endpoint é responsável por enviar os dados da localização do Ususario para poder salvar no banco de dados.
Parâmetros:

### Resposta:
Ok! 200

Exemplo de resposta:

```
{ 
  response: “data update successsfully” 
} 
```

### Put / Location/:id
Esse endpoint por atualizar os da localização do Endereço de acordo com o ID informado.

### Parâmetros:
Id: Id da localização do endereço será atualizada. city: cidade do Usuario. state: estado do Usuario. country: país do Usuario.

### Resposta:
Ok! 200

Exemplo de resposta:

```
{
  "successful user update"
}
```

### Delete / Location/:id
Esse endpoint por deletar a localização  com o id fornecido.
### Parâmetros:
Id: para indicar a localização que o usuário deseja deletar.

### Resposta:
Ok! 200

Exemplo de resposta:
```
{ 
  response:  ”successsfully deleted location” 
}  
```
