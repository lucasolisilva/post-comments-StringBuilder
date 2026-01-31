# Sistema de Posts e Comentários

Este projeto foi desenvolvido para consolidar conceitos de **composição de objetos** e **manipulação eficiente de Strings** em **Java**. O sistema simula uma rede social simplificada, permitindo a criação de postagens com múltiplos comentários associados.

##  Tecnologias e Conceitos Utilizados

* **Composição de Objetos**: Implementação da relação "um-para-muitos", onde um objeto `Post` contém uma lista de objetos `Comment`.
* **StringBuilder**: Utilização da classe `StringBuilder` no método `toString` para garantir alta performance e economia de memória na concatenação de grandes volumes de texto.
* **Manipulação de Datas (`java.time`)**: Uso de `LocalDateTime` para registro cronológico das postagens e `DateTimeFormatter` para exibição personalizada de datas.
* **Coleções (`List` e `ArrayList`)**: Gerenciamento dinâmico de dados, permitindo que cada postagem tenha um número flexível de comentários.
* **Tratamento de Fluxo (Buffer)**: Gerenciamento rigoroso do `Scanner` para evitar o erro de consumo de quebra de linha (`\n`) ao alternar entre leituras numéricas e de texto.

## Como funciona

O programa inicia solicitando a quantidade de postagens a serem registradas. Para cada postagem, o usuário informa o título, o conteúdo, a quantidade de curtidas e a data (seguindo o padrão `dd/MM/yyyy HH:mm`).
Após criar o post, o sistema abre uma sub-rotina para cadastrar quantos comentários forem necessários para aquela publicação específica. Ao final de todas as inserções, o sistema percorre a lista de postagens e utiliza o `StringBuilder` para exibir um relatório detalhado e formatado de cada item na tela.
