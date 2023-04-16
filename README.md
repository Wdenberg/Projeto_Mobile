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

### Caso de uso 1: Realizar cadastro.

Descrição: A funcionalidade da tela de cadastro é permitir que novos usuários se registrem na aplicação, fornecendo
seu nome completo, endereço de e-mail e senha.

Fluxo Principal:

1. Os usuários acessam aplicação e selecionam a funcionalidade "Quero me cadastar".
2. A aplicação exibe a tela de cadastro.
3. O usuário preenche os campos que contém: 1.Digite seu nome, 2.Digite seu e-mail e 3.Digite sua senha.
4. A aplicação valida as informações e salva o novo usuário.

Fluxo Alternativo:

Se o usuário digitar o e-mail inválido, senhas não idênticas a aplicação deve exibir uma mensagem de erro indicando qual campo contém 
infomações incorretas. O usuário pode então corrigi-las e finalizar seu cadasto.

### Caso de uso 2: Registrar endereço.

Descrição: A funcionalidade de endereço é permitir que os usuários insiram e armazenem seus endereços pessoais para uso futuro na aplicação.

Fluxo Principal:

1. O usuário navega para a página de endereço e seleciona a opção de adicionar um novo endereço.
2. O usuário insere as informações do endereço, incluindo CEP, Rua, Número da residencia, Bairro, Cidade, Esstado e Complemento.
3. O sistema valida as informações do endereço para garantir que todos os campos obrigatórios foram preenchidos corretamente.
4. O sistema salva o endereço no banco de dados do usuário para uso futuro.

Fluxo Alternativo:

Edição de endereço: Se o usuário precisar editar um endereço existente, ele pode navegar para a página de endereço e selecionar o endereço que deseja editar.
O usuário pode fazer as alterações necessárias e, em seguida, salvar as alterações.

Exclusão de endereço: Se o usuário precisar excluir um endereço existente, ele pode navegar para a página de endereço e selecionar o endereço que deseja excluir.
O usuário pode confirmar a exclusão e o sistema remove o endereço do banco de dados do usuário.

Múltiplos endereços: Alguns sistemas permitem que os usuários armazenem vários endereços para uso futuro.
Nesse caso, o usuário pode adicionar, editar ou excluir um ou mais endereços.

### Caso de Uso 3: Realizar login.

Descrição: A funcionalidade da tela de login é permitir que um usuário acesse a aplicação, por meio da autenticação 
de suas credenciais, como Email de usuário e senha. A tela de login vai incluir campos para inserir essas
informações, também como botões para enviar as informações de login.

Fluxo Principal:

1. O usuário navega para a página de login e insere seu nome de usuário ou endereço de e-mail e senha.
2. O sistema verifica as informações do usuário para determinar se as credenciais são válidas.
3. Se as credenciais forem válidas, o sistema autentica o usuário e concede acesso ao recurso ou funcionalidade solicitado.
4. Se as credenciais não forem válidas, o sistema notifica o usuário de que o login falhou e solicita que ele tente novamente ou redefina sua senha.

Fluxo Alternativo: 

Se o usuário esquecer a senha o sistema oferece a opção de redefini-la. O usupario deve fornecer um endereço 
de e-mail válido para receber uma link para redefinir sua senha. 

### Caso de Uso 4: Listagem do Produto.

Descrição: A funcionalidade de listagem de produtos, irá permitir que os usuários visualizem uma lista de produtos disponíveis para compra.

Fluxo Principal:

1. O usuário navega para a página de listagem de produtos.
2. Sistema recupera os produtos do banco de dados e exibe uma lista de produtos disponíveis para compra, 
geralmente com uma imagem, título, descrição e preço.
3. O usuário pode selecionar um produto para visualizar mais informações ou adicionar o produto ao carrinho.
4. Se o usuário adiciona o produto ao carrinho, o sistema atualiza o carrinho do usuário com o novo item.

Fluxo Alternativo:

O usuário pode clicar na funcionalidade de filtrar e restringir a lista de produto com base 
em seu critério específico. O sistema pode exibir promoções e descontos para produtos específicos ou para toda a loja. 
Os usuários podem ver essas promoções ao navegar pela lista de produtos ou na página de detalhes do produto.


### Caso de Uso 5: Detalhamento do produto.

Decrição: A funcionalidade de detalhamento de produto vai permitir que os usuários visualizem informações detalhadas
sobre o produto antes de decidir se irá finalizar o pedido.

Fluxo principal:

1. Essa funcionalidade inclui uma página exclusiva para cada produto.
2. A aplicação irá exibir a imagem produto com suas descrições detalhadas e o preço do produto.
3. Terá a opção de adicionar mais de uma quantidade do protudo selecionado ou remove-lo.
4. Aplicação também deve conter a opção para adicionar à sacola.

Fluxo Alternativo:

Se o usuário não desejar mais aquele produto selecionado, ele pode clicar na funcionalidade de voltar para a tela de
produtos.

### 6. Realizar vendas do Produto.

Descrição: Essa funcionalidade deve armazenar o produto selecionado diretamente para o carrinho compra fazendo com que o cliente 
possa efetuar a compra do mesmo, onde exibirá o valor total de todos os produtos selecionados.

Fluxo Principal:

1. O usuário adiciona um ou mais produtos ao carrinho de compras
2. O usuário navega para a página de checkout e insere as informações de envio, faturamento e pagamento.
3. O usuário confirma o pedido e o sistema processa o pagamento.
4. O sistema exibe uma página de confirmação do pedido com o número do pedido e um resumo dos itens comprados.

Fluxo Alternativo:

Se o usuário não estiver logado no sistema, ele pode precisar fazer login ou criar uma nova conta antes de realizar a compra.
O sistema pode permitir que os usuários escolham entre diferentes métodos de pagamento, como cartão e dinheiro.

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
```{
  id: id do usuário para procurar ele no banco de dados.
}
```


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

```
{ 
    Id: 22, 
    name: “X-Burguer”, 
    img: "/x-burguer",
} 
```

### Parâmetros:
```{
  id: do Produto para procurar ele no banco de dados.
  name: name do Produto para procurar ele no banco de dados.
}
```


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
```
{
  name: "Gabriel Lima",
  email: "gabriellima42@gmail.com
}
```

### Parâmetros:
```{
   Id: identificado do usuário a ser atualizado. name: nome do usuário.
}
```


### Resposta:
No content! 204


### Delete / User
Esse endpoint é responsável por deletar um user do sistema de banco de dados.
```
{
  id: 1,
  name: "Gabriel Lima",
  email: "gabriellima42@gmail.com
}
```


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