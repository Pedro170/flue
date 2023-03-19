# FLUER

Uma API que permite o encontro entre um tradutor nativo e alguém que precisa traduzir um texto para uma reunião, escoa e etc.

## Endpoints

- Cadastro Usuário
  - [Cadastrar](#cadastrar-pessoa)
  - [Listar todos](#listar-usuários)
  - [Detalhar usuário](#detalhar-usuário)
  - [Atualizar usuário](#atualizar-usuário)
  - [Apagar](#excluir-usuário)

## Cadastrar pessoa
**`POST`** /fluer/api/cadastro

| campo | tipo | obrigatório | descrição |
| ----- | ---- | :-----------: | --------- |
| id_pessoa | String | sim | É o id da pessoa previamente cadastrada |
| nome | String | sim | É o nome da pessoa completo |
| email | String | sim | é o email da pessoa, para ser usado com validador |
| usuario | String | sim | É o nome da pessoa |
| ativo | Boolean | sim | O usuário está ativo |


```json
{
  "id_pessoa": 1,
  "nome":"João Pedro",
  "email":"joao@joao.com.br",
  "usuario" : "joao123",
  "idiomas": ["inglês", "alemão", "frances"],
  "ativo": true
}
```

## Códigos de Resposta

| código | descrição |
| ------ | ---------- |
| 201 | Criado com sucesso |
| 400 | erro na validação dos dados da requisição |

# Listar Usuários
**`GET`** /fluer/api/usuario

```json
[
  {
  "id_pessoa": 1,
  "nome":"João Pedro",
  "email":"joao@joao.com.br",
  "usuario" : "joao123",
  "idiomas": ["inglês", "alemão", "frances"]
  },
  {
    "id_pessoa": 2,
    "nome":"Ricardo Gomes",
    "email":"ricardo@gomes.com.br",
    "usuario" : "123ricardo",
    "idiomas": ["húngaro", "sueco", "russo"]
  },
  {
    "id_pessoa": 3,
    "nome":"Maria Cecília ",
    "email":"maria.cecilia@com.br",
    "usuario" : "cecilia125",
    "idiomas": ["polonês", "espanhol", "croata"]
  }
],
```

### Código de Responsta

| código | descrição |
| ------ | ---------- |
| 200 | dados retornados no corpo da resposta |
| 500 | erro no servidor |

# Detalhar Usuário

**`GET`** /fluer/api/usuario/{id_usuario}

```json
{
  "id_pessoa": 1,
  "nome":"João Pedro",
  "email":"joao@joao.com.br",
  "usuario" : "joao123",
  "idiomas": ["inglês", "alemão", "frances"]
}
```

### Código de Responsta
| 200 | dados retornados no corpo da resposta |
| 404 | não foi encontrado usuário com o id informado |

# Atualizar Usuário
**`PUT`** /fluer/api/usuario/{ id_usuario }

```json
{
  "id_pessoa": 2,
  "nome":"Ricardo Gomes da Silva",
  "idiomas": ["húngaro", "sueco", "russo", "filandês"]
}
```
### Códigos de Resposta

| 200 | dados retornados no corpo da resposta |
| 400 | bad request, deve ser informado o id do usuário |

# Excluir Usuário
**`DELETE`** /fluer/api/usuario/{ id_usuario }

### Códigos de Resposta
| 204 | usuário recebe false e se torna inativo no sistema retornando a mensagem sem conteúdo |
