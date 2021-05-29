# Exercício 01: Padrões de Projeto

Professor: João Eduardo Montandon

**Objetivo: Nesta lista, você irá experimentar o uso dos principais padrões de projeto existentes.**

## Padrão Singleton

**Classes presentes no pacote `singleton`**

O padrão de projeto Singleton é utilizado como forma de disponibilizar apenas uma instância de uma determinada classe.
Esse tipo de comportamento é especialmente útil em situações onde um determinado recurso a ser obtido deve ser compartilhado em diferentes partes da aplicação, como gerenciadores de logging.

Altere a classe `singleton.DBConnection` para que sua instância seja disponibilizada por meio de um singleton. 
Para verificar se o exercício foi implementado corretamente, verifique se a mensagem `Same connection? true` é retornada ao executar o método main presente na classe `singleton.Main`.

## Padrão Decorator

**Classes presentes no pacote `decorator`**

A equipe de TI de um aplicativo de gerenciamento de entrega de alimentos entrou em contato requisitando seus serviços.
Eles desejam implementar uma funcionalidade para permitir aos seus usuários incluir os mais variados ingredientes em seus pedidos.
Na solução implementada atualmente, os projetistas criaram uma classe geral denominada `Ingrediente`, e então derivaram uma série de subclasses especificando cada ingrediente de forma concreta, tais como `Ketchup`, `Bacon`, `BancoEKetchup`, etc.
Rapidamente você observou que esse problema é grave, pois o número de classes aumentaria vertiginosamente de acordo com a combinação dos acréscimos.

Ao analisar o problema mais de perto, você percebeu que ele poderia ser tratado pelo padrão decorador.
Implemente uma demonstração desse padrão para os membros da equipe de TI com base no modelo já existente no pacote `decorator`.
Essa implementação deverá conter pelo menos quatro tipos de acréscimo.

## Padrão Strategy

**Classes presentes no pacote `strategy`**

Você foi designado como responsável por desenvolver o módulo para validar senhas de uma biblioteca externa que é mantida pela empresa onde trabalha.
Por se tratar de uma biblioteca que será exposta à comunidade, é de preocupação dos projetistas que o módulo de validação seja genérico o suficiente para aceitar os mais variados métodos de validação, tais como a presença de caracteres alpha-numéricos, tamanho, etc.
Ainda, o módulo deve respeitar o princípio de aberto/fechado para proteger a biblioteca de acessos e modificações indevidas.

Ao estudar o problema, você chegou a conclusão de que essa validação pode ser feita utilizando o padrão strategy.
Implemente este padrão com base nos arquivos já existentes no pacote `strategy`, fornecendo inclusive um exemplo de execução na classe `strategy.Main`.
Seu padrão deverá suportar pelo menos 3 modos diferentes de autenticação, a serem verificados separadamente (um por classe).
Ex.: tamanho, presença de letras maiúsculas, e presença de caracteres especiais.

## Padrão Observer

**Classes presentes no pacote `observer`**

Dado o código do padrão observer presente no pacote `observer`, implemente os trechos que estão faltando.
Execute a classe `observer.Main` para verificar se tudo foi implementado corretamente.