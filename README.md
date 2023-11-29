# Java Articles - Estudo sobre Builder Pattern

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

Esse projeto foi feito com o propósito de estudo para exemplificar a implementação do padrão de projeto `Builder pattern` para um domínio de meios de publicação de uma **Editora**, no qual possui os seguintes meios de publicações: Blog, Revista e Jornal.

## 🔮 Porquê utilizar o padrão de projeto Builder

A utilização do padrão de projeto `Builder`, diminui a complexidade de criar objetos, deixando o processo de instanciação mais intuitiva e clara. No qual todo o processo de instanciação de objetos é abstraído em métodos de uma classe separada `Builder` define os atributos do objeto em questão e ao mesmo tempo retorna a própria instância do objeto, que pode, por consequência, ter os métodos da classe builder utilizados de forma sequencial

## 🧱 Estrutura do projeto

A aplicação pode testada pela classe principal [Main](./src/main/java/com/brendongomes/pattern/Main.java)

### Interfaces

Foi definido inicialmente as interfaces dentro do pacote `/core`:

- [IArticle](./src/main/java/com/brendongomes/pattern/core/IArticle.java): define o contrato a ser seguido por todos os meios de publicação. São implementados pelas classes: **Blog**, **Magazine** (Revista) e **Newspaper** (Jornal)
- [IArticleBuilder](./src/main/java/com/brendongomes/pattern/core/IArticleBuilder.java): define o contrato a ser seguido pelas classes **Builder**. São implementadas pelas classes Builder: **BlogBuilder**, **MagazineBuilder** e **NewspaperBuilder**

### Classes

Todas as classes principais da regra de negócios herdam de **IArticle**. Que são:

- [Blog](./src/main/java/com/brendongomes/pattern/Blog.java)
- [Magazine](./src/main/java/com/brendongomes/pattern/Magazine.java)
- [Newspaper](./src/main/java/com/brendongomes/pattern/Newspaper.java)

As classes Builder implementam de **IArticleBuilder**, são usadas para abstrair toda a complexidade da criação de classes e diminuir a repetição de código para instanciar as classes e definir seus atributos. Foram definidas dentro do pacote `/builder`:

- [BlogBuilder](./src/main/java/com/brendongomes/pattern/builder/BlogBuilder.java): É a classe Builder da classe Blog
- [MagazineBuilder](./src/main/java/com/brendongomes/pattern/builder/MagazineBuilder.java): É a classe Builder da classe Magazine
- [NewspaperBuilder](./src/main/java/com/brendongomes/pattern/builder/NewspaperBuilder.java): É a classe Builder da classe Newspaper

---

> Observação: o projeto feito com base em um artigo do Marcio Ballem, o artigo pode ser visto [clicando aqui](https://www.mballem.com/post/simplificando-com-builder-pattern-2/)

<h3 align="center">
    Feito com ☕ por <a href="https://github.com/Brendon3578"> Brendon Gomes</a>
</h3>
