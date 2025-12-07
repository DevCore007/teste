# ☕ Código-fonte

🔵 O código-fonte do projeto na linguagem de programação Java.

- Arquivos **.form** são *interfaces gráficas* que contém as informações sobre os elementos visuais dos programas.

## 🌍 **Inicializador do programa**

```
./
└── ProjetoPoo.java <-- Classe principal da aplicação, responsável por iniciá-la pela tela de login
```

## 🔐 **Tela de Login**

```
Login/
├── telaFeedBackLogin.form 
├── telaFeedBackLogin.java <-- Exibe o resultado do login: sucesso ou fracasso
├── TelaLogin.form 
└── TelaLogin.java <-- Tela onde se deve inserir o login e a senha (root e toor)
```

## 📎 **Escolher Projeto**

```
EscolhaProjeto/
├── telaEscolhaProjeto.form
└── telaEscolhaProjeto.java <-- Tela iniciada após realizado o login com sucesso; tela de escolha entre os três programas
```

## 📝 **Agenda de Contatos**

```
AgendaContatos/
├── dao/
|   ├── Conexao.java <-- Estabelece a conexão entre o programa e o banco de dados MySQL
|   └── ContatoDAO.java <-- Inserção de dados no banco de dados e acesso à tabela
├── model
|   └── Contato.java <-- Modelo de contatos da agenda
└── view
    ├── telaAgenda.form
    └── telaAgenda.java <-- Agenda telefônica CRUD interativa
```

## ➗ **Calculadora Básica**

```
Calculadora/
├── telaCalculadora.form
└── telaCalculadora.java <-- Calculadora básica interativa
```

## 🌡 **Conversor de temperatura**

```
ConversorTemperatura/
├── telaConversorTemperatura.form
└── telaConversorTemperatura.java <-- Conversor de temperaturas
```