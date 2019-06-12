#  NJL Consultoria API

## Visão do projeto
API desenvolvida em JAVA para contemplar as operações de CRUD (Create, Read, Update and Delete) para um objeto usuário.

## Configurando a aplicação

### Requisitos

* Para instalar o JAVA - clique [aqui](https://java.com)

### Executando

1) Dentro da pasta do projeto execute o seguinte comando para instalar as dependências do projeto:

    $ mvn dependency:purge-local-repository

2) Após o comando acima ter sido executado com sucesso, execute o seguinte comando para rodar a aplicação:

    $ mvn clean verify

3) Após o arquivo .jar for criado , vá até a pasta target e execute o comando:
  
    $ java -jar apiJava-0.0.1-SNAPSHOT.jar

4) Quando a aplicação estiver rodando executar o comando abaixo ou acessar diretamente o endereço **http://localhost:8080/api/banks** no navegador:

    $ "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe" -new "127.0.0.1:8080/api/banks"
